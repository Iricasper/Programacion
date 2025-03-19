package com.mycompany.medianotas;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] notas = new int[10];
        int suma = 0;
        
        for (int i = 0; i < notas.length; i++) {
            do{
                System.out.print("Introduzca la nota del alumno " + (i+1) + ": ");
                notas[i] = sc.nextInt();
            }while(notas[i] < 0 || notas[i] > 10);
        }
        
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        
        System.out.println("\nLa nota media de la clase es de " + (double) suma / 10);
    }
}
