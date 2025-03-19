package com.mycompany.pruebacasting;

import java.util.Scanner;


public class PruebaCasting {

    public static void main(String[] args) {
        
        PersonaCondicional p = new PersonaCondicional();
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduzca la edad: ");
        p.setEdad(sc.nextInt());
        
        System.out.print("Introduzca la altura en centímetros: ");
        p.setAltura(sc.nextInt());
        
        p.setEstaCasado(false);
        
        if ((p.getEdad() > 18 && p.getEdad() < 30 && !p.isEstaCasado()) || 
            (p.getEdad() > 30 && p.getEdad() < 40 && !p.isEstaCasado() && p.getAltura() > 190) || 
            (p.getEdad() >= 40 && p.isEstaCasado())
            ) {
            System.out.println("\nHas conseguido el papel");
        }
        
    }
}
