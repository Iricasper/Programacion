/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej05;

/**
 *
 * @author usuario24
 */
public class Articulo {

    // Propiedades
    private int codigo;
    private String nombre;
    private Dinero precio;

    // Constructor
    public Articulo(int codigo, String nombre, Dinero precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Dinero getPrecio() {
        return precio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Dinero precio) {
        this.precio = precio;
    }

    // Métodos
    @Override
    public String toString() {
        return "Articulo "+getCodigo()+" / "+getNombre()+" / "+getPrecio().toString();
    }
}
