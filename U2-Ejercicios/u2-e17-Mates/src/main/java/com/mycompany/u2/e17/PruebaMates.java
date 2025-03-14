package com.mycompany.u2.e17;
import java.util.Scanner;

public class PruebaMates {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        String op;
        
        System.out.println("Dime el primer numero: ");
        a = sc.nextInt();
        System.out.println("Dime el segundo numero: ");
        b = sc.nextInt();
        System.out.println("Dime el operador a aplicar: ");
        sc.nextLine();
        op = sc.nextLine();
        
        switch(op) {
            case "+":
                System.out.println("El resultado de "+a+"+"+b+" es "+ (a+b));
                break;
            case "-":
                System.out.println("El resultado de "+a+"-"+b+" es "+ (a-b));
                break;
            case "*":
                System.out.println("El resultado de "+a+"*"+b+" es "+ (a*b));
                break;
            case "/":
                System.out.println("El resultado de "+a+"/"+b+" es "+ ((double)a/(double)b));
                break;
            default:
                System.out.println("Error, utilice un operador correcto");
        }

    }
}
