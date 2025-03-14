package com.mycompany.pruebavehiculo;

public class Vehiculo {
    public int numRuedas;
    public double potencia;
    public double litrosEnDeposito;
    public double consumoPorKm;
    public boolean arrancado;
    
    
    public void setNumRuedas(int nuevoNumRuedas) {
        numRuedas = nuevoNumRuedas;
    }

    public void setPotencia (double nuevaPotencia) {
        potencia = nuevaPotencia;
    }
    
    public void setConsumoPorKm (double nuevoConsumoPorKm) {
        consumoPorKm = nuevoConsumoPorKm;
    }

    public void reponerCombustible(double numLitrosRepuesto) {
        litrosEnDeposito = litrosEnDeposito + numLitrosRepuesto;
    }

    public void recorrerDistancia (double numKm) {
        litrosEnDeposito = litrosEnDeposito - (numKm * consumoPorKm);
    }

    public void arrancar() {
        arrancado = true;
    }

    public void apagar() {
        arrancado = false;
    }

    public void imprimeAutonomiaEnKm() {
        double autonomia;
        
        autonomia = litrosEnDeposito / consumoPorKm;
        
        System.out.println("El vehículo consume " + consumoPorKm +
                           " litros/km, tiene " + litrosEnDeposito +
                           " litros en el depósito, así que puede recorrer " + autonomia +
                           " km");
    }

    public void imprimeNumRuedas() {
        System.out.println("El vehículo tiene " + numRuedas + " ruedas.");
    }

    public void imprimePotencia() {
        System.out.println("El vehículo tiene una potencia de " + potencia + " CV.");
    }

    public void imprimeLitrosEnDeposito() {
        System.out.println("El vehículo tiene " + litrosEnDeposito + " litros de combustible" +
                           " en el depósito.");
    }
}
