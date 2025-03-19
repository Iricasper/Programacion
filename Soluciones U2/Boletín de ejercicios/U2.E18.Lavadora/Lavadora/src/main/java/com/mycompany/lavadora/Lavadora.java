package com.mycompany.lavadora;

import java.util.Scanner;

public class Lavadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int operacion;
        
        System.out.print("Indicar en qué operación debe comenzar la lavadora (1-12): ");
        operacion = sc.nextInt();
        
        switch (operacion) {
            case 1: System.out.println("1 - Prelavado");
            case 2: System.out.println("2 - Lavado");
            case 3: System.out.println("3 - Centrifugado");
            case 4: System.out.println("4 - Fin");
                    break;
            case 5: System.out.println("5 - Prelavado");
            case 6: System.out.println("6 - Lavado en caliente");
            case 7: System.out.println("7 - Centrifugado 1");
            case 8: System.out.println("8 - Lavado en frío");
            case 9: System.out.println("9 - Suavizante");
            case 10: System.out.println("10 - Centrifugado 2");
            case 11: System.out.println("11 - Secado");
            case 12: System.out.println("12 - Fin");
                    break;
            default: System.out.println("Opción incorrecta");
        }
    
    }
}
