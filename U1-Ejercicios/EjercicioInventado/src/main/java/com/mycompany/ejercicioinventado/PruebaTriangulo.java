/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioinventado;

/**
 *
 * @author XxLok
 */
public class PruebaTriangulo {

    public static void main(String[] args) {
        Triangulo ding;
        ding = new Triangulo();
        
        ding.cambioLado1(32);
        ding.cambioLado2(20);
        ding.cambioLado3(45);
        ding.imprimeDescripcion();
        ding.imprimePerimetro();
    }
}
