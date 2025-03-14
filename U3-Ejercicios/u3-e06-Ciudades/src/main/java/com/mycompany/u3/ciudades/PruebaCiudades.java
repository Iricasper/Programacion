package com.mycompany.u3.ciudades;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaCiudades {

    public static void main(String[] args) {
        //Creamos el array, 10 posiciones
        String[] array = new String[10];
        rellenar(array);
        Arrays.sort(array);
        System.out.println("Los he ordenado alfabeticamente");
        imprimirCiudades(array);
    }

    // Pedir al usuario que introduzca sus 10 ciudades favoritas
    public static void rellenar(String array[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tus ciudades favoritos: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + ". ");
            array[i] = sc.nextLine();
            System.out.println("");
        }
    }
    // Las imprimimos con un bucle for each.
    public static void imprimirCiudades(String array[]) {
        System.out.println("Lass ciudades son:");
        for (String i : array) {
            System.out.println(i);
        }
    }
}
