package com.mycompany.tiradas;

public class Tiradas {

    public static void main(String[] args) {
        final int NUM_TIRADAS = 5;
        int array[] = new int[NUM_TIRADAS];
        int apariciones[] = {0, 0, 0, 0, 0, 0};
        int i;
        
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 6) + 1;
        }
        
        for (i = 0; i < array.length; i++) {
            apariciones[array[i] - 1] ++;
        }
        
        System.out.println("Se han analizado " + NUM_TIRADAS + " tiradas de un dado " +
                           "de 6 caras y se obtienen los siguientes resultados:");
        
        for (i = apariciones.length - 1; i >= 0; i--) {
            System.out.println("El número " + (i + 1) + " ha aparecido " + 
                               apariciones[i] + " veces.");
        }
    }
}
