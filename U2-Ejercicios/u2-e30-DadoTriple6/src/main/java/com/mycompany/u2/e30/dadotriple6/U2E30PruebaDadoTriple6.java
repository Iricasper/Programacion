package com.mycompany.u2.e30.dadotriple6;

import java.util.Scanner;

public class U2E30PruebaDadoTriple6 {

    public static void main(String[] args) {
        int guess, cuenta6 = 0;
        boolean acierto = false;
        Scanner sc = new Scanner(System.in);
        Dado d = new Dado();

        System.out.print("Adivina el numero que saldra en el dado (1 a 5): ");
        guess = sc.nextInt();
        
        if (guess < 1 || guess > 5) {
            System.out.print("Debes elegir un numero entre el 1 y el 5: ");
            guess = sc.nextInt();
        }

        while (d.tirada1 != 6) {
            d.tirada1();
            System.out.println("Ha salido el " + d.tirada1);
            if (d.tirada1 == guess) {
                acierto = true;
            }
        }

        while (d.tirada2 != 6) {
            d.tirada2();
            System.out.println("Ha salido el " + d.tirada2);
            if (d.tirada2 == guess) {
                acierto = true;
            }
        }

        while (d.tirada3 != 6) {
            d.tirada3();
            System.out.println("Ha salido el " + d.tirada3);
            if (d.tirada3 == guess) {
                acierto = true;
            }
        }

        if (acierto) {
            System.out.println("Has ganado");
        }
        else {
            System.out.println("Has perdido");
        }
        
    }
}


