package org.example.service;

import org.example.model.Persona;

import java.util.List;

public interface PersonaService {

    void crearPersona(Persona persona);
    Persona buscarPersona(String dni);
    List<Persona> listarPersonas();

    default String getMessage() {
        return "Hello World";
    }
}
