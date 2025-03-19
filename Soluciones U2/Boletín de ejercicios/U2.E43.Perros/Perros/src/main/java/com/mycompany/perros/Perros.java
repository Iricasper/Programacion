package com.mycompany.perros;

import java.util.Scanner;

public class Perros {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] perros = {"Toby", "Rocky", "Filete", "Perruedines", "Torrija"};
        String cadena;
        int pos = -1;
        
        System.out.print("Introduzca un nombre de perro: ");
        cadena = sc.next();
        
        for (int i = 0; i < perros.length; i++) {
            if (perros[i].equalsIgnoreCase(cadena)) {
                pos = i;
                break;
            }
        }
        
        if (pos == -1) {
            System.out.println("El nombre " + cadena + " no está en el TOP 5 de nombres de perros");
        } else {
            System.out.println("El nombre " + cadena + " ocupa el puesto " + (pos+1) + " del TOP 5 de nombres de perros");
        }
        
    }
}
