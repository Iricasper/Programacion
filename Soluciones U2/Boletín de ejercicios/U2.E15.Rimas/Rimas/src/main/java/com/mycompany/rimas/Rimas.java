package com.mycompany.rimas;

import java.util.Scanner;

public class Rimas {

    public static void main(String[] args) {
        
        int numero;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce un número entero entre el 1 y el 5: ");
        numero = sc.nextInt();
        
        switch (numero) {
            case 1: System.out.println("Que no pare ninguno");
                    break;
            case 2: System.out.println("Me voy, adiós");
                    break;
            case 3: System.out.println("No tengo ningún interés");
                    break;
            case 4: System.out.println("Me encanta el teatro");
                    break;
            case 5: System.out.println("Me has hecho dar un brinco");
                    break;
            default: System.out.println("No me sé ninguna rima para el número " + numero);
        }
    
    }
}
