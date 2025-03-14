package com.mycompany.u5.ej05;

import java.util.*;

/**
 *
 * @author usuario24
 */
public class ManipulandoCadenas {

    public static void main(String[] args) {
        List cadenas = new ArrayList();

        cadenas.add("Vertical");
        cadenas.add("Horizontal");
        cadenas.add("Izquierda");
        cadenas.add("Derecha");
        cadenas.add("Adelante");
        cadenas.add("Atras");
        cadenas.add("Curvo");
        cadenas.add("Recto");
        cadenas.add("Arriba");
        cadenas.add("Abajo");

        System.out.println("Mostrar la lista en mayusculas");

        String cadena;

        Iterator iter = cadenas.iterator();
        System.out.println("");

        while (iter.hasNext()) {
            cadena = (String) iter.next();
            System.out.println(cadena.toUpperCase());
        }

        System.out.println("\nMostrar la lista ordenada");

        Collections.sort(cadenas);

        iter = cadenas.iterator();
        System.out.println("");

        while (iter.hasNext()) {
            cadena = (String) iter.next();
            System.out.println(cadena);
        }

        System.out.println("\nMostrar palabras que empiezan por A");

        iter = cadenas.iterator();
        System.out.println("");

        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.startsWith("A")) {
                System.out.println(cadena);
            }
        }

        System.out.println("\nMostrar palabras que terminan en o");

        iter = cadenas.iterator();
        System.out.println("");

        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.endsWith("o")) {
                System.out.println(cadena);
            }
        }

        System.out.println("\nMostrar palabras que contengan la e");

        iter = cadenas.iterator();
        System.out.println("");

        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.contains("e")) {
                System.out.println(cadena);
            }
        }

        System.out.println("\nMostrar palabras de 5 letras");

        iter = cadenas.iterator();
        System.out.println("");

        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.length() == 5) {
                System.out.println(cadena);
            }
        }

        System.out.println("\nMostrar palabras con mas de 5 letras y que empiezan por A");

        iter = cadenas.iterator();
        System.out.println("");

        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.length() > 5 && cadena.startsWith("A")) {
                System.out.println(cadena);
            }
        }
    }
}
