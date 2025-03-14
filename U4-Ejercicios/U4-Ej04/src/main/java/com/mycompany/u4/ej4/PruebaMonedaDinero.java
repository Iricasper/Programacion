/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4.ej4;

/**
 *
 * @author usuario24
 */
public class PruebaMonedaDinero {

    public static void main(String[] args) {
        Moneda eur = new Moneda("euro", "€");
        Moneda dol = new Moneda("dolar", "$");
        
        Dinero d1 = new Dinero(300.5, eur);
        Dinero d2 = new Dinero(-128.99, dol);
        
        System.out.println("Precio: " + d1.toString());
        System.out.println("Precio: " + d2.toString());
        
        Dinero d3 = new Dinero(12.78, new Moneda("franco suizo", "Fr"));
        
        System.out.println("Precio: " + d3.toString());
    }
}
