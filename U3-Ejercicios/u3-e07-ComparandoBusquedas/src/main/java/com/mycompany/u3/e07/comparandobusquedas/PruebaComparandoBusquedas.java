package com.mycompany.u3.e07.comparandobusquedas;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaComparandoBusquedas {

    public static void main(String[] args) {
        // Creamos el objeto de la clase array
        int[] array1 = new int[10000];
        rellenarArray(array1);
        // El método Arrays.copyOf(array, nuevaLongitud) copia el array
        int[] array2 = Arrays.copyOf(array1, array1.length);
        // Ordenamos el segundo array
        Arrays.sort(array2);
        //Pedimos al usuario que escoja el numero
        int numBuscado = getNumero();
        // Realizamos una búsqueda secuencial
        busquedaSecuencial(array1, numBuscado);
        // Realizamos la búsqueda binaria
        busquedaBinaria(array2, numBuscado);

    }

    public static void rellenarArray(int array1[]) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 1000000);
        }
    }

    public static int getNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero que quieres buscar: ");
        return sc.nextInt();
    }

    public static void busquedaSecuencial(int array1[], int numBuscado) {
        boolean bandera = false;
        int i;
        /* Registramos los nanosegundos antes de la búsqueda con la función
           System.nanoTime(), asignándola a una variable */
        long antes = System.nanoTime();
        for (i = 0; i < array1.length; i++) {
            if (array1[i] == numBuscado) {
                // Bandera actúa como marcador, true si se encuentra, false si no
                bandera = true;
                break;
            }
        }
        // Registramos el tiempo tras la operación
        long despues = System.nanoTime();
        if (bandera) {
            System.out.println("Numero encontrado en la posicion " + (i + 1)
                    + "!!!");
        } else {
            System.out.println("Numero no encontrado :(");
        }
        // Mostramos el tiempo que ha tardado la operación
        System.out.println("La busqueda secuencial ha llevado "
                + (despues - antes) + " nanosegundos");
    }

    public static void busquedaBinaria(int array2[], int numBuscado) {
        /* Registramos los nanosegundos antes de la búsqueda con la función
           System.nanoTime(), asignándola a una variable */
        long antes = System.nanoTime();
        // Realizamos la búsqueda binaria
        int i = Arrays.binarySearch(array2, numBuscado);
        // Registramos el tiempo tras la operación
        long despues = System.nanoTime();
        //Mostramos el resultado de la búsqueda binaria
        if (i >= 0) {
            System.out.println("Numero encontrado en la posicion " + (i + 1)
                    + "!!!");
        } else {
            System.out.println("Numero no encontrado :(");
            // Mostramos el tiempo que ha tardado la operación
        }
        System.out.println("La busqueda binaria ha llevado " + (despues - antes)
                + " nanosegundos");
    }
}
