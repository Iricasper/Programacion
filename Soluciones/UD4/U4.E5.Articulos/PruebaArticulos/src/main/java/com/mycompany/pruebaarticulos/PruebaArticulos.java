package com.mycompany.pruebaarticulos;

public class PruebaArticulos {

    public static void main(String[] args) {
        Moneda m1 = new Moneda ("euro", "€");
    
        Articulo ar1 = new Articulo (1, "Auriculares SONY FW22", new Dinero (30, m1));
        Articulo ar2 = new Articulo (2, "Teclado Mehosy RT302", new Dinero (50, m1));
        Articulo ar3 = new Articulo (3, "Raton inalambrico Delta 3", new Dinero (25, m1));
    
        System.out.println(ar1.toString());
        System.out.println(ar2.toString());
        System.out.println(ar3.toString());
        
        ar1.getPrecio().setCantidad(39);
        System.out.println(ar1.toString());
        
        ar2.getPrecio().setCantidad(-50);
        System.out.println(ar2.toString());
    }
}
