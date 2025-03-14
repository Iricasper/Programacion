package com.mycompany.pruebaanimales;

public class Mamifero {
    private String nombre;
    private int anioNacimiento;

    public String getNombre() {
        return nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    
    public void haceRuido() {
        System.out.println("No sé qué ruido hago. Puedo ser muchas cosas");
    }
}
