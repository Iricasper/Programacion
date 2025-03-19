package com.mycompany.u2.extra3.notasaleatorias;

import java.util.Scanner;

public class PruebaNotasAleatorias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de alumnos: ");
        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        int max = -1;
        int posMax = -1;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                posMax = i + 1;
            }
        }

        int min = 101;
        int posMin = -1;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                posMin = i + 1;
            }
        }

        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        int media = suma / num;

        System.out.println("La nota mas baja de la clase es " + min
                + " y esta en la posicion " + posMin + " del array.");
        System.out.println("La nota mas alta de la clase es " + max
                + " y esta en la posicion " + posMax + " del array.");
        System.out.println("La nota media de la clase es " + media);
    }
}
