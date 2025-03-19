package com.mycompany.numerosaleatorios;

public class NumerosAleatorios {

    public static void main(String[] args) {
        int i;
        int array[] = new int[500];
        
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1001);
        }
        
        System.out.print("Números pares y no inferiores a 800: ");
        
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] >= 800) {
                System.out.print(array[i] + " ");
            }
        }
        
        System.out.println("");
    }
}
