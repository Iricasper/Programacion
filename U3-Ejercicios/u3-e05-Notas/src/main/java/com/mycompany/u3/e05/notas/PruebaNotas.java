package com.mycompany.u3.e05.notas;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Iris
 */
public class PruebaNotas {

    public static void main(String[] args) {

        // Creamos la variable alumnos, que será un entero que pediremos por teclado
        int alum;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el numero de alumnos: ");
            alum = sc.nextInt();
        } while (alum < 0);

        // Creamos el array de notas, cuyo rango será la variable alumnos
        int[] notas = new int[alum];

        // Rellenamos el array con notas comprendidas entre el 0 y el 100. 
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 101);
        }

        // El ejercicio nos pide que ordenemos el array
        Arrays.sort(notas);

        /* Como queremos la nota más baja y la más alta, sólo tenemos que sacar
           los valores de la primera y la última posición. */
        System.out.println("La nota mas baja de la clase es " + notas[0]);

        // OJO: Si buscamos notas[alum] nos habremos salido del array y dará error
        System.out.println("La nota mas alta de la clase es " + notas[alum - 1]);
    }
}
