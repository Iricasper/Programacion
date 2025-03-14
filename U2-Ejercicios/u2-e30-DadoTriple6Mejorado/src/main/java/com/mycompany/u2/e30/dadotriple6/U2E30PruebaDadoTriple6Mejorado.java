package com.mycompany.u2.e30.dadotriple6;

import java.util.Scanner;

public class U2E30PruebaDadoTriple6Mejorado {

    public static void main(String[] args) {
        int guess, cuenta6 = 0;
        boolean acierto = false;
        Scanner sc = new Scanner(System.in);
        DadoMejorado d = new DadoMejorado();

        System.out.print("Adivina el numero que saldra en el dado (1 a 5): ");
        guess = sc.nextInt();
        
        if (guess < 1 || guess > 5) {
            System.out.print("Debes elegir un numero entre el 1 y el 5: ");
            guess = sc.nextInt();
        }
        
        while (cuenta6 != 3) {
            d.tirada();
            System.out.println("Ha salido el " + d.tirada);
                if (d.tirada == guess) {
                    acierto = true;
                }
                if (d.tirada == 6) {
                    cuenta6++;
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
