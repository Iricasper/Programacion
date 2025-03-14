package com.mycompany.pruebasucursal;

public class Bibliotecario {
    private String nombre;
    private String apellidos;
    private double sueldo;
    private int edad;
    private boolean jefe;

    public Bibliotecario(String nombre, String apellidos, double sueldo, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
        this.edad = edad;
    }

    public Bibliotecario(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sueldo = 1000.80;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isJefe() {
        return jefe;
    }

    public void setNombre(String nombre) {
        assert (nombre != null && !nombre.equals(""));
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        assert (apellidos != null && !apellidos.equals(""));
        this.apellidos = apellidos;
    }

    public void setSueldo(double sueldo) {
        assert (sueldo >= 1000.80);
        this.sueldo = sueldo;
    }

    public void setEdad(int edad) {
        assert (edad >= 18);
        this.edad = edad;
    }

    public void setJefe(boolean jefe) {
        this.jefe = jefe;
    }
}
