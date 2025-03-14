/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej1;

/**
 *
 * @author usuario24
 */
public class Persona {

    // Propiedades
    private String nombre;
    private String dni;
    private Coche c;

    // Constructores
    public Persona() {
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Métodos
    public void comprarCoche(Coche nuevoCoche) {
        c = nuevoCoche;
    }

    public void venderCoche() {
        if (c==null) {
        c = null;
        } else {
            System.out.println("Error: la persona no tiene coche");
        }
    }

    public void arrancarCoche() {
        if (c != null) {
            c.arrancar();
        } else {
            System.out.println("Error: la persona no tiene coche");
        }
    }

    public void apagarCoche() {
        if (c != null) {
            c.apagar();
        } else {
            System.out.println("Error: la persona no tiene coche");
        }
    }

    public void recorrerDistancia(double numKm) {
        if (c != null) {
            c.recorrerDistancia(numKm);
        } else {
            System.out.println("Error: la persona no tiene coche");
        }
    }

    public void reponerCombustible(double numLitros) {
        if (c != null) {
            c.reponerCombustible(numLitros);
        } else {
            System.out.println("Error: la persona no tiene coche");
        }
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

    public Coche getC() {
        return c;
    }

}
