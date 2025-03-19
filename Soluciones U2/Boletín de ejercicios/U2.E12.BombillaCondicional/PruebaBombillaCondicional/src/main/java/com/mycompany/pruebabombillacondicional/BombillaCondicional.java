package com.mycompany.pruebabombillacondicional;

public class BombillaCondicional {
    public String marca;
    public int potencia;
    public boolean encendida;
    public int numVecesEncendida;
    
    public void setMarca (String nuevaMarca) {
        marca = nuevaMarca;
    }
    
    public void imprimeMarca() {
        System.out.println("Marca: " + marca);
    }
    
    public void setPotencia (int nuevaPotencia) {
        potencia = nuevaPotencia;
    }
    
    public void imprimePotencia() {
        System.out.println("Potencia: " + potencia);
    }
    
    public void encender() {
        if (encendida) {
            System.out.println("La bombilla ya estaba encendida");
        } else {
            encendida = true;
            numVecesEncendida++;
        }
    }
    
    public void apagar() {
        if (!encendida) {
            System.out.println("La bombilla ya estaba apagada");
        } else {
            encendida = false;
        }
    }
    
    public void imprimeEstado() {
        System.out.println("Encendida?: " + encendida);
    }
    
    public int getNumVecesEncendida () {
        return numVecesEncendida;
    }
}
