/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abeja;

/**
 *
 * @author XxLok
 */
public class PruebaAbeja {
    public static void main(String[] args) {
        
        Abeja maya;
        
        maya = new Abeja();
        //Estado base
        maya.imprimePosicionX();
        maya.imprimePosicionY();
        maya.imprimeEstadoVuelo();
        //Vuela y se mueve
        maya.vuela();
        maya.imprimeEstadoVuelo();
        maya.cambiaPosicionX(4);
        maya.cambiaPosicionY(4);
        maya.sePosa();
        //Comprobamos el estado final
        maya.imprimePosicionX();
        maya.imprimePosicionY();
        maya.imprimeEstadoVuelo();
    }
}
