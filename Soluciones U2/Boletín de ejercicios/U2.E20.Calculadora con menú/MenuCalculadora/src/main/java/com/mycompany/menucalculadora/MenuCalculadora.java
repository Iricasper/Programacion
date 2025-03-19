package com.mycompany.menucalculadora;

import java.util.Scanner;

public class MenuCalculadora {

    public static void main(String[] args) {
        // VARIABLES:
        Scanner sc = new Scanner (System.in);
        int operando1, operando2;
        int operador;
        
        
        // PETICIÓN DE DATOS:
        System.out.print("Dime el primer número: ");
        operando1 = sc.nextInt();
        System.out.print("Dime el segundo número: ");
        operando2 = sc.nextInt();
      
        
        // MENÚ Y OPERACIONES:
        do {    
            System.out.println("\nMENÚ DE OPCIONES:");
            System.out.println("0 - SALIR");
            System.out.println("1 - Suma (a+b)");
            System.out.println("2 - Multiplicación (a*b)");
            System.out.println("3 - División entera (a/b)");
            System.out.print("Escoge una opción: ");
            operador = sc.nextInt();
        
            switch (operador) {
                case 0: System.out.println("Aaaadios");
                        break;
                case 1: System.out.println("\nEl resultado de " + operando1 + "+" + operando2
                                              + " es " + (operando1 + operando2));
                        break;
                case 2: System.out.println("\nEl resultado de " + operando1 + "*" + operando2
                                              + " es " + (operando1 * operando2));
                        break;
                case 3: if (operando2 != 0) {
                                System.out.println("\nEl resultado de " + operando1 + "/" + operando2
                                                   + " es " + (operando1 / operando2));
                        } else {
                                System.out.println("No se puede hacer una división entre cero");
                        }
                        break;
            
                default: System.out.println("\nOperador incorrecto");
            }
        } while(operador != 0);
    }
}
