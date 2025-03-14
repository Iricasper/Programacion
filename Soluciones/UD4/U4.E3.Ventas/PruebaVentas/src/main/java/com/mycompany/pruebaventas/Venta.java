package com.mycompany.pruebaventas;

public class Venta {
    private String fecha;
    private double importe;
    private Cliente cliente;
    private Coche coche;

    public Venta(String fecha, double importe, Cliente cliente, Coche coche) {
        this.fecha = fecha;
        this.importe = importe;
        this.cliente = cliente;
        this.coche = coche;
    }

    public String getFecha() {
        return fecha;
    }

    public double getImporte() {
        return importe;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
    
    
}
