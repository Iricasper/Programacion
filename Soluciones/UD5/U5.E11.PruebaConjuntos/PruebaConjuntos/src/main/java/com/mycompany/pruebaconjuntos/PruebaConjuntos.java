package com.mycompany.pruebaconjuntos;

import java.util.*;

public class PruebaConjuntos {

    public static void main(String[] args) {
        Set candidatos = new HashSet();

        candidatos.add("Juan");
        candidatos.add("Ana");
        candidatos.add("Pedro");
        candidatos.add("Rosa");
        candidatos.add("María");
        
        System.out.println("¿El conjunto está vacío?: "+candidatos.isEmpty());
        
        System.out.println("¿Cuántos elementos hay en el conjunto?: "+candidatos.size()+" elementos");
        
        System.out.print("Nos preguntamos si el conjunto contiene el elemento 'Pedro': ");
        System.out.println((candidatos.contains("Pedro") ? "Sí, lo contiene" : "No, no lo contiene"));

        System.out.println("\nCONTENIDO DEL CONJUNTO \"CANDIDATOS\":");
        Iterator iter = candidatos.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next(); 
            System.out.println("Elemento: "+elem);
        }
        
        Set seleccionados = new HashSet();
        
        iter = candidatos.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.contains("a")) {
                seleccionados.add(elem);
            }
        }
        
        System.out.println("\nCONTENIDO DEL CONJUNTO \"SELECCIONADOS\":");
        iter = seleccionados.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next(); 
            System.out.println("Elemento: "+elem);
        }
    }
}
