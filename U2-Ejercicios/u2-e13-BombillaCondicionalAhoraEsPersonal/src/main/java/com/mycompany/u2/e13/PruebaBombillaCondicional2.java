package com.mycompany.u2.e13;

public class PruebaBombillaCondicional2 {

    public static void main(String[] args) {
        
        //Deminimos y creamos el objeto de la clase BombillaCondicional2
        BombillaCondicional2 bc = new BombillaCondicional2();
        
        //Encendemos y apagamos 10 veces
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        
        //Apagamos y encendemos para ver los mensajes de aviso de que esta fundida
        bc.apagar();
        bc.encender();
        
        //Imprimir usando el metodo getNumVecesEncendida()
        System.out.println("La bombilla se ha encendido "
                + bc.getNumVecesEncendida() + " veces");
        
        //Usamos el método imprimeEstado
        bc.imprimeEstado();
    }
}
