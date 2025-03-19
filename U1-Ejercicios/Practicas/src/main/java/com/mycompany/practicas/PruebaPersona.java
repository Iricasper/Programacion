/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

/**
 *
 * @author XxLok
 */
public class PruebaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Practicas antonio;
        antonio = new Practicas();
        
        antonio.cambiaNombre("Antonio");
        antonio.cambiaApellidos("García Méndez");
        antonio.cambiaEdad(32);
        
        antonio.imprimeNombre();
        antonio.imprimeApellidos();
        antonio.imprimeEdad();
    }
    
}
