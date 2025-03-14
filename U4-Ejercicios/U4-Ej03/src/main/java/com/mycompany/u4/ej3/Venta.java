/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej3;

/**
 *
 * @author usuario24
 */
public class Venta {
    // Propiedades
    private String fecha;
    private double importe;
    private Cliente cliente;
    private Coche coche;
    
    // Constructor
    public Venta(String fecha, double importe, Cliente cliente, Coche coche) {
        this.fecha = fecha;
        this.importe = importe;
        this.cliente = cliente;
        this.coche = coche;
    }
    
    //Setters y Getters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
