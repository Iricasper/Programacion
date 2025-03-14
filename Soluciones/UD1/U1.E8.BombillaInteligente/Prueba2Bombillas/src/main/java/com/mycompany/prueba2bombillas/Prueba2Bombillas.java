package com.mycompany.prueba2bombillas;

public class Prueba2Bombillas {

    public static void main(String[] args) {

        BombillaInteligente b1 = new BombillaInteligente();
        BombillaInteligente b2 = new BombillaInteligente();
        
        int veces;
        
        b1.encender();
        b1.apagar();
        b1.encender();
        b1.apagar();
        b1.encender();
        b1.apagar();
        b2.encender();
        b2.apagar();
        
        veces = b1.obtenerNumVecesEncendida();
        System.out.println("La primera bombilla se ha encendido " + veces + " veces.");
        veces = b2.obtenerNumVecesEncendida();
        System.out.println("La segunda bombilla se ha encendido " + veces + " veces.");
    }
}
