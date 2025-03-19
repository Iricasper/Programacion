package com.mycompany.comparandobusquedas;

import java.util.Scanner;
import java.util.Arrays;


public class ComparandoBusquedas {

    public static void main(String[] args) {
        int array[] = new int[10000];
        int valorABuscar;
        
        rellenarArray (array);
        int copia[] = Arrays.copyOf(array, array.length);
        valorABuscar = introducirValor();
        rendimientoBusquedaSecuencial(copia, valorABuscar);
        Arrays.sort(copia);
        rendimientoBusquedaBinaria (copia, valorABuscar);
    }
    
    
    public static void rellenarArray (int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000000);
        }
    }
    
    
    public static int introducirValor() {
        Scanner sc = new Scanner (System.in);
        int n;
        
        do {
            System.out.print("Introduzca el valor a buscar (0-999999): ");
            n = sc.nextInt();
        } while(n < 0 || n > 999999);
        
        return n;
    }
    
    
    public static int busquedaSecuencial(int array[], int dato){
        int posicion = -1;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == dato) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    
    
    public static void rendimientoBusquedaSecuencial (int array[], int valorABuscar) {
        System.out.println("Procedimiento de búsqueda secuencial sobre el array original:");
        long antes = System.nanoTime();
        int posicion = busquedaSecuencial (array, valorABuscar);
        System.out.println("El valor introducido está en la posición: " +
                           (posicion == -1 ? "No está" : (posicion + 1)));
        long despues = System.nanoTime();
        System.out.println("La búsqueda secuencial ha tardado " + (despues - antes) + " nanosegundos");        
    }
    
    
    public static void rendimientoBusquedaBinaria (int array[], int valorABuscar) {
        System.out.println("Procedimiento de búsqueda binaria sobre el array ordenado:");
        long antes = System.nanoTime();
        int posicion = Arrays.binarySearch (array, valorABuscar);
        long despues = System.nanoTime();
        System.out.println("La búsqueda binaria ha tardado " + (despues - antes) + " nanosegundos");        
    }
}
