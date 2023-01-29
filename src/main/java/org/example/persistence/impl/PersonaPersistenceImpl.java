package org.example.persistence.impl;

import org.example.config.DatabaseConfiguration;
import org.example.model.Persona;
import org.example.persistence.PersonaPersistence;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaPersistenceImpl implements PersonaPersistence {

    private final DatabaseConfiguration databaseConfiguration = DatabaseConfiguration.getInstance();

    @Override
    public void guardar(Persona persona) {

        try {

            String sql = "insert into usuarios (nombre, sexo, correo, fecha, codigo) values (?,?,?,?,?)";

            PreparedStatement statement = databaseConfiguration.getConnection().prepareStatement(sql);
            statement.setString(1, persona.getNombre());
            statement.setString(2, persona.getSexo());
            statement.setString(3, persona.getEmail());

            Date dateSQL = new Date(persona.getFechaNacimiento().getTime());

            statement.setDate(4, dateSQL);
            statement.setInt(5, persona.getDni());

            boolean response = statement.execute();
            if (response) {
                System.out.println("Persona Agregado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Persona> personas() {

        List<Persona> personas = new ArrayList<>();

        try {

            String sql = "select * from usuarios";

            PreparedStatement statement = databaseConfiguration.getConnection().prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                var persona = new Persona();
                persona.setIdUsuarios(resultSet.getInt("id_usuarios"));
                persona.setDni(resultSet.getInt("codigo"));
                persona.setNombre(resultSet.getString("nombre"));
                persona.setEmail(resultSet.getString("correo"));
                persona.setSexo(resultSet.getString("sexo"));

                personas.add(persona);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personas;
    }
}
