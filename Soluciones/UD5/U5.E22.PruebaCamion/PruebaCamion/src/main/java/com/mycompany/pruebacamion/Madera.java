package com.mycompany.pruebacamion;

public class Madera implements Pesable {
    private double peso;

    public Madera(double peso) {
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Madera{" + "peso=" + peso + '}';
    }
    
}
