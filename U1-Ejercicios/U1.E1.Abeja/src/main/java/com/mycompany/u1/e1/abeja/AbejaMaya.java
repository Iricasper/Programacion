/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.u1.e1.abeja;

/**
 *
 * @author XxLok
 */
public class AbejaMaya {

    public static void main(String[] args) {
        
        ClassAbeja maya;
        
        maya = new ClassAbeja();
        //Pasos 1-3
        maya.vuela();
        maya.cambiaPosicionX(2);
        maya.numCargasNectar(1);
        //Comprueba estado
        maya.imprimeEstadoVuelo();
        maya.sePosa();
        maya.imprimeNumCargasNectar();
        maya.imprimePosicionX();
        maya.imprimePosicionY();
        //Paso 4
        maya.vuela();
        maya.cambiaPosicionY(2);
        maya.sePosa();
        maya.numCargasNectar(2);
        maya.imprimeNumCargasNectar();
        maya.imprimePosicionX();
        maya.imprimePosicionY();
        maya.imprimeEstadoVuelo();
        //Paso 5
        maya.vuela();
        maya.cambiaPosicionX(0);
        maya.sePosa();
        maya.numCargasNectar(3);
        //paso 6
        maya.imprimeEstadoVuelo();
        maya.imprimeNumCargasNectar();
        maya.imprimePosicionX();
        maya.imprimePosicionY();
    }
}