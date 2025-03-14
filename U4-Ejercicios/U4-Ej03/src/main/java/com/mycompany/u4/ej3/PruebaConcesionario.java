/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4.ej3;

/**
 *
 * @author usuario24
 */
public class PruebaConcesionario {

    public static void main(String[] args) {
        Cliente cl1 = new Cliente("John", "11111111A");
        Cliente cl2 = new Cliente("Anne", "22222222B");
        Cliente cl3 = new Cliente("Tom", "33333333C");
        
        Coche co1 = new Coche("Seat", "Ibiza", "1234-IBZ");
        Venta v1 = new Venta("ayer", 12000, cl1, co1);
        
        Coche co2 = new Coche("Opel", "Corsa", "4321-COR");
        Venta v2 = new Venta("hoy", 9900, cl2, co2);
        
        Coche co3 = new Coche("Seat", "Toledo", "5678-TOL");
        Venta v3 = new Venta("anteayer", 12900, cl3, co3);
        
        System.out.println("Ventas:");
        System.out.println(v1.getFecha() + v1.getImporte() + v1.getCoche().getModelo() + v1.getCliente().getNombre());
        System.out.println(v2.getFecha() + v2.getImporte() + v2.getCoche().getModelo() + v2.getCliente().getNombre());
        System.out.println(v3.getFecha() + v3.getImporte() + v3.getCoche().getModelo() + v3.getCliente().getNombre());
    }
}
