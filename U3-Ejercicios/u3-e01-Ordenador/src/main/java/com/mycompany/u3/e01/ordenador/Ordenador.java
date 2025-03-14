package com.mycompany.u3.e01.ordenador;

public class Ordenador {

    //Propiedades privadas
    private String marca, modelo;
    private int anioFabricacion;
    private boolean encendido;

    //Métodos
    //Constructores
    public Ordenador() {

    }

    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Ordenador(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    //Estado del ordenador
    public void imprimeEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio de fabricacion: " + anioFabricacion);
        if (encendido) {
            System.out.println("Encendido?: si");
        } else {
            System.out.println("Encendido?: no");
        }
    }

    //Getters y setters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

}
