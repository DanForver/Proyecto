package org.example.service.impl;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.model.Persona;
import org.example.persistence.PersonaPersistence;
import org.example.persistence.impl.PersonaPersistenceImpl;
import org.example.service.PersonaService;

import java.util.List;

/**
 * Logica de Negocio para la Persona
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PersonaServiceImpl implements PersonaService {

//    protected final List<Persona> personas = new ArrayList<>();

    private final PersonaPersistence personaPersistence = new PersonaPersistenceImpl();


    private static PersonaService personaService = null;

    public static PersonaService getInstance() {
        if (personaService == null) {
            System.out.println("Creando Instancia");
            personaService = new PersonaServiceImpl();
        }
        System.out.println("Retornando Instancia");
        return personaService;
    }

    @Override
    public void crearPersona(Persona persona) {
//        personas.add(persona);
        System.out.println("Se agrego a la persona");

        personaPersistence.guardar(persona);
    }

    @Override
    public Persona buscarPersona(String dni) {
//        for (int i = 0; i < personas.size(); i++) {
////        for (Persona persona: personas) {
//            if (personas.get(i).getDni().equals(dni)) {
//                return personas.get(i);
//            }
//
////            if (persona.getDni().equals(dni)) {
////                return persona;
////            }
//        }
        return null;
    }

    @Override
    public List<Persona> listarPersonas() {
//        return personas;
        return personaPersistence.personas();
    }
}
