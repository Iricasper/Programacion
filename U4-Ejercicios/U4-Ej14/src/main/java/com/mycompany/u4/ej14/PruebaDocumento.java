/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4.ej14;

/**
 *
 * @author usuario24
 */
public class PruebaDocumento {

    public static void main(String[] args) {
        Documento d = new Documento();
        
        d.setTitulo("Mort");
        d.setContenido("una aventura increible del Mundodisco");
        d.setNumPaginasImpresion(302);
        
        System.out.println("El libro se llama "+d.getTitulo()+", contiene "
                + d.getContenido() + " y consta de " + d.getNumPaginasImpresion()
                + " paginas.");
    }
}
