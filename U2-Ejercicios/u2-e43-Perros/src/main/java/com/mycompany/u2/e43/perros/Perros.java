package com.mycompany.u2.e43.perros;

import java.util.Scanner;

public class Perros {

    public static void main(String[] args) {
        String[] pe = new String[5];

        pe[0] = "Toby";
        pe[1] = "Rocky";
        pe[2] = "Filete";
        pe[3] = "Perruedines";
        pe[4] = "Torrija";

        Scanner sc = new Scanner(System.in);
        String nombre;
        int i;
        boolean check = false;

        System.out.print("Introduce un nombre de perro: ");
        nombre = sc.nextLine();

        for (i = 0; i < pe.length; i++) {
            if (pe[i].equalsIgnoreCase(nombre)) {
                check = true;
                System.out.println("El nombre " + nombre + " ocupa el puesto "
                        + (i + 1) + " del TOP 5 de nombres de perros");
            }
        }

        if (!check) {
            System.out.println("El nombre " + nombre + " no esta en el"
                    + " TOP 5 de nombres de perros");
        }

    }
}
