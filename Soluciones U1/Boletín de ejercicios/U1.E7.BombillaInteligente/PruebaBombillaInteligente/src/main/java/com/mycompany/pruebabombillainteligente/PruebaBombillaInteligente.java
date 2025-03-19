package com.mycompany.pruebabombillainteligente;

public class PruebaBombillaInteligente {

    public static void main(String[] args) {
        BombillaInteligente b1 = new BombillaInteligente();
        
        int veces;
        
        b1.encender();
        veces = b1.obtenerNumVecesEncendida();
        System.out.println("Veces que se ha encendido: " + veces);
    }
}
