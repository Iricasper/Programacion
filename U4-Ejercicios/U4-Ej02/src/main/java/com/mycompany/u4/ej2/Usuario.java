/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej2;

/**
 *
 * @author usuario24
 */
public class Usuario {
    // Propiedades
    private String nombre;
    private String password;
    private Cliente cliente;
    
    // Constructor

    public Usuario(String nombre, String password, Cliente cliente) {
        this.nombre = nombre;
        this.password = password;
        this.cliente = cliente;
        if (cliente == null) {
            System.out.println("Error: este usuario NO tiene un cliente asociado");
            this.nombre = "error";
            this.password = "error";
        }
    }
    
    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
