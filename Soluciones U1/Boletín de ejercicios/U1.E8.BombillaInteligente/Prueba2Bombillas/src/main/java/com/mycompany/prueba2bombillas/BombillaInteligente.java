package com.mycompany.prueba2bombillas;

public class BombillaInteligente {
    public String marca;
    public int potencia;
    public boolean encendida;
    public int numVecesEncendida;
    
    public void cambiaMarca (String nuevaMarca) {
        marca = nuevaMarca;
    }
    
    public void imprimeMarca() {
        System.out.println("Marca: " + marca);
    }
    
    public void cambiaPotencia (int nuevaPotencia) {
        potencia = nuevaPotencia;
    }
    
    public void imprimePotencia() {
        System.out.println("Potencia: " + potencia);
    }
    
    public void encender() {
        encendida = true;
        numVecesEncendida++;
    }
    
    public void apagar() {
        encendida = true;
    }
    
    public void imprimeEstado() {
        System.out.println("Encendida?: " + encendida);
    }
    
    public int obtenerNumVecesEncendida () {
        return numVecesEncendida;
    }
}
