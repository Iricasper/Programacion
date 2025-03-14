package com.mycompany.u3.e03;

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

//  Estado del ordenador
//  Los asertos se introducen en cualquier parte del código donde se pueda
//  modificar las propiedades pertinentes. En nuestro caso será en la impresión
//  (para comprobar que los parámetros iniciales son adecuados)
//  y en los getters
    public void imprimeEstado() {
        assert (modelo != null) : "El modelo no puede ser nulo";
        assert (!"".equals(modelo)) : "El modelo no puede estar vacío";
        assert (anioFabricacion > 1900) : "El anio no puede ser < 1900";

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
        assert (modelo != null) : "El modelo no puede ser nulo";
        assert (!"".equals(modelo)) : "El modelo no puede estar vacío";
    }

    public void setAnioFabricacion(int anioFabricacion) {
        assert (anioFabricacion > 1900) : "El anio no puede ser < 1900";
        this.anioFabricacion = anioFabricacion;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

}
