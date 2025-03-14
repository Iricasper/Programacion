package com.mycompany.u2.e21.bombillamenu;

public class BombillaCondicional3 {
    
    public String marca;
    public int potencia, numVecesEncendida;
    public boolean encendida, fundida;

    public void setMarca(String nuevaMarca) {
        marca = nuevaMarca;
    }

    public void imprimeMarca() {
        System.out.println("La marca es " + marca);
    }

    public void setPotencia(int nuevaPotencia) {
        potencia = nuevaPotencia;
    }

    //Tengo que echarle un vistazo a esto porque son muchas cosas
    public void encender() {
        if (fundida) {
            System.out.println("La bombilla esta fundida y no se puede encender");
        }
        else {
            if (numVecesEncendida >= 5) {
                fundida = true;
            }
            else {
                if (encendida) {
                    System.out.println("La bombilla ya estaba encendida.");
                } else {
                    encendida = true;
                    numVecesEncendida++;
                    if (numVecesEncendida >= 5) {
                        fundida = true;
                        encendida = false;
                        System.out.println("La bombilla se ha fundido");
                    }
                }
            }
        }
    }
    
    public void apagar() {
        if (fundida) {
            System.out.println("La bombilla esta fundida y no se puede apagar");
        }
        else {
            if (!encendida) {
            System.out.println("La bombilla ya estaba apagada.");
            }
            else {
                encendida = false;
            }
        }
    }

    public void imprimeEstado() {
        if (fundida) {
            System.out.println("La bombilla esta fundida");
        }
        else {
            if (encendida) {
                System.out.println("La bombilla esta encendida");
            }
            else {
                System.out.println("La bombilla esta apagada");
            }
        }
    }

    public int getNumVecesEncendida() {
        return numVecesEncendida;
    }
}
