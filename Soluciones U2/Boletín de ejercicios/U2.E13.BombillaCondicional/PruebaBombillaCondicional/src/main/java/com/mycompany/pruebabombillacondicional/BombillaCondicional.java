package com.mycompany.pruebabombillacondicional;

public class BombillaCondicional {
    public String marca;
    public int potencia;
    public boolean encendida;
    public int numVecesEncendida;
    public boolean fundida;

    public void setFundida(boolean fundida) {
        this.fundida = fundida;
    }

    public boolean isFundida() {
        return fundida;
    }
    
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
        if (fundida) {
            System.out.println("La bombilla está fundida y no se puede encender");
        } else {
            numVecesEncendida++;
            if (numVecesEncendida == 10) {
                fundida = true;
            } else {
                if (encendida) {
                    System.out.println("La bombilla ya estaba encendida");
                } else {
                    encendida = true;
                }
            }
        }
    }
    
    public void apagar() {
        if (fundida) {
            System.out.println("La bombilla está fundida y no se puede apagar");
        } else {
            if (!encendida) {
                System.out.println("La bombilla ya estaba apagada");
            } else {
                encendida = false;
            }
        }        
    }
    
    public void imprimeEstado() {
        if (fundida) {
            System.out.println("La bombilla está fundida");
        } else {
            System.out.println("Encendida?: " + encendida);
        }
    }
    
    public int getNumVecesEncendida () {
        return numVecesEncendida;
    }
}
