package com.mycompany.buscarmayor;

public class BuscarMayor {

    public static void main(String[] args) {
        int i;
        int array[] = new int[500];
        int max = -1; // Valor inferior a cualquier valor del array
        
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000001);
        }
        
        for (i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        
        System.out.println("El mayor valor obtenido es " + max);
    }
}
