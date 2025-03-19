package com.mycompany.sumanumeros;

public class SumaNumeros {

    public static void main(String[] args) {
        int[] array = new int[100];
        int suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000 + 1) * (-1);
        }
        
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        
        System.out.println("La suma de todos los elementos del array es " + suma);
    }
}
