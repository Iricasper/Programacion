package com.mycompany.pruebaordenpersonas;

import java.util.*;

public class PruebaOrdenPersonas {

    public static void main(String[] args) {
        List lista = new ArrayList();
        
        lista.add(new Persona ("Ernesto", "112233", 23));
        lista.add(new Persona ("Carlota", "223344", 23));
        lista.add(new Persona ("Daniela", "334455", 12));
        lista.add(new Persona ("Daniela", "445566", 11));
        
        System.out.println("LISTA:");
        System.out.println(lista);
        
        Collections.sort(lista);
        
        System.out.println("\nLISTA ORDENADA (POR EDAD):");
        System.out.println(lista);
    }
}
