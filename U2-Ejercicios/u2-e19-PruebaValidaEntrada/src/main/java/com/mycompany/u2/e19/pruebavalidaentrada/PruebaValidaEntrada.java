package com.mycompany.u2.e19.pruebavalidaentrada;
import java.util.Scanner;

public class PruebaValidaEntrada {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        int mayorCero, menorIgualCero;
        double realRango;
        char siNo = 0;
        
        System.out.println("Escoge un numero mayor que cero: ");
        do {
            mayorCero = sc.nextInt();
            
            if (mayorCero <= 0) {
            System.out.println("El numero debe ser mayor que cero");
            }
        } while (mayorCero <= 0);
        
        System.out.println("Escoge un numero menor o igual que cero: ");
        do {
            menorIgualCero = sc.nextInt();
            
            if (menorIgualCero > 0) {
                System.out.println("El numero debe ser menor o igual que cero");
            }
        } while (menorIgualCero > 0);
        
        System.out.println("Escoge un numero real entre el 1.3 y el 19.8: ");
        do {
            realRango = sc.nextDouble();
            
            if (realRango > 19.8 || realRango < 1.3 ) {
            System.out.println("El numero debe estar comprendido entre 1.3 y 19.8");
            }
        } while (realRango > 19.8 || realRango < 1.3 );
        
       System.out.println("Introduce el caracter S o N");
        do {
            siNo = sc.next().charAt(0);
            
            if (siNo != 'S' && siNo != 'N') {
                System.out.println("El caracter solo puede ser S o N");
            }
        } while (siNo != 'S' && siNo != 'N');
        
        System.out.printf("Los valores introducidos han sido %s, %s, %s y %s",
                mayorCero, menorIgualCero, realRango, siNo);
    }
}
