package com.mycompany.pruebadispositivo;

public class TarjetaVideo extends Dispositivo {
    private int numMuestraEntero;
    private int numMuestraTexto;
    
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
    
    @Override
    public String toString() {
        return super.toString() + "Tarjeta de video: enteros=" + numMuestraEntero +
               ", textos=" + numMuestraTexto;
    }
}
