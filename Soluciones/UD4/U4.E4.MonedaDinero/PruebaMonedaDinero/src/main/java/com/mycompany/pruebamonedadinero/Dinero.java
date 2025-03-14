package com.mycompany.pruebamonedadinero;

public class Dinero {
    private double cantidad;
    private Moneda moneda;

    public Dinero(double cantidad, Moneda moneda) {
        this.cantidad = cantidad;
        this.moneda = moneda;
    }

    public double getCantidad() {
        return cantidad;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    @Override
    public String toString() {
        return cantidad + this.moneda.getSimbolo();
    }
    
}
