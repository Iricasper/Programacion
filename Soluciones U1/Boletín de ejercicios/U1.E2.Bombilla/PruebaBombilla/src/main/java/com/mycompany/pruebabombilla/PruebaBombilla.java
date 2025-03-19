package com.mycompany.pruebabombilla;

public class PruebaBombilla {

    public static void main(String[] args) {

        Bombilla b1;
        b1 = new Bombilla();
        
        b1.imprimeMarca();
        b1.imprimePotencia();
        b1.cambiaMarca("Phillips");
        b1.cambiaPotencia(100);
        b1.encender();
        b1.apagar();
        b1.encender();
        b1.imprimeMarca();
        b1.imprimePotencia();
        b1.imprimeEstado();
    }
}
