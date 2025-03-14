package com.mycompany.u2.e8.casting2;
import java.util.Scanner;

public class PruebaCasting2 {

    public static void main(String[] args) {
        
        var p = new PersonaCondicional2();
        var sc = new Scanner (System.in);
        
        //Leemos altura y edad por teclado
        System.out.println("Introduce tu edad: ");
        p.setEdad(sc.nextInt());
        
        System.out.println("Introduce tu altura en cm: ");
        p.setAltura(sc.nextInt());
        
        //En este ejercicio habremos de preguntar si está casado
        System.out.println("Indica si estás casado (usando true o false): ");
        p.setEstaCasado(sc.nextBoolean());
        
        //Añadimos la primera condición.
        if (p.getEdad() >= 18 && p.getEdad() <= 30 && !p.isEstaCasado()) {
            System.out.println("Has conseguido el papel.");
        }
        
        //Ahora la segunda.
        if (p.getEdad() > 30 && p.getEdad() < 40 &&
                !p.isEstaCasado() && p.getAltura() > 190) {
            System.out.println("Has conseguido el papel.");
        }
        
        //Y la última
        if (p.getEdad() >= 40 && p.isEstaCasado()) {
            System.out.println("Has conseguido el papel.");
        }
    }
}