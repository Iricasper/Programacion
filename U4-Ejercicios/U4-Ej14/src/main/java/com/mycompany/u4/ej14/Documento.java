/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej14;

/**
 *
 * @author usuario24
 */
public class Documento implements InterfazDocumento {
    // Propiedades
    private String titulo;
    private String contenido;
    private int numPaginas;
    
    // Métodos
    @Override
    public String getTitulo() {
        return titulo;
    }
    

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public void setContenido(String contenido) {
        this.contenido  = contenido;
    }

    @Override
    public int getNumPaginasImpresion() {
        return numPaginas;
    }

    @Override
    public void setNumPaginasImpresion(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
}
