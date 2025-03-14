package com.mycompany.u2.extra1.sumanumaleatorios;

public class PruebaSumaNumAleatorios {

    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (1000) + 1) * (-1);
        }
        int suma = 0;
        for (int i : array) {
            suma += i;
        }
        System.out.println("La suma de todos los elementos del array es " + suma);
    }
}
