package com.mycompany.pruebadado;

import java.util.Scanner;

public class PruebaDado {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero, tirada;
        int cuentaSeis = 0;
        Dado d = new Dado();
        
        do {
                System.out.print("Introduce el número que crees que va a salir: ");
                numero = sc.nextInt();
            
                if (numero < 1 || numero > 6) {
                    System.out.println("Un dado solo tiene los números del 1 al 6.");
                }
        }while (numero < 1 || numero > 6);
        
        while (cuentaSeis != 3) {
            tirada = d.tirada();
            System.out.println("Ha salido un " + tirada);
            
            if (tirada == 6) {
                cuentaSeis++;
            }
            
            if (numero == tirada) {
                System.out.println("Has acertado!!");
            } else {
                System.out.println("No has acertado!!");
            }
        }
        
        System.out.println("Ya han salido tres 6. Se acabó!");
    }
}
