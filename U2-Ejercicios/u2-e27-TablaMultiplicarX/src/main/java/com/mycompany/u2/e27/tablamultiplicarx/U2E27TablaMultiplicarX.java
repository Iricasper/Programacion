package com.mycompany.u2.e27.tablamultiplicarx;
import java.util.Scanner;

public class U2E27TablaMultiplicarX {

    public static void main(String[] args) {
         int cont = 0;
         int x;
         
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Introduce el numero entero a multiplicar: ");
         x = sc.nextInt();
         
        while (cont <=10) {
            System.out.println(cont + " x " + x +" = " + cont*x);
            cont++;
        }
    }
}
