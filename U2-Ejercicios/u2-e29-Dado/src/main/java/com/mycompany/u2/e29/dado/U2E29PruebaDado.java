package com.mycompany.u2.e29.dado;
import java.util.Scanner;

public class U2E29PruebaDado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int guess, cont = 1;
        Dado d = new Dado();
        
        System.out.print("Adivina el numero que saldra en el dado (1 a 6): ");
        guess = sc.nextInt();
        
        if (guess < 1 || guess > 6) {
            System.out.print("Debes elegir un numero entre el 1 y el 6: ");
            guess = sc.nextInt();
        }
        
        d.tirada();
        System.out.println("Ha salido el " + d.tirada);
        
        while (d.tirada != guess) {
            d.tirada();
            System.out.println("Ha salido el " + d.tirada);
            cont++;
        }
        
        System.out.println("Has acertado en la tirada numero " + cont);
    }
}
