/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebabombilla2;

/**
 *
 * @author XxLok
 */
public class PruebaBombilla2 {

    public static void main(String[] args) {
        
        Bombilla2 bomb1;
        bomb1 = new Bombilla2 ();
     
        bomb1.imprimeMarca();
        bomb1.imprimePotencia();
        bomb1.cambiaMarca("Phillips");
        bomb1.cambiaPotencia (100);
        bomb1.encender();
        bomb1.apagar();
        bomb1.encender();
        bomb1.imprimeMarca();
        bomb1.imprimePotencia();
        bomb1.imprimeEstado();
    }
}
