package com.mycompany.u2.e31.candadonumerico;

import java.util.Scanner;

public class PruebaCandadoNumerico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CandadoNumerico can = new CandadoNumerico();
        int num, cont = 0;

        do {
            System.out.printf("Introduce la combinacion del candado (0-9999): ");
            //num = sc.nextInt();
            num = (int) (Math.random() * 10000);

            if (num > 9999 || num < 0) {
                System.out.println("Valor incorrecto");
            }
        }
        while (num > 9999 || num < 0);

        can.setNumSecreto(num);

        while (!can.seAbreCon(cont)) {
            System.out.println("Probando con el " + cont + ". No se abre");
            ++cont;
        }
        System.out.println("Probando con el " + cont + ". Se ha abierto!");
    }
}
