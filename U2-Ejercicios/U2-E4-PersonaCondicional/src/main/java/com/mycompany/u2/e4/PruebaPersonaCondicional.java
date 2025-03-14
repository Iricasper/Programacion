package com.mycompany.u2.e4;
import java.util.Scanner;

public class PruebaPersonaCondicional {

    public static void main(String[] args) {
        
        PersonaCondicional p = new PersonaCondicional(); 
        var sc = new Scanner(System.in);
        
        System.out.println("Dime tu edad: ");
        p.setEdad(sc.nextInt());
        
        System.out.println("Dime tu altura: ");
        p.setAltura(sc.nextInt());
        
        System.out.println("Dime tu estado civil"
                + "(false es soltero/a, true es casado/a): ");
        p.setEstaCasado(sc.nextBoolean());
        
        if (p.getEdad() >= 18) {
            System.out.println("Ya eres un señor/a");
        }
        
        if (p.getAltura() >= 185) {
            System.out.println("Eres alto/a");
        }
        
        if (p.isEstaCasado()== false) {
            System.out.println("No estas casado/a");
        }
    }
    
}
