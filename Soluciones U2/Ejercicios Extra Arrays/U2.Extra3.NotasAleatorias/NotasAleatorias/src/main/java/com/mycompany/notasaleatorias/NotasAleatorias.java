package com.mycompany.notasaleatorias;

import java.util.Scanner;

public class NotasAleatorias {

    public static void main(String[] args) {
        int numAlumnos;
        int[] notas;
        int max = -1, min = 101, maxPos = 0, minPos = 0, suma = 0;
        Scanner sc = new Scanner (System.in);
        
        do{
            System.out.print("Introduzca el número de alumnos (>0): ");
            numAlumnos = sc.nextInt();
        }while(numAlumnos <= 0);
        
        notas = new int[numAlumnos];
        
        for (int i = 0; i < numAlumnos; i++) {
            notas[i] = (int) (Math.random() * 101);
        }
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] > max) {
                max = notas[i];
                maxPos = i;
            }
            
            if (notas[i] < min) {
                min = notas[i];
                minPos = i;
            }
            
            suma += notas[i];
        }
        
        System.out.println("La nota más baja de la clase es " + notas[minPos] +
                           " y está en la posición " + (minPos+1) + " del array.");
        System.out.println("La nota más alta de la clase es " + notas[maxPos] +
                           " y está en la posición " + (maxPos+1) + " del array.");
        System.out.println("La nota media de la clase es " + ((double) suma / numAlumnos));
    }
}
