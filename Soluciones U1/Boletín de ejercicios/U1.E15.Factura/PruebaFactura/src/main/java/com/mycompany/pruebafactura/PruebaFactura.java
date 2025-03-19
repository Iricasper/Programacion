package com.mycompany.pruebafactura;

import java.util.Scanner;

public class PruebaFactura {

    public static void main(String[] args) {
        final int IVA = 21;
        Scanner sc = new Scanner(System.in);
        double precio, subTotal;
        int numPen;

        System.out.print("Dime el precio de un pen-drive: ");
        precio = sc.nextDouble();

        System.out.print("Dime el número de pen-drives que quieres comprar: ");
        numPen = sc.nextInt();

        System.out.println("\nFACTURA JAMAZON");
        System.out.println("Precio unitario: " + precio + "€");
        System.out.println("Número artículos: " + numPen);

        subTotal = precio * numPen;
        System.out.println("Subtotal: " + subTotal + "€");
        System.out.println("------------------------------------------------");
        System.out.println("Total (IVA incluido): " + (subTotal * (1 + ((double) IVA / 100))) + "€");
    }
}
