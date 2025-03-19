package com.mycompany.u1.e7bombillainteligente;

public class PruebaBombillaInteligente {
    
    public static void main(String[] args) {
        BombillaInteligente bomb1 = new BombillaInteligente ();
     
        bomb1.imprimeMarca();
        bomb1.imprimePotencia();
        bomb1.cambiaMarca("Phillips");
        bomb1.cambiaPotencia (100);
        bomb1.encender();
        bomb1.apagar();
        bomb1.encender();
        bomb1.imprimeMarca();
        bomb1.imprimePotencia();
        bomb1.imprimeEstado();
        bomb1.obtieneNumVecesEncendida();
        int veces;
        veces = bomb1.obtieneNumVecesEncendida();
        System.out.println("La bombilla se ha encendido " + veces + " veces");
    }
}
