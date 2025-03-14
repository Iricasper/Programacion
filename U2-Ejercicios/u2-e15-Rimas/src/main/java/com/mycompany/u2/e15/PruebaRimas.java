package com.mycompany.u2.e15;
import java.util.Scanner;

public class PruebaRimas {

    public static void main(String[] args) {
        
        //Ponemos la variable n
        int n;
        
        //Creamos el objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        //Pedimos al usuario que introduzca un numero y lo registramos
        System.out.println("Introduce un numero del 1 al 5: ");
        n = sc.nextInt();
        
        //Pedimos
        switch(n) {
            case 1:
                System.out.println("Que no pare ninguno");
                break;
                
            case 2:
                System.out.println("Cuidado con la tos");
                break;
                
            case 3:
                System.out.println("Esto va de ser cortes");
                break;
                
            case 4:
                System.out.println("Quiero jugar al Balatro");
                break;
                
            case 5:
                System.out.println("Casi pego un brinco");
                break;
                
            default:
                System.out.println("Profe esto es tortura");
        }
    }
}
