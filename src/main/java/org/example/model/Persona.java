package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    private Integer idUsuarios;
    private String nombre;

    private String sexo;
//    private String apellidoPaterno;
//    private String apellidoMaterno;
//    private String estadoCivil;
    private String email;
    private Integer dni;
    private Date fechaNacimiento;
//    private String telefono;

//    public Persona() {
//    }
//
//    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String estadoCivil, String email, String dni, String fechaNacimiento, String telefono) {
//        this.nombre = nombre;
//        this.apellidoPaterno = apellidoPaterno;
//        this.apellidoMaterno = apellidoMaterno;
//        this.estadoCivil = estadoCivil;
//        this.email = email;
//        this.dni = dni;
//        this.fechaNacimiento = fechaNacimiento;
//        this.telefono = telefono;
//    }
//
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getApellidoPaterno() {
//        return apellidoPaterno;
//    }
//
//    public void setApellidoPaterno(String apellidoPaterno) {
//        this.apellidoPaterno = apellidoPaterno;
//    }
//
//    public String getApellidoMaterno() {
//        return apellidoMaterno;
//    }
//
//    public void setApellidoMaterno(String apellidoMaterno) {
//        this.apellidoMaterno = apellidoMaterno;
//    }
//
//    public String getEstadoCivil() {
//        return estadoCivil;
//    }
//
//    public void setEstadoCivil(String estadoCivil) {
//        this.estadoCivil = estadoCivil;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getDni() {
//        return dni;
//    }
//
//    public void setDni(String dni) {
//        this.dni = dni;
//    }
//
//    public String getFechaNacimiento() {
//        return fechaNacimiento;
//    }
//
//    public void setFechaNacimiento(String fechaNacimiento) {
//        this.fechaNacimiento = fechaNacimiento;
//    }
//
//    public String getTelefono() {
//        return telefono;
//    }
//
//    public void setTelefono(String telefono) {
//        this.telefono = telefono;
//    }
//
//    @Override
//    public String toString() {
//        return "Persona{" +
//                "nombre='" + nombre + '\'' +
//                ", apellidoPaterno='" + apellidoPaterno + '\'' +
//                ", apellidoMaterno='" + apellidoMaterno + '\'' +
//                ", estadoCivil='" + estadoCivil + '\'' +
//                ", email='" + email + '\'' +
//                ", dni='" + dni + '\'' +
//                ", fechaNacimiento='" + fechaNacimiento + '\'' +
//                ", telefono='" + telefono + '\'' +
//                '}';
//    }
}
