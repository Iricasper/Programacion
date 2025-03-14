package com.mycompany.u2.e37.numerosaleatorios;

public class NumerosAleatorios {

    public static void main(String[] args) {

        //Creamos el array
        int[] ran = new int[500];

        //Creamos el bucle que nos permita asignar valores aleatorios en cada posicion
        for (int i = 0; i < ran.length; i++) {
            ran[i] = (int) (Math.random() * 1001);
        }

        //Imprimimos los valores pares y mayores o iguales a 800
        for (int i = 0; i < ran.length; i++) {
            if (ran[i] >= 800 && ran[i] % 2 == 0) {
                System.out.println(ran[i]);
            }
        }
    }
}
