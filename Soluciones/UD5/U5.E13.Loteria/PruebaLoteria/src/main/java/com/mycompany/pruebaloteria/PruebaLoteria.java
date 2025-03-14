package com.mycompany.pruebaloteria;

import java.util.*;

public class PruebaLoteria {

    public static void main(String[] args) {
        Set numeros = new HashSet();
        int gordo;
        
        introducirNumeros (numeros);
        gordo = solicitarGordo();
        comprobarPremio (gordo, numeros);
    }
    
    
    public static void introducirNumeros (Set numeros) {
        Scanner sc = new Scanner (System.in);
        int numero;
        
        System.out.println("\nINTRODUCCIÓN DE NÚMEROS");
        do {
            System.out.print("Introduzca número (-1 para salir): ");
            numero = sc.nextInt();
            if (numero != -1) {
                numeros.add(numero);  // Autoboxing
            }
        }while (numero != -1);
        
        System.out.println("");
    }
    
    
    public static int solicitarGordo() {
        Scanner sc = new Scanner (System.in);
        int gordo;
        
        do {
            System.out.print("Introduzca el número que ha resultado premiado: ");
            gordo = sc.nextInt();
        } while(gordo < 0);
        
        System.out.println("");
        
        return gordo;
    }
    
    
    public static void comprobarPremio (int gordo, Set numeros) {
        Iterator iter = numeros.iterator();
        
        while (iter.hasNext()) {
            if ((Integer) iter.next() == gordo) { // Unboxing
                System.out.println("La empresa ha vendido ese número.");
                return;
            }
        }
        
        System.out.println("La empresa no ha vendido ese número.");
    }
}
