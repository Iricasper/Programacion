package com.mycompany.pruebascanner;

import java.util.*;

public class PruebaScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nombre;
        String primerApellido;
        int primerNumero;
        int segundoNumero;
        
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();
        
        System.out.print("Introduce tu primer apellido: ");
        primerApellido = sc.nextLine();
        
        System.out.print("Dime un número entero: ");
        primerNumero = sc.nextInt();
        
        System.out.print("Dime otro número entero: ");
        segundoNumero = sc.nextInt();
        
        System.out.println("\nNombre y apellido: " + nombre + " " + primerApellido);
        
        System.out.println("Los números leídos son " + primerNumero +
                           " y " + segundoNumero + ". Su suma es " +
                           (primerNumero + segundoNumero) + " y su producto es " +
                           (primerNumero * segundoNumero));
    }
}
