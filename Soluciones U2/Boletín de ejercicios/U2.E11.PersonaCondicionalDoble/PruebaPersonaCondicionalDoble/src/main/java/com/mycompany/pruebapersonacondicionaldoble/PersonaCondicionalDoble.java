package com.mycompany.pruebapersonacondicionaldoble;

public class PersonaCondicionalDoble {
    public int edad, altura, peso;
    boolean estaCasado, tieneTrabajo;

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public boolean isEstaCasado() {
        return estaCasado;
    }

    public boolean isTieneTrabajo() {
        return tieneTrabajo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEstaCasado(boolean estaCasado) {
        this.estaCasado = estaCasado;
    }

    public void setTieneTrabajo(boolean tieneTrabajo) {
        this.tieneTrabajo = tieneTrabajo;
    }
}
