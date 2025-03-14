package com.mycompany.manipulandocadenas;

import java.util.*;

public class ManipulandoCadenas {

    public static void main(String[] args) {
        List cadenas = new ArrayList();
        
        cadenas.add("Vertical");
        cadenas.add("Horizontal");
        cadenas.add("Izquierda");
        cadenas.add("Derecha");
        cadenas.add("Adelante");
        cadenas.add("Atrás");
        cadenas.add("Curvo");
        cadenas.add("Recto");
        cadenas.add("Arriba");
        cadenas.add("abajo");
 
        Iterator iter = cadenas.iterator();
        String cadena;
        System.out.println("LISTA DE CADENAS:");
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            System.out.println(cadena.toUpperCase());
        }
        
        Collections.sort(cadenas);
        
        iter = cadenas.iterator();
        System.out.println("\nLISTA ORDENADA DE CADENAS:");
        while (iter.hasNext()) {
            System.out.println((String) iter.next());
        }
        
        iter = cadenas.iterator();
        System.out.println("\nLISTA DE CADENAS QUE EMPIEZAN POR \"A\":");
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.startsWith("A")) {
                System.out.println(cadena);
            }
        }
        
        iter = cadenas.iterator();
        System.out.println("\nLISTA DE CADENAS QUE TERMINAN EN \"o\":");
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.endsWith("o")) {
                System.out.println(cadena);
            }
        }
        
        iter = cadenas.iterator();
        System.out.println("\nLISTA DE CADENAS QUE CONTIENEN \"e\":");
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.contains("e")) {
                System.out.println(cadena);
            }
        }
        
        iter = cadenas.iterator();
        System.out.println("\nLISTA DE CADENAS DE 5 LETRAS:");
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.length() == 5) {
                System.out.println(cadena);
            }
        }
        
        iter = cadenas.iterator();
        System.out.println("\nLISTA DE CADENAS DE MAS 5 LETRAS " +
                           "Y QUE EMPIECEN POR \"A\":");
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.length() > 5 && cadena.startsWith("A")) {
                System.out.println(cadena);
            }
        }
    }
}
