package com.mycompany.menubombillacondicional;

import java.util.Scanner;

public class MenuBombillaCondicional {

    public static void main(String[] args) {
        // VARIABLES:
        Scanner sc = new Scanner (System.in);
        BombillaCondicional b = new BombillaCondicional();
        int opcion;

        
        // MENÚ Y OPERACIONES:
        do{
            System.out.println("\nMENÚ DE OPCIONES:");
            System.out.println("0 - SALIR");
            System.out.println("1 - Enciende");
            System.out.println("2 - Apaga");
            System.out.println("3 - Imprime estado");
            System.out.println("4 - Crea una nueva bombilla");
            System.out.print("Escoge una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 0: break;
                case 1: b.encender();
                        break;
                case 2: b.apagar();
                        break;
                case 3: b.imprimeEstado();
                        break;
                case 4: b = new BombillaCondicional();
                        break;
                default: System.out.println("Opción incorrecta.");
            }
        }while(opcion != 0);
    }
}
