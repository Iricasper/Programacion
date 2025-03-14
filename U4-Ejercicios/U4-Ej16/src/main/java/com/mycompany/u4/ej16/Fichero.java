/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej16;

/**
 *
 * @author usuario24
 */
public class Fichero implements InterfazFichero {

    // Propiedades
    private String nombre;
    private String codificacion = "UTF-8";
    private String contenido;
    private boolean abierto;
    private int tamanioEnBytes;

    // Métodos
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setCodificacion(String codificacion) {
        if (codificacion.equalsIgnoreCase("UTF-16")) {
            this.codificacion = "UTF-16";
        } else {
            this.codificacion = "UTF-8";
        }
    }

    @Override
    public String getCodificacion() {
        if (codificacion == null) {
            codificacion = "UTF-8";
        }
        return codificacion;
    }

    @Override
    public void abrir() {
        if (nombre != null) {
            abierto = true;
        }
    }

    @Override
    public void cerrar() {
        abierto = false;
    }

    @Override
    public void borraContenido() {
        if (abierto) {
            contenido = "";
        }
    }

    @Override
    public void agregaContenido(String contenido) {
        if (abierto) {
            this.contenido = this.contenido + contenido;
        }
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public int getTamanioEnBytes() {
        if (codificacion.equals("UTF-16")) {
            tamanioEnBytes = contenido.length() * 2;
        } else {
            tamanioEnBytes = contenido.length();
        }
        return tamanioEnBytes;
    }

}
