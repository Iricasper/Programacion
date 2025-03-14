package com.mycompany.u2.extra2.medianotas;

import java.util.Scanner;

public class PruebaMediaNotas {

    public static void main(String[] args) {

        double[] array = new double[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            double check = 0; 
            System.out.println("Introduce la nota del alumno " + (i + 1) + ":");
            check = sc.nextDouble();
            if (check >= 0) {
                array[i] = check;
            } else {
                System.out.println("Error. Usa numeros positivos");
                i--;
            }
        }
            double suma = 0;
            for (double i : array) {
                suma += i;
            }
            double media = suma / 10;
            System.out.println("La media aritmetica del curso es " + media);

        }
    }
