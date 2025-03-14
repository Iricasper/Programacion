package com.mycompany.filtrandolistas;

import java.util.*;

public class FiltrandoListas {

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
        
        Collections.sort(cadenas);
        
        System.out.println(cadenas.toString());
        
        Iterator iter = cadenas.iterator();
        String cadena;
        
        System.out.println("CONTENIDO DE LA COLECCION:");
        while (iter.hasNext()) {
            System.out.println((String) iter.next());
        }
        
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.endsWith("o")) {
                iter.remove();
            }
        }
        
        iter = cadenas.iterator();
        System.out.println("\nCONTENIDO SIN LAS CADENAS QUE TERMINEN EN \"o\":");
        while (iter.hasNext()) {
            System.out.println((String) iter.next());
        }
        
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.contains("t")) {
                iter.remove();
            }
        }
        
        iter = cadenas.iterator();
        System.out.println("\nCONTENIDO SIN LAS CADENAS QUE CONTENGAN ALGUNA \"t\":");
        while (iter.hasNext()) {
            System.out.println((String) iter.next());
        }
        
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.contains("a") && cadena.length() > 5) {
                iter.remove();
            }
        }
        
        iter = cadenas.iterator();
        System.out.println("\nCONTENIDO SIN LAS CADENAS QUE CONTENGAN ALGUNA \"a\" ");
        System.out.println("Y TENGAN UNA LONGITUD SUPERIOR A 5 CARACTERES:");
        while (iter.hasNext()) {
            System.out.println((String) iter.next());
        }
    }
}
