package com.mycompany.ciudades;

import java.util.Arrays;
import java.util.Scanner;

public class Ciudades {

    public static void main(String[] args) {
        String lista[] = new String[10];
        
        rellenarCiudades (lista);
        
        Arrays.sort(lista);
        
        imprimirCiudades(lista);
    }
    
    
    public static void rellenarCiudades (String array[]) {
        Scanner sc = new Scanner (System.in);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduzca la ciudad " + (i + 1) + ": ");
            array[i] = sc.nextLine();
        }
    }
    
    
    public static void imprimirCiudades (String array[]) {
        System.out.println("\nLISTA DE CIUDADES");
        System.out.println("--------------------------------------");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
