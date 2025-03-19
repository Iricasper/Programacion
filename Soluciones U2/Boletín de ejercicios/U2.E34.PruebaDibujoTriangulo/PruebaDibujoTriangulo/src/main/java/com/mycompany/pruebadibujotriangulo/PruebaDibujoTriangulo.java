package com.mycompany.pruebadibujotriangulo;

import java.util.Scanner;

public class PruebaDibujoTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tam;
        
        
        do {
            System.out.print("Dime el tamaño del triángulo (5-30): ");
            tam = sc.nextInt();
        }while(tam < 5 || tam > 30);
        
        System.out.println("");
        
        for (int i = 1; i <= tam; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
