/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u1.e9circunferencia;

/**
 *
 * @author XxLok
 */
public class PruebaCricunferencia {

    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia ();
        c1.estableceRadio(7);
        c1.calculaPerimetro();
        c1.calculaSuperficie();
        double perimetro = c1.calculaPerimetro();
        double superficie = c1.calculaSuperficie();
        System.out.println("El perimetro de la circunferencia es "+perimetro);
        System.out.println("La superficie de la circunferencia es "+superficie);
    }
}
