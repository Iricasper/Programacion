/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4.ej05;

/**
 *
 * @author usuario24
 */
public class PruebaMonedaDinero {

    public static void main(String[] args) {
        Moneda eur = new Moneda ("Euro", "€");
        Articulo a1 = new Articulo(1, "Auriculares SONY FW22", new Dinero(30, eur));
        Articulo a2 = new Articulo(2, "Teclado Mehosy RT302", new Dinero(50, eur));
        Articulo a3 = new Articulo(3, "Raton inalambrico Delta 3", new Dinero(25, eur));
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        a1.setPrecio(new Dinero(39, eur));
        a2.setPrecio(new Dinero(-50, eur));
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
