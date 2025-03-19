/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u1.e8bombillas;

/**
 *
 * @author XxLok
 */
public class PruebaBombillas2 {

    public static void main(String[] args) {
        Bombillas2 b1 = new Bombillas2();
        Bombillas2 b2 = new Bombillas2();
        
        b1.encender();
        b1.apagar();
        b1.encender();
        b1.apagar();
        b1.encender();
        b1.apagar();
        
        b2.encender();
        
        int veces1;
        int veces2;
        veces1 = b1.obtieneNumVecesEncendida();
        veces2 = b2.obtieneNumVecesEncendida();
        System.out.println("La bombilla 1 se ha encendido " + veces1 + " veces");
        System.out.println("La bombilla 2 se ha encendido " + veces2 + " veces");
    }
}
