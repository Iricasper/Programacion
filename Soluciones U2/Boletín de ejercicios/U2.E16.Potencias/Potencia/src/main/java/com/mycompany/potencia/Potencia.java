package com.mycompany.potencia;

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        
        double base;
        int opcion;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduzca el número base: ");
        base = sc.nextDouble();
        
        System.out.println("\nMENÚ DE POTENCIAS");
        System.out.println("1 - Calcular el cuadrado");
        System.out.println("2 - Calcular el cubo");
        System.out.println("3 - Calcular la raíz cuadrada");
        System.out.print("Escoja una opción: ");
        
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1: System.out.println("\n" + base + " elevado al cuadrado es " + Math.pow(base, 2));
                    break;
            case 2: System.out.println("\n" + base + " elevado al cubo es " + Math.pow(base, 3));
                    break;
            case 3: System.out.println("\nLa raíz cuadrada de " + base + " es " + Math.pow(base, 0.5));
                    break;
            default: System.out.println("\nOpción incorrecta");
        }
        
    }
}
