package com.mycompany.revientacandado;

import java.util.Scanner;

public class RevientaCandado {

    public static void main(String[] args) {
        CandadoNumerico c = new CandadoNumerico();
        Scanner sc = new Scanner (System.in);
        int numero;
        int contador = 0;
        boolean encontrado = false;
        
        do {
            System.out.print("Introduzca el número del candado (0-9999): ");
            numero = sc.nextInt();
            
            if (numero < 0 || numero > 9999) {
                System.out.println("Valor inválido.");
            }
        }while (numero < 0 || numero > 9999);
        
        c.setNumSecreto(numero);
        
        while (!encontrado) {
            if (c.seAbreCon(contador)) {
                System.out.println("Probando con el número " + contador + ": SE ABRIÓ");
                encontrado = true;
            } else {
                System.out.println("Probando con el número " + contador + ": no se abre");
            }
            
            contador++;
        }
    }
}
