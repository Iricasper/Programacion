package com.mycompany.pruebadocumentotexto;

public interface InterfazDocumento {
    String getTitulo();
    void setTitulo(String titulo);
    String getContenido();
    void setContenido(String contenido);
    int getNumPaginasImpresion();
    void setNumPaginasImpresion(int numPaginas);    
}
