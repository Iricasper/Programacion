package com.mycompany;
import java.util.Scanner;

public class PruebaCasting {

    public static void main(String[] args) {
        
        var p = new PersonaCondicional();
        var sc = new Scanner (System.in);
        
        //Leemos altura y edad por teclado
        System.out.println("Introduce tu edad: ");
        p.setEdad(sc.nextInt());
        
        System.out.println("Introduce tu altura en cm: ");
        p.setAltura(sc.nextInt());
        
        //Establecemos casado a false por defecto
        p.setEstaCasado(false);
        
        //Añadimos la primera condición.
        if (p.getEdad() >= 18 && p.getEdad() <= 30 && p.getAltura() > 175) {
            System.out.println("Has conseguido el papel.");
        }
    }
}