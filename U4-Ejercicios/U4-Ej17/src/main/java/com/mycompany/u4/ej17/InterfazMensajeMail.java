/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.u4.ej17;

/**
 *
 * @author usuario24
 */
public interface InterfazMensajeMail {

    void setAsunto(String asunto);

    String getAsunto();

    void setContenido(String contenido);

    String getContenido();

    void setRemitente(String direccionEmail);

    String getRemitente();

    void setDestinatario(String direccionEmail);

    String getDestinatario();

    void setFicheroAdjunto(InterfazFichero fichero);

    void eliminaFicheroAdjunto();

    InterfazFichero getFicheroAdjunto();

    void envia();
}
