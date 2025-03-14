/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4.ej1;

/**
 *
 * @author usuario24
 */
public class PruebaCochePersona {

    public static void main(String[] args) {
        Persona p1 = new Persona ("Miguel", "112233");
        Persona p2 = new Persona ();
        p2.setNombre("Gema");
        p2.setDni("223344");
        
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        
        p1.comprarCoche(coche1);
        p2.venderCoche();
        p1.arrancarCoche();
        p1.venderCoche();
        p1.recorrerDistancia(100);
    }
}