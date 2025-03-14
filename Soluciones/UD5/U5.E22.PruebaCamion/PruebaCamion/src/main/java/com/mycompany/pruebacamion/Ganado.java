package com.mycompany.pruebacamion;

public class Ganado implements Pesable {

    private double peso;

    public Ganado(double peso) {
        this.peso = peso;
    }
    
    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Ganado{" + "peso=" + peso + '}';
    }

}
