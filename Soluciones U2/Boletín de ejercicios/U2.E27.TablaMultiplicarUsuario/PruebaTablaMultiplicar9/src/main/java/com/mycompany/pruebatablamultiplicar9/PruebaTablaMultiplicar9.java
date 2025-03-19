package com.mycompany.pruebatablamultiplicar9;

import java.util.Scanner;

public class PruebaTablaMultiplicar9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int contador = 0;
        int numero;
        
        System.out.print("Introduzca el valor a multiplicar: ");
        numero = sc.nextInt();
        System.out.println("");
        
        while (contador <= 10) {
            System.out.println(contador + " x " + numero + " = " + (contador * numero));
            contador++;
        }
    }
}
