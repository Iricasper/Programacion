package com.mycompany.pueblomedieval;

import java.util.Scanner;

public class PuebloMedieval {

    public static void main(String[] args) {
        Personaje [] array = new Personaje[5];
        
        inicializaArray (array);
        generaCiclos (leeCiclos(), array);
        
    }
    
    
    public static void inicializaArray (Personaje[] array) {
        array[0] = new Noble(210);
        array[1] = new Campesino(11);
        array[2] = new Campesino(15);
        array[3] = new Soldado(20);
        array[4] = new Soldado(35);
    }
    
    
    public static int leeCiclos() {
        Scanner sc = new Scanner(System.in);
        int numCiclos;
        
        do {
            System.out.print("Introduzca el número de ciclos (> 0): ");
            numCiclos = sc.nextInt();
        } while (numCiclos <= 0);
        
        return numCiclos;
    }
    
    
    public static void generaCiclos (int n, Personaje[] array) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nCICLO " + (i+1) + ":");
            for (int j = 0; j < array.length; j++) {
                array[j].realizaAccion();
            }
        }
    }
}
