package com.mycompany.pruebadocumentotexto;

public class PruebaDocumentoTexto {

    public static void main(String[] args) {
        DocumentoTexto d = new DocumentoTexto();
        
        d.setTitulo("Apuntes de interfaces en java");
        d.setContenido("Las interfaces en java contienen un catalogo de intenciones abstractas...");
        d.setNumPaginasImpresion(1);
        
        System.out.println("El titulo del documento es: " + d.getTitulo());
        System.out.println("El contenido del documento es: " + d.getContenido());
        System.out.println("El documento tiene " + d.getNumPaginasImpresion() + " pagina/s.");
    }
}
