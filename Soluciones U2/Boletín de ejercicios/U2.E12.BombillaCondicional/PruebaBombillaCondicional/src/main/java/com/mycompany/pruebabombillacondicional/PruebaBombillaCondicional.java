package com.mycompany.pruebabombillacondicional;

public class PruebaBombillaCondicional {

    public static void main(String[] args) {
        BombillaCondicional b = new BombillaCondicional();
        
        b.setMarca("Phillips");
        
        b.setPotencia(100);
        
        b.encender();
        b.apagar();
        
        b.apagar();
        b.encender();
        b.encender();
        
        b.apagar();
        b.imprimeEstado();
        
        System.out.println("La bombilla se ha encendido " + b.getNumVecesEncendida() +
                           " veces");
    }
}
