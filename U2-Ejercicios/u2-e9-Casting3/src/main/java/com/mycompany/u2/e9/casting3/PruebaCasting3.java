package com.mycompany.u2.e9.casting3;

import java.util.Scanner;

public class PruebaCasting3 {

    public static void main(String[] args) {

        var p = new PersonaCondicional();
        var sc = new Scanner(System.in);

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
        if (p.getEdad() > 30 && p.getEdad() < 40
                && !p.isEstaCasado() && p.getAltura() > 190) {
            System.out.println("Has conseguido el papel.");
        }

        /* Y la última (como en este ejercicio nos piden un or que no se cumple
        en ningún otro caso, no necesitamos la condición de mayor de 40 años) */
        if (p.isEstaCasado()) {
            System.out.println("Has conseguido el papel.");
        }

        /* RESPECTO AL EJERCICIO 10: Como un condicional que solo incluye ANDs
        debe cumplir todas las condiciones solo tenemos que tener en cuenta
        la que más se repite, y dado que la edad se encuentra en los rangos de
        [18, 30], (30, 40) y [41, infinito) y por tanto no hay valores que
        coincidan en dos casos solo nos queda la condición de casado.
        Al juntar las tres nos quedaría casado, casado y NO casado, con lo cual
        el único que podría cumplir esas condiciones sería el
        marido de Schrodinger. */
    }
}
