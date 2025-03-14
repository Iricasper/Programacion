package com.mycompany.pruebadispositivos;

public class TarjetaVideo extends Dispositivo {
    private int numMuestraEntero;
    private int numMuestraTexto;
    
    public TarjetaVideo(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public void encender() {
        super.encender();
        numMuestraEntero = numMuestraTexto = 0;
    }
    
    public void muestraEntero (int n) {
        System.out.println("Numero: " + n);
        numMuestraEntero++;
    }
    
    public void muestraTexto (String texto) {
        System.out.println("Texto: " + texto);
        numMuestraTexto++;
    }
}
