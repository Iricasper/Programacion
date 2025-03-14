package com.mycompany.pruebamensajemail;

public class MensajeMail implements InterfazMensajeMail {
    private String asunto;
    private String contenido;
    private String remitente;
    private String destinatario;
    private InterfazFichero adjunto;
    

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
        this.contenido = contenido;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public void setRemitente(String direccionEmail) {
        if (!direccionEmail.contains("@")) {
            System.out.println("No contiene la arroba");
        } else {
            if (direccionEmail.length() < 5) {
                System.out.println("Longitud minima: 5 caracteres");
            } else {
                this.remitente = direccionEmail;
            }
        }
    }

    @Override
    public String getRemitente() {
        return remitente;
    }

    @Override
    public void setDestinatario(String direccionEmail) {
        if (!direccionEmail.contains("@")) {
            System.out.println("No contiene la arroba");
        } else {
            if (direccionEmail.length() < 5) {
                System.out.println("Longitud minima: 5 caracteres");
            } else {
                this.destinatario = direccionEmail;
            }
        }
    }

    @Override
    public String getDestinatario() {
        return destinatario;
    }

    @Override
    public void setFicheroAdjunto(InterfazFichero fichero) {
        this.adjunto = fichero;
    }

    @Override
    public void eliminaFicheroAdjunto() {
        adjunto = null;
    }

    @Override
    public InterfazFichero getFicheroAdjunto() {
        return adjunto;
    }

    @Override
    public void envia() {
        if (remitente == null || destinatario == null) {
            System.out.println("Falta el remitente y/o el destinatario");
        } else {
            if (asunto == null || asunto.equals("") ||
                contenido == null || contenido.equals("")) {
                System.out.println("OJO: Estás enviando un mensaje sin asunto/contenido");
            }
            
            if (adjunto == null) {
                System.out.println("Mensaje enviado de " + remitente + " a " +
                                   destinatario + " con asunto " + (asunto == null ? "(vacio)" : ("\"" + asunto + "\"")));
            } else {
                System.out.println("Mensaje enviado de " + remitente + " a " +
                                   destinatario + " con asunto " + (asunto == null ? "(vacio)" : ("\"" + asunto + "\"")) +
                                   " y con un fichero adjunto de " +
                                   adjunto.getTamanioEnBytes() + " bytes");
            }
        }
    }
    
}