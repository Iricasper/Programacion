/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.u4.ej16;

/**
 *
 * @author usuario24
 */
public interface InterfazFichero {

    String getNombre();

    void setNombre(String nombre);

    void setCodificacion(String codificacion);

    String getCodificacion();

    void abrir();

    void cerrar();

    void borraContenido();

    void agregaContenido(String contenido);

    String getContenido();

    int getTamanioEnBytes();
}
