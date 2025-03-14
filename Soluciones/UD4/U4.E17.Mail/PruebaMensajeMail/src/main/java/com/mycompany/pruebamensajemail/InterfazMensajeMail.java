package com.mycompany.pruebamensajemail;

public interface InterfazMensajeMail {
    void setAsunto (String asunto);
    String getAsunto();
    void setContenido(String contenido);
    String getContenido();
    void setRemitente (String direccionEmail);
    String getRemitente();
    void setDestinatario (String direccionEmail);
    String getDestinatario();
    void setFicheroAdjunto (InterfazFichero fichero);
    void eliminaFicheroAdjunto();
    InterfazFichero getFicheroAdjunto();
    void envia();
}
