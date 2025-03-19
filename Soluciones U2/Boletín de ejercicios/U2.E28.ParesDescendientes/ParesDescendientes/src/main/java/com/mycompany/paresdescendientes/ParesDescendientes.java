package com.mycompany.paresdescendientes;

import java.util.Scanner;

public class ParesDescendientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero;
        
        // LECTURA Y VALIDACIÓN DEL NÚMERO:
        do {
            System.out.print("Introduce un número entre 0 y 100: ");
            numero = sc.nextInt();
            
            if (numero < 0 || numero > 100) {
                System.out.println("Número incorrecto.");
            }
        }while(numero < 0 || numero > 100);
        
        System.out.print("Numeros pares entre " + numero + " y 0: ");
        
        while (numero >= 0) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
            numero--;
        }
        
        System.out.println("");
    }
}
