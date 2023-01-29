package org.example.persistence;

import org.example.model.Persona;

import java.util.List;

public interface PersonaPersistence {

    void guardar(Persona persona);

    List<Persona> personas();

}
