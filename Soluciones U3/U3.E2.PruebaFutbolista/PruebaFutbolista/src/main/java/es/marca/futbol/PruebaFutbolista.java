package es.marca.futbol;

import es.marca.futbol.jugadores.Futbolista;

public class PruebaFutbolista {

    public static void main(String[] args) {
        Futbolista f = new Futbolista ("Pepe", "Perez");
        
        f.setNumGoles(-2);
        
        f.setSalario(-100);
        
        f.setSalario(2000);
        System.out.println("Pepe gana " + f.getSalario() + " euros.");
        
        f.golAnulado();
        System.out.println("Pepe lleva " + f.getNumGoles() + " goles.");
        
        f.marcaGol(-2);
        
        f.marcaGol();
        System.out.println("Pepe lleva " + f.getNumGoles() + " goles.");
        
        f.marcaGol(2);
        System.out.println("Pepe lleva " + f.getNumGoles() + " goles.");
        
        f.golAnulado();
        System.out.println("Pepe lleva " + f.getNumGoles() + " goles.");
        
        f.golAnulado(7);
        System.out.println("Pepe lleva " + f.getNumGoles() + " goles.");
    }
}
