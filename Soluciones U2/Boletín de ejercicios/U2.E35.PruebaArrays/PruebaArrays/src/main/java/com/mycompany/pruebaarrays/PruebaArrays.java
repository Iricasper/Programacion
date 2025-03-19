package com.mycompany.pruebaarrays;

public class PruebaArrays {

    public static void main(String[] args) {
        double notas[] = new double[10];

        notas[1] = 4.3;
        notas[2] = 5.3;
        notas[4] = 5.6;
        notas[6] = 7.8;
        
        System.out.print("Array NOTAS: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(notas[i] + " ");
        }
        
        
        
        System.out.println("Posicion 1: " + notas[0]);
        System.out.println("Posicion 3: " + notas[2]);
        System.out.println("Posicion 5: " + notas[4]);
        System.out.println("Posicion 6: " + notas[5]);
        
        int metrosRecorridos[] = {200, 400, 800, 1500, 42000};
        
        System.out.println("\nArray METROSRECORRIDOS");
        System.out.println("Posicion 1: " + metrosRecorridos[0]);
        System.out.println("Posicion 2: " + metrosRecorridos[1]);
        System.out.println("Posicion 3: " + metrosRecorridos[2]);
        
        //System.out.println("Posicion 20: " + metrosRecorridos[19]);
    }
}
