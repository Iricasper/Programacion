package com.mycompany.pruebaventas;

public class Cliente {
    private String nombre;
    private String dni;
    private String direccionPostal;
    private String email;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
