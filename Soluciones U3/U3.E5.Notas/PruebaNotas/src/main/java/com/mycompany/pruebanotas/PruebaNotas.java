package com.mycompany.pruebanotas;

import java.util.Scanner;
import java.util.Arrays;


public class PruebaNotas {

    public static void main(String[] args) {
        int notas[] = new int[leerDimension()];
        rellenarArray (notas);
        Arrays.sort (notas);
        imprimirEstadisticas (notas);
    }
    
    
    public static int leerDimension () {
        Scanner sc = new Scanner (System.in);
        int dimension;
        
        do {
            System.out.print("Introduce el número de notas a gestionar (> 0): ");
            dimension = sc.nextInt();
        } while (dimension <= 0);
        
        return dimension;
    }
    
    
    public static void rellenarArray (int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
    }
    
    
    public static void imprimirEstadisticas (int array[]) {
        System.out.println("\nLa nota más baja de la clase es " + array[0]);
        System.out.println("La nota más alta de la clase es " + array[array.length-1]);
    }
}
