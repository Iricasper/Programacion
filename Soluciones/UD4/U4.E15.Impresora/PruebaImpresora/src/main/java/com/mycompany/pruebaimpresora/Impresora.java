package com.mycompany.pruebaimpresora;

public class Impresora implements InterfazImpresora {
    private String marca;
    private String modelo;
    private boolean encendida;
    private String estado;
    private int numFolios;
    
    
    @Override
    public String getMarca() {
        return marca;
    }
    
    
    @Override
    public String getModelo() {
        return modelo;
    }
    
    
    public void setMarca (String marca) {
        this.marca = marca;
    }
    
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
        
    
    @Override
    public void encender() {
        encendida = true;
        estado = "OK";
    }
    
    
    @Override
    public void apagar() {
        encendida = false;
        estado = "Fuera de servicio";
    }
    
    
    @Override
    public void cargarBandeja(int numFolios) {
        this.numFolios += numFolios;
        if (encendida) {
            estado = "OK";
        } else {
            estado = "Fuera de servicio";
        }
    }
    
    
    @Override
    public void imprimir(InterfazDocumento iDocum) {
        if (!encendida) {
            System.out.println("La impresora está apagada.");
        } else {
            if (iDocum.getNumPaginasImpresion() <= numFolios) {
                System.out.println("Se está imprimiendo el documento \"" + iDocum.getTitulo() +
                                   "\" que ocupa " + iDocum.getNumPaginasImpresion() + " paginas");
                numFolios -= iDocum.getNumPaginasImpresion();
            } else {
                System.out.println("Error: no hay suficiente papel para imprimir el documento \"" +
                                   iDocum.getTitulo() + "\"");
                estado = "Falta papel";
            }
        }
    }
    
    
    @Override
    public String getEstado() {
        return estado;
    }
}
