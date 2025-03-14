package com.mycompany.pruebaordenpersonas;

import java.util.*;


public class Persona implements Comparable {
    private String nombre;
    private String dni;
    private int edad;

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return ("[" + this.getNombre() + " (" + this.getEdad() + " años) - " + this.getDni() + "]");
    }
    
    
    @Override
    public int compareTo (Object obj) { // EJERCICIO 7
        if (this.edad < ((Persona)obj).getEdad()) {
            return -1;
        } else if (this.edad > ((Persona)obj).getEdad()) {
            return 1;
        } else {
            return 0;
        }
    }
    
    
    /*
    @Override
    public int compareTo (Object obj) { // EJERCICIO 8
        if (this.nombre.compareTo(((Persona)obj).getNombre()) < 0) {
            return -1;
        } else if (this.nombre.compareTo(((Persona)obj).getNombre()) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
    */
    
    /*
    @Override
    public int compareTo (Object obj) { // EJERCICIO 9
        if (this.nombre.compareTo(((Persona)obj).getNombre()) < 0) {
            return -1;
        } else if (this.nombre.compareTo(((Persona)obj).getNombre()) > 0) {
            return 1;
        } else {
            if (this.edad < ((Persona)obj).getEdad()) {
                return -1;
            } else if (this.edad > ((Persona)obj).getEdad()) {
                return 1;
            } else {
                return 0;
            }
        }
    }*/
    
    /*
    @Override
    public int compareTo (Object obj) { // EJERCICIO 10
        if (this.edad < ((Persona)obj).getEdad()) {
            return -1;
        } else if (this.edad > ((Persona)obj).getEdad()) {
            return 1;
        } else {
            if (this.nombre.compareTo(((Persona)obj).getNombre()) < 0) {
                return -1;
            } else if (this.nombre.compareTo(((Persona)obj).getNombre()) > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    */
}
