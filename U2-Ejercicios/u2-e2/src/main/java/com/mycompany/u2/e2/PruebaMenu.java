package com.mycompany.u2.e2;
import java.util.Scanner;

public class PruebaMenu {

    public static void main(String[] args) {
        Menu m = new Menu();
        Scanner sc = new Scanner(System.in);
        
        //Pedimos los datos al usuario
        System.out.print("Introduce el nombre del primer plato:");
        m.setPrimerPlato(sc.nextLine());
        
        System.out.print("Introduce el nombre del segundo plato:");
        m.setSegundoPlato(sc.nextLine());
        
        System.out.print("Introduce el numero de calorias:");
        m.setCalorias(sc.nextInt());
        
        System.out.print("Introduce el precio total:");
        m.setPrecio(sc.nextDouble());
        
        //Imprimimos los datos con formato
        System.out.printf("%-22s%22s%n", "PRIMER PLATO", "SEGUNDO PLATO");
        System.out.printf("%-22s%22s%n", m.getPrimerPlato(), m.getSegundoPlato());
        System.out.println("--------------------------------------------");
        System.out.printf("%-22s%22s%n", "CALORIAS", "PRECIO");
        System.out.printf("%-22d%20.2f%2s", m.getCalorias(), m.getPrecio(), "€");
    }
}
