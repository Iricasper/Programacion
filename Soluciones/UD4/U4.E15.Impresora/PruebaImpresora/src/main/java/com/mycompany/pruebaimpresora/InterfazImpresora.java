package com.mycompany.pruebaimpresora;

public interface InterfazImpresora {
    String getMarca();
    String getModelo();
    void encender();
    void apagar();
    void cargarBandeja(int numFolios);
    void imprimir(InterfazDocumento iDocum);
    String getEstado();
}
