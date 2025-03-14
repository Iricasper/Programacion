/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4.ej11;

/**
 *
 * @author usuario24
 */
public class PruebaOrdenador {

    public static void main(String[] args) {
        Procesador p = new Procesador("AMC", "i5");
        RAM m = new RAM("Queenston", "8GB");
        TarjetaDeVideo t = new TarjetaDeVideo("Endivia", "2090");
        
        // Operaciones con los objetos
        p.encender();
        System.out.println("El resultado de multiplicar 4 por 3 es " +
                            p.multiplicar(4, 3));
        
        m.encender();
        m.setNum(123, 10);
        System.out.println("El valor de la celda cuyo indice es 10 es " + 
                            m.getNum(10));
        
        t.encender();
        System.out.println(t.mostrarNumero(10));
        System.out.println(t.mostrarTexto("Hola"));
    }
}