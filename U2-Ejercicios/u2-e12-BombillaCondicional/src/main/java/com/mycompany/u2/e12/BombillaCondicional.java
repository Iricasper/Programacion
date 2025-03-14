package com.mycompany.u2.e12;

public class BombillaCondicional {

    public String marca;
    public int potencia, numVecesEncendida;
    public boolean encendida;

    public void setMarca(String nuevaMarca) {
        marca = nuevaMarca;
    }

    public void imprimeMarca() {
        System.out.println("La marca es " + marca);
    }

    public void setPotencia(int nuevaPotencia) {
        potencia = nuevaPotencia;
    }

    public void encender() {
        if (encendida) {
            System.out.println("La bombilla ya estaba encendida.");
        } 
        else {
            encendida = true;
            numVecesEncendida++;
        }
    }

    public void apagar() {
        if (!encendida) {
            System.out.println("La bombilla ya estaba apagada.");
        }
        else {
            encendida = false;
        }
    }

    public void imprimeEstado() {
        System.out.println("Encendida? " + encendida);
    }

    public int getNumVecesEncendida() {
        return numVecesEncendida;
    }
}
