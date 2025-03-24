package com.mycompany.u5.ej07;

public class Persona implements Comparable {
    
    // Propiedades
    private String nombre, dni;
    private int edad;
    
    // Constructor

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    
    
    // Métodos
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
               ". DNI: " + getDni() +
               ". Edad: " + getEdad() + ".";
    }

    @Override
    public int compareTo(Object o) {
        Persona p = (Persona) o;
        int result = this.edad-p.getEdad();
        if (result == 0) {
            result = this.nombre.compareTo(p.getNombre());
        }
        return result;
    }
}
