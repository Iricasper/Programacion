/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej05;

/**
 *
 * @author usuario24
 */
public class Dinero {

    // Propiedades
    private double cantidad;
    private Moneda moneda;

    // Constructor
    public Dinero(double cantidad, Moneda moneda) {
        if (cantidad < 0) {
            System.out.println("Advertencia: La cantidad debe ser positiva,"
                    + " se ha cambiado su signo");
        }
        this.cantidad = Math.abs(cantidad);
        this.moneda = moneda;
    }

    // Getters
    public double getCantidad() {
        return cantidad;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    // Métodos

    @Override
    public String toString() {
        return getCantidad()+getMoneda().getSimbolo();
    }
    
    

}
