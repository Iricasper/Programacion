package com.mycompany.u3.e05.notas;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Iris
 */
public class PruebaNotas2 {

    public static void main(String[] args) {
        // Creamos el array de notas, cuyo rango será la variable alumnos
        int[] notas = new int[alumnos()];
        rellenar(notas);
        Arrays.sort(notas);
        imprimeNotas(notas);
    }

    public static int alumnos() {
        //Pedimos al usuario que nos introduzca la longitud del array
        Scanner sc = new Scanner(System.in);
        int alum;
        do {
            System.out.print("Introduce el numero de alumnos: ");
            alum = sc.nextInt();
        } while (alum <= 0);
        return alum;
    }

    public static void rellenar(int notas[]) {
        //Asignamos valores entre 0 y 100 a cada posición
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 101);
        }
    }

    public static void imprimeNotas(int notas[]) {
        /* Como queremos la nota más baja y la más alta, sólo tenemos que sacar
        los valores de la primera y la última posición. */
        System.out.println("La nota mas baja de la clase es " + notas[0]);
        // OJO: Si buscamos notas[alum] nos habremos salido del array y dará error
        System.out.println("La nota mas alta de la clase es " + notas[notas.length - 1]);
    }
}
