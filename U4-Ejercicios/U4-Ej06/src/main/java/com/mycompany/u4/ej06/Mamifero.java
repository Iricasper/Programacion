/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej06;

/**
 *
 * @author usuario24
 */
public class Mamifero {

    // Propiedades
    private String nombre;
    private int anioNacimiento;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    // Método
    public void haceRuido() {
        System.out.println("No se que ruido hago. Puedo ser muchas cosas");
    }
}
