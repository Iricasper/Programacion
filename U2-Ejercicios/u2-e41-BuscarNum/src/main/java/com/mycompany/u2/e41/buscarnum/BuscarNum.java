package com.mycompany.u2.e41.buscarnum;

import java.util.Scanner;

public class BuscarNum {

    public static void main(String[] args) {
        int[] array = new int[2000];
        Scanner sc = new Scanner(System.in);
        int numBuscado;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1001);
        }

        System.out.print("Introduce el numero que quieres buscar: ");
        numBuscado = sc.nextInt();

        //Ahora debemos buscar ese numero en el array
        //Nuestro localizador debe estar inicializado fuera del rango del array: [0-499]
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            if (elem == numBuscado) {
                pos = i;
                break;
            }
        }
        //Ahora tendrá que devolver el lugar en el que se encuentra nuestro numero.
        //Si no se encuentra deberá informar al respecto
        if (pos == -1) {
            System.out.println("Numero no encontrado");
        } else {
            System.out.println("El numero buscado esta en la posicion " + pos);
        }
    }
}