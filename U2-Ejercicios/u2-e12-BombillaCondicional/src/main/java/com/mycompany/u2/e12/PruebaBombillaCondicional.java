package com.mycompany.u2.e12;

public class PruebaBombillaCondicional {

    public static void main(String[] args) {
        
        //Definimos y creamos el objeto
        var b = new BombillaCondicional();
        
        //Cambiamos la marca
        b.setMarca("Phillips");
        
        //Cambiamos la potencia
        b.setPotencia(100);
        
        //Encender y apagar
        b.encender();
        b.apagar();
        
        //Apagar, encender y encender
        b.apagar();
        b.encender();
        b.encender();
        
        //Apagar e imprimir su estado
        b.apagar();
        b.imprimeEstado();
        
        //Imprimir texto devolviendo el método obtieneNumVecesEncendida().
        System.out.println("La bombilla se ha encendido "
                + b.getNumVecesEncendida() + " veces");
        
    }
}
