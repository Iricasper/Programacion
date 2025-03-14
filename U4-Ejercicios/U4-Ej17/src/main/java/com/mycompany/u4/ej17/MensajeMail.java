/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej17;

/**
 *
 * @author usuario24
 */
public class MensajeMail implements InterfazMensajeMail {

    // Propiedades
    private String asunto;
    private String contenido;
    private String remitente;
    private String destinatario;
    private InterfazFichero fich;

    @Override
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Override
    public String getAsunto() {
        return asunto;
    }

    @Override
    public void setContenido(String contenido) {
        if (fich != null) {
            fich.agregaContenido(contenido);
        }
    }

    @Override
    public String getContenido() {
        return fich.getContenido();
    }

    @Override
    public void setRemitente(String direccionEmail) {
        if (direccionEmail.contains("@") && direccionEmail.length() >= 5) {
            remitente = direccionEmail;
        }
    }

    @Override
    public String getRemitente() {
        return remitente;
    }

    @Override
    public void setDestinatario(String direccionEmail) {
        if (direccionEmail.contains("@") && direccionEmail.length() >= 5) {
            destinatario = direccionEmail;
        }
    }

    @Override
    public String getDestinatario() {
        return destinatario;
    }

    @Override
    public void setFicheroAdjunto(InterfazFichero fichero) {
        fich = fichero;
    }

    @Override
    public void eliminaFicheroAdjunto() {
        fich = null;
    }

    @Override
    public InterfazFichero getFicheroAdjunto() {
        return fich;
    }

    @Override
    public void envia() {
        if (remitente != null && destinatario != null) {
            if (asunto == null || contenido == null) {
                System.out.println("OJO: estás enviando un mensaje sin asunto/contenido");
            }
            if (fich != null) {
                System.out.println("Mensaje enviado de " + getRemitente()
                        + " a " + getDestinatario() + " con asunto " + getAsunto()
                        + " y con un fichero adjunto de "
                        + getFicheroAdjunto().getTamanioEnBytes() + " bytes");
            } else {
                System.out.println("Mensaje enviado de " + getRemitente()
                        + " a " + getDestinatario() + " con asunto " + getAsunto());
            }
        }
    }

}
