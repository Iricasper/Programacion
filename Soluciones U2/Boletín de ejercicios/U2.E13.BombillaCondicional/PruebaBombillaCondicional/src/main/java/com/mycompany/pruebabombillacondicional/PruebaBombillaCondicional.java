package com.mycompany.pruebabombillacondicional;

public class PruebaBombillaCondicional {

    public static void main(String[] args) {
        BombillaCondicional b = new BombillaCondicional();
        
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        
        b.encender();
        b.apagar();
        
        System.out.println("La bombilla se ha encendido " + b.getNumVecesEncendida() +
                           " veces");
        
        b.imprimeEstado();
    }
}
