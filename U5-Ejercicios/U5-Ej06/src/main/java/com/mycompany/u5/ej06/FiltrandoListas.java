package com.mycompany.u5.ej06;

import java.util.*;

public class FiltrandoListas {

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
        
        String cadena;
        
        // Ordeno la lista
        Collections.sort(cadenas);
        
        // Imprimimos con toString
        System.out.println(cadenas.toString());
        
        // Eliminamos las palabras acabadas en "o" y mostrar el contenido.
        System.out.println("\nEliminamos de la tabla las palabras acabadas en o.");
        Iterator iter = cadenas.iterator();
        
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.endsWith("o")) {
                iter.remove();
            }
        }
        
        iter = cadenas.iterator();
        
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            System.out.println(cadena);
        }
        
        // Eliminar palabras que contengan la letra "t". Mostrar la lista.
        
        iter = cadenas.iterator();
        
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.contains("t")) {
                iter.remove();
            }
        }
        
        System.out.println("\nEliminamos de la lista las palabras que contengan la t.");
        iter = cadenas.iterator();
        
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            System.out.println(cadena);
        }
        
        // Eliminamos las palabras que contengan la letra "a" y que tengan más de 5 letras.
        
        System.out.println("\nEliminamos las que contengan la a y tengan +5 letras.");
        
        iter = cadenas.iterator();
        
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            if (cadena.contains("a") && cadena.length() > 5) {
                iter.remove();
            }
        }
        
        iter = cadenas.iterator();
        
        while (iter.hasNext()) {
            cadena = (String) iter.next();
            System.out.println(cadena);
        }
        
        System.out.println("\nNo nos queda ninguna palabra en la lista.");
    }
}
