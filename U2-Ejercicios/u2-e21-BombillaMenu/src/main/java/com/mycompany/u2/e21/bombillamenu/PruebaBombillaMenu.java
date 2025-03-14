package com.mycompany.u2.e21.bombillamenu;

import java.util.Scanner;

public class PruebaBombillaMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BombillaCondicional3 b = new BombillaCondicional3();
        int n;

        do {
            System.out.println("---------------------------------------------");
            System.out.printf("MENU DE OPCIONES:%n0 - SALIR%n1 - Enciende%n"
                    + "2 - Apaga%n3 - Imprime estado%n4 - Crea una nueva bombilla%n"
                    + "Escoge una opcion: ");
            n = sc.nextInt();

            switch (n) {
                case 0:
                    System.out.println("El programa ha finalizado");
                    break;
                case 1:
                    b.encender();
                    break;
                case 2:
                    b.apagar();
                    break;
                case 3:
                    b.imprimeEstado();
                    break;
                case 4: b = new BombillaCondicional3();
                    System.out.println("Se ha creado una nueva bombilla");
                    break;
                default: System.out.println("Opcion incorrecta");
                    break;

            }
        }
            while (n != 0);
    }
}
