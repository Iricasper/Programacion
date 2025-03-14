package com.mycompany.pruebaimpresora;

public class PruebaImpresora {

    public static void main(String[] args) {
        Impresora imp = new Impresora();
        imp.setMarca("HP");
        imp.setModelo("Laserjet 2000");
        imp.cargarBandeja(5);
        imp.encender();
        
        DocumentoTexto doc1 = new DocumentoTexto();
        doc1.setTitulo("Titulo 1");
        doc1.setContenido("Este es el contenido del primer documento ...");
        doc1.setNumPaginasImpresion(4);
        
        DocumentoTexto doc2 = new DocumentoTexto();
        doc2.setTitulo("Titulo 2");
        doc2.setContenido("Este es el contenido del segundo documento ...");
        doc2.setNumPaginasImpresion(3);
        
        imp.imprimir(doc1);
        imp.imprimir(doc2);
        imp.cargarBandeja(25);
        imp.imprimir(doc2);
    }
}
