/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej2;

/**
 *
 * @author usuario24
 */
public class Cliente {
    // Propiedades
    private String nombre;
    private String dni;
    private String direccionPostal;
    private String email;
    private Usuario usuario;
    
    // Constructores

    public Cliente(String nombre, String dni, Usuario usuario) {
        this.nombre = nombre;
        this.dni = dni;
        this.usuario = usuario;
        if (usuario == null) {
            System.out.println("“Advertencia: cliente creado sin usuario asociado");
        }
    }

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
