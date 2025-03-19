package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
/*
        Dime el primer número: 4 Dime el segundo número: 10 Dime el operador a aplicar: + El resultado de 4+10 es 14 
        */
        Scanner sc = new Scanner (System.in);
        int operando1, operando2;
        char operador;
        
        System.out.print("Dime el primer número: ");
        operando1 = sc.nextInt();
        System.out.print("Dime el segundo número: ");
        operando2 = sc.nextInt();
        System.out.print("Dime el operador a aplicar: ");
        operador = sc.next().charAt(0);
        
        switch (operador) {
            case '+': System.out.println("\nEl resultado de " + operando1 + "+" + operando2
                                          + " es " + (operando1 + operando2));
                      break;
            case '-': System.out.println("\nEl resultado de " + operando1 + "-" + operando2
                                          + " es " + (operando1 - operando2));
                      break;
            case '*': System.out.println("\nEl resultado de " + operando1 + "*" + operando2
                                          + " es " + (operando1 * operando2));
                      break;
            case '/': if (operando2 != 0) {
                            System.out.println("\nEl resultado de " + operando1 + "+" + operando2
                                               + " es " + (operando1 / operando2));
                      } else {
                            System.out.println("No se puede hacer una división entre cero");
                      }
                      break;
            default: System.out.println("\nOperador incorrecto");
        }
    
    }
}
