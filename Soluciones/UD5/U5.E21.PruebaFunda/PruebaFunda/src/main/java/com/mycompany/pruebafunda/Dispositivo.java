package com.mycompany.pruebafunda;

public abstract class Dispositivo {
    private String marca;
    private String modelo;
    private double tamanio;
    private boolean estado;

    public Dispositivo(String marca, String modelo, double tamanio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "marca=" + marca + ", modelo=" + modelo + ", tamanio=" + tamanio + ", estado=" + estado + '}';
    }
}
