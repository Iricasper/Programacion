package com.mycompany.pruebacamion;

public class PruebaCamion {

    public static void main(String[] args) {
        Camion<Ganado> c1 = new Camion<>();
        Camion<Madera> c2 = new Camion<>();
        
        c1.cargar(new Ganado(2000));
        c2.cargar(new Madera(5000));
        
        System.out.println("Descargamos la siguiente mercancía del camión 1:");
        System.out.println(c1.descargar().toString());
        
        System.out.println("Está vacío el camión 1: " + c1.isVacio());
        System.out.println("Está vacío el camión 2: " + c2.isVacio());
    }
}
