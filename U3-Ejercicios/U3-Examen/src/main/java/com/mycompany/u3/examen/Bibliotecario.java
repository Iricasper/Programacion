package com.mycompany.u3.examen;

public class Bibliotecario {

    // Propiedades
    private String nombre;
    private String apellidos;
    private double sueldoMensual;
    private int edad;
    private boolean jefe;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        assert (!nombre.equals(""));
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        assert (!apellidos.equals(""));
        this.apellidos = apellidos;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        assert (sueldoMensual >= 1000.8);
        this.sueldoMensual = sueldoMensual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        assert (edad >= 18);
        this.edad = edad;
    }

    public boolean isJefe() {
        return jefe;
    }

    public void setJefe(boolean jefe) {
        this.jefe = jefe;
    }

    // Constructores
    public Bibliotecario(String nombre, String apellidos, double sueldoMensual, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoMensual = sueldoMensual;
        this.edad = edad;
    }

    public Bibliotecario(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoMensual = 1000.8;
        this.edad = edad;
    }

}
