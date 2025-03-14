package com.mycompany.pruebamonedadinero;

public class PruebaMonedaDinero {

    public static void main(String[] args) {
        Moneda m1 = new Moneda ("euro", "€");
        Moneda m2 = new Moneda ("dolar", "$");
        
        Dinero d1 = new Dinero (300.5, m1);
        Dinero d2 = new Dinero (-128.99, m2);
        
        System.out.println("Precio: " + d1.toString());
        System.out.println("Precio: " + d2.toString());
        
        Dinero d3 = new Dinero (12.78, new Moneda ("francos suizos", "Fr"));
        
        System.out.println("Precio: " + d3.toString());
    }
}
