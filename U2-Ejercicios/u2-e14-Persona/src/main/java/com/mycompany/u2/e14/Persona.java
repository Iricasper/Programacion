package com.mycompany.u2.e14;

public class Persona {

    //Creamos dos propiedades: Nombre y Edad.
    public String nombre;
    public int edad;

    //Creamos los métodos. Setters y getters.
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
