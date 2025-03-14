package com.mycompany.pruebaexpresiones;

import java.util.*;

public class PruebaExpresiones {

    public static void main(String[] args) {
        double a, b, c, d;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Dame el número a: ");
        a = sc.nextDouble();
        System.out.print("Dame el número b: ");
        b = sc.nextDouble();
        System.out.print("Dame el número c: ");
        c = sc.nextDouble();
        System.out.print("Dame el número d: ");
        d = sc.nextDouble();
        
        System.out.println("");
        System.out.println("Resultado 1: " + ((a + b * 38) / (c * d)));
        System.out.println("Resultado 2: " + (a + ((30 - d) / (c + d))));
        System.out.println("Resultado 3: " + (b * a * ((a + b) / (b / d))));
        System.out.println("Resultado 4: " + (((a + 50) / b) / (c / (4 + d))));
    }
}
