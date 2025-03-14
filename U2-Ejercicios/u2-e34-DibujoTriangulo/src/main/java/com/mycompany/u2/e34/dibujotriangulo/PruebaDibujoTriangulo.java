package com.mycompany.u2.e34.dibujotriangulo;

import java.util.Scanner;

public class PruebaDibujoTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam, ast, linea = 1;

        do {
            System.out.print("Dime el tamanio del triangulo (5-30): ");
            tam = sc.nextInt();
            if (tam < 5 || tam > 30) {
                System.out.println("Introduce un tamanio valido");
            }
        } while (tam < 5 || tam > 30);

        for (linea = 1; linea<=tam; linea++) {
            System.out.println("");

            for (ast = 1; ast <= linea; ast++) {
                System.out.print("*");
            }
        }
    }
}
