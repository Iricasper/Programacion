package com.mycompany.pruebaconcesionario;

import java.util.Objects;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private int anioFabricacion;
    private double precio;

    public Vehiculo(String marca, String modelo, String matricula, int anioFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }


    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", anioFabricacion=" + anioFabricacion + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.matricula, other.matricula);
    }
}
