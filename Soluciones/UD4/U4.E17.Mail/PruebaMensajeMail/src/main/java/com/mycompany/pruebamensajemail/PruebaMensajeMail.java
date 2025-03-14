package com.mycompany.pruebamensajemail;

public class PruebaMensajeMail {

    public static void main(String[] args) {
        MensajeMail msg = new MensajeMail();
        
        msg.setContenido("Hola, te confirmo que ire a la cita. Un saludo.");
        
        msg.setRemitente("pepe@gmail.com");
        
        msg.envia();
        
        msg.setDestinatario("manolo");
        msg.setDestinatario("m@g");
        msg.setDestinatario("manolo@gmail.com");
        
        msg.envia();
        
        msg.setAsunto("Confirmacion");
        
        msg.envia();
        
        Fichero f = new Fichero();
        f.setNombre("fichero.txt");
        f.abrir();
        f.agregaContenido("Contenido encriptado...");
        f.cerrar();
        
        msg.setFicheroAdjunto(f);
        
        msg.envia();
    }
}
