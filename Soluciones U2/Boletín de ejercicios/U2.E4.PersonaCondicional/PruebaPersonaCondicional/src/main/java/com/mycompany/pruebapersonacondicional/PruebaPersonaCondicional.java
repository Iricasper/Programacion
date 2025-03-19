package com.mycompany.pruebapersonacondicional;

import java.util.Scanner;


public class PruebaPersonaCondicional {

    public static void main(String[] args) {
        PersonaCondicional p = new PersonaCondicional();
        
        /*
        p.setEdad(20);
        p.setAltura(165);
        p.setEstaCasado(false);
        */
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduzca la edad: ");
        p.setEdad(sc.nextInt());
        
        System.out.print("Introduzca la altura en centímetros: ");
        p.setAltura(sc.nextInt());
        
        System.out.print("Introduzca el peso en kilogramos: ");
        p.setPeso(sc.nextInt());
        
        System.out.print("¿Está casado/a (true/false)?: ");
        p.setEstaCasado(sc.nextBoolean());

        System.out.println("");
        
        if (p.getEdad() >= 18) {
            System.out.println("Ya eres un señor/a");
        }
        
        if (p.getAltura() >= 185) {
            System.out.println("Eres alto/a");
        }
        
        if (p.isEstaCasado() == false) {
            System.out.println("No está casado/a");
        }
    }
}
