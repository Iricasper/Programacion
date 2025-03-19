package com.mycompany.pruebafutbolista;

public class Futbolista {
    private String nombre;
    private String apellidos;
    private int numGoles;
    private double salario;
    private boolean lesionado;
    
    public Futbolista (String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumGoles(int numGoles) {
        if (numGoles < 0) {
            System.out.println("Número de goles incorrecto");
        } else {
            this.numGoles = numGoles;
        }
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Salario incorrecto.");
        } else {
            this.salario = salario;
        }
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public double getSalario() {
        return salario;
    }

    public boolean isLesionado() {
        return lesionado;
    }
    
    public void marcaGol() {
        if (lesionado) {
            System.out.println("Está lesionado, no puede marcar goles");
        } else {
            numGoles++;
        }
    }
    
    public void marcaGol(int numGoles) {
        assert (numGoles > 0) : "El número de goles debe ser un valor positivo";
        if (lesionado) {
            System.out.println("Está lesionado, no puede marcar goles");
        } else {
            this.numGoles += numGoles;
        }
    }
    
    public void golAnulado() {
        if (numGoles == 0) {
            System.out.println("No ha marcado ningún gol todavía");
        } else {
            numGoles--;
        }
    }
    
    public void golAnulado(int numGoles) {
        if (this.numGoles == 0) {
            System.out.println("No ha marcado ningún gol todavía");
        } else {
            if (this.numGoles - numGoles < 0) {
                System.out.println("No lleva marcados tantos goles");
            } else {
                this.numGoles -= numGoles;
            }
        }
    }
}
