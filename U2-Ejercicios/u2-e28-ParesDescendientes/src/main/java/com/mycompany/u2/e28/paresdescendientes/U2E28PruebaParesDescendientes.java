package com.mycompany.u2.e28.paresdescendientes;

import java.util.Scanner;

public class U2E28PruebaParesDescendientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont;

        System.out.println("Introduce un numero entre el 0 y el 100: ");

        do {
            cont = sc.nextInt();
            
            if (cont > 100 || cont < 0) {
                System.out.println("Error. El numero debe estar entre el 0 y el 100");
            }
        }
        while (cont > 100 || cont < 0);
        
        System.out.print("Estos son los numeros pares entre el " + cont + " y el 0: ");
        while (cont >= 2){
            if (cont % 2 == 0) {
                System.out.print(cont + ", ");
            }
            cont--;
        }
        System.out.println("0.");
    }
}
