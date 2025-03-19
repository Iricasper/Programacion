package com.mycompany.busqueda;

import java.util.Scanner;

public class Busqueda {

    public static void main(String[] args) {
        // Declaración de variables:
        Scanner sc = new Scanner(System.in);
        int [] array = new int[2000];
        int i, numeroABuscar, posicion = -1;
        
        
        // Rellenamos el array con números aleatorios:
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1001);
        }
        
        
        // Pedimos al usuario el número que desea buscar:
        System.out.print("Introduzca qué valor desea buscar: ");
        numeroABuscar = sc.nextInt();
        
        
        // Buscamos el número indicado:
        for (i = 0; i < array.length; i++) {
            if (array[i] == numeroABuscar) {
                posicion = i;
                break;
            }
        }
        
        
        // Resolvemos la tarea informando en función de si lo ha encontrado o no:
        if (posicion == -1) {
            System.out.println("Número no encontrado");
        } else {
            System.out.println("Encontrado en la posición " + (posicion+1) +
                               " (valor " + array[i] + ")");
        }
    }
}
