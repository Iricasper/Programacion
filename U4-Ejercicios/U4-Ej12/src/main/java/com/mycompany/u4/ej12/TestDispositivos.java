/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.u4.ej12;

/**
 *
 * @author usuario24
 */
public class TestDispositivos {

    public static void main(String[] args) {
        Dispositivo[] d = new Dispositivo[5];

        Procesador p1 = new Procesador("a", "a");
        Procesador p2 = new Procesador("b", "b");
        RAM r1 = new RAM("c", "c");
        RAM r2 = new RAM("d", "d");
        TarjetaDeVideo t1 = new TarjetaDeVideo("e", "e");

        d[0] = p1;
        d[1] = p2;
        d[2] = r1;
        d[3] = r2;
        d[4] = t1;

        for (Dispositivo ale : d) {
            int cont = 0;
            do {
                ale.encender();
                ale.apagar();
                cont++;
            } while (cont>100);
        }
    }
}