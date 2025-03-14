/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4.ej15;

/**
 *
 * @author usuario24
 */
public class PruebaImpresora {

    public static void main(String[] args) {
        Impresora i = new Impresora("HP", "Laserjet 2000");
        
        i.cargarBandeja(5);
        i.encender();
        
        Documento d1 = new Documento();
        d1.setTitulo("El color de la magia");
        d1.setNumPaginasImpresion(4);
        Documento d2 = new Documento();
        d2.setTitulo("La luz fantastica");
        d2.setNumPaginasImpresion(3);
        
        i.imprimir(d1);
        i.imprimir(d2);
        
    }
}
