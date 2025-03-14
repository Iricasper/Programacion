/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u3.e10.listacontactos;

/**
 *
 * @author XxLok
 */
public class Contacto {
    
    // Propiedades
    private String nombre, apellidos, email;
    private int telefono;
    
    // Constructores
    public Contacto(String nombre, String apellidos, String email, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }

    public Contacto(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public Contacto(String nombre, String apellidos, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        assert (!nombre.isBlank());
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        assert (!apellidos.isBlank());
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        assert (!email.isBlank());
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        assert (telefono > 99999999 && telefono < 1000000000);
        this.telefono = telefono;
    }
    
    // Método de estado
    public String imprimeContacto() {
        return "\nNombre: " + getNombre() +
                ", apellidos: " + getApellidos() +
                ", email: " + getEmail() +
                ", telefono: " + getTelefono();
    }
    
}
