package com.mycompany.pruebavalidaentrada;

import java.util.Scanner;

public class PruebaValidaEntrada {

    public static void main(String[] args) {
        // VARIABLES
        Scanner sc = new Scanner (System.in);
        int mayorCero, menorIgualCero;
        double realRango;
        char siNo;
        
        
        // Primera validación:
        do{
            System.out.print("Introduzca un número mayor que cero: ");
            mayorCero = sc.nextInt();
            
            if (mayorCero <= 0) {
                System.out.println("El número debe ser mayor que cero.");
            }
        }while(mayorCero <= 0);
        
        
        // Segunda validación:
        do{
            System.out.print("Introduzca un número menor o igual que cero: ");
            menorIgualCero = sc.nextInt();
            
            if (menorIgualCero > 0) {
                System.out.println("El número debe ser menor o igual que cero.");
            }
        }while(menorIgualCero > 0);
        
        
        // Tercera validación:
        do{
            System.out.print("Introduzca un número entre 1,3 y 19,8: ");
            realRango = sc.nextDouble();
            
            if (realRango < 1.3 || realRango > 19.8) {
                System.out.println("El número no está en el rango correcto.");
            }
        }while(realRango < 1.3 || realRango > 19.8);
        
        
        // Cuarta validación:
        do{
            System.out.print("Introduzca S o N: ");
            siNo = sc.next().charAt(0);
            
            if (siNo != 'S' && siNo != 'N') {
                System.out.println("Se requiere una S o una N.");
            }
        }while(siNo != 'S' && siNo != 'N');
        
        
        // Impresión de los valores de las variables:
        System.out.println("\nPrimer valor: " + mayorCero);
        System.out.println("Segundo valor: " + menorIgualCero);
        System.out.println("Tercer valor: " + realRango);
        System.out.println("Cuarto valor: " + siNo);
    }
}
