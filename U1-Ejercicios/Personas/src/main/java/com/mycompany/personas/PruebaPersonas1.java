/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.personas;

/**
 *
 * @author XxLok
 */
public class PruebaPersonas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personas1 antonio;
        antonio = new Personas1();
        
        antonio.cambiaNombre("Antonio");
        antonio.cambiaApellidos("García Méndez");
        antonio.cambiaEdad(32);
        
        antonio.imprimeNombre();
        antonio.imprimeApellidos();
        antonio.imprimeEdad();
    }
}
