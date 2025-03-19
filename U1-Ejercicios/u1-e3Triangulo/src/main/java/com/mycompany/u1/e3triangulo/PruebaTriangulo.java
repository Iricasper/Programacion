/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u1.e3triangulo;

/**
 *
 * @author XxLok
 */
public class PruebaTriangulo {

    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        /*t.setLad1(29);
        t.setLad2(25.6);
        t.setLad3(73.8);*/
        t.setLados(29, 25.6, 73.8);
        t.imprimePerimetro();
    }
}
