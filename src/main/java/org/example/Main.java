package org.example;

import org.example.model.Persona;
import org.example.service.PersonaService;
import org.example.service.impl.PersonaServiceImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var persona = new Persona();
        persona.setDni("001");
        persona.setNombre("Persona 1");
        persona.setApellidoMaterno("Apellido 1");
        persona.setApellidoPaterno("Apellido 2");
        persona.setEmail("persona1@email.com");
        persona.setEstadoCivil("Soltero");
        persona.setTelefono("999000001");

//        PersonaService personaService = new PersonaServiceImpl();
        PersonaService personaService = PersonaServiceImpl.getInstance();
        personaService.crearPersona(persona);

        System.out.println(personaService.listarPersonas());

        System.out.println(personaService.getMessage());

    }
}