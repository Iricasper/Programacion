package com.mycompany.u2.extra4.avion;

import java.util.Scanner;

public class PruebaAvion {

    public static void main(String[] args) {
        String[] array = new String[50];
        Scanner sc = new Scanner(System.in);
        int numTur = 0, numEje = 0;

        System.out.println("Elige el tipo de plaza a reservar:");
        System.out.println("1. Turista.");
        System.out.println("2. Ejecutivo.");
        do {
            switch (sc.nextInt()) {
                case 1:
                    for (int i = 0; i < array.length; i++) {
                        if (i < 30 && array[i] == null) {
                            System.out.println("Introduce el dni para la reserva: ");
                            array[i] = sc.nextLine().toUpperCase();
                            break;
                        }
                        if (i >= 30) {
                            System.out.println("No hay calipo niño solo masibon.");
                            System.out.println("Deseas reservar una plaza en ejecutivo?");
                            System.out.println("1. Si.");
                            System.out.println("2. No (Salir).");
                            switch (sc.nextInt()) {
                                case 1:
                                    for (int j = 30; j < array.length; j++) {
                                        if (array[j] == null) {
                                            System.out.println("Introduce el dni para la reserva: ");
                                            array[j] = sc.nextLine().toUpperCase();
                                            break;
                                        }
                                        if (j == array.length) {
                                            System.out.println("No hay plazas libres");
                                        }
                                    }
                                case 2:
                                    System.out.println("Adios, cocodrilo.");
                                    break;
                            }
                        }
                    }
                case 2:
                    for (int j = 30; j < array.length; j++) {
                        if (array[j] == null) {
                            System.out.println("Introduce el dni para la reserva: ");
                            array[j] = sc.nextLine().toUpperCase();
                            break;
                        } else {
                            System.out.println("No hay plazas jefe, quiere una de turista?");
                            System.out.println("1. Si.");
                            System.out.println("2. No (Salir).");
                            switch (sc.nextInt()) {
                                case 1:
                                    for (int i = 0; i < array.length; i++) {
                                        if (i < 30 && array[i] == null) {
                                            System.out.println("Introduce el dni para la reserva: ");
                                            array[i] = sc.nextLine().toUpperCase();
                                            break;
                                        }
                                    }
                                case 2:
                                    System.out.println("Hasta luego, caiman.");
                                    break;
                            }
                        }
                    }
                    for (int i = 0; i < array.length; i++) {
                        if (i <= 29) {
                            if (array[i] == null) {
                                numTur++;
                            } else {
                                System.out.println("La plaza " + (i + 1)
                                        + " es de tipo turista y esta reservada por "
                                        + array[i]);
                            }
                            if (i > 29) {
                                if (array[i] == null) {
                                    numEje++;
                                } else {
                                    System.out.println("La plaza " + (i + 1)
                                            + " es de tipo ejecutivo y esta reservada por "
                                            + array[i]);
                                }
                            }
                        }
                    }
                    System.out.println("Han quedado " + numTur + " plazas libres en clase turista");
                    System.out.println("Han quedado " + numEje + " plazas libres en clase ejecutivo");
            }
        } while (sc.nextInt() != 1 && sc.nextInt() != 2);
    }
}
