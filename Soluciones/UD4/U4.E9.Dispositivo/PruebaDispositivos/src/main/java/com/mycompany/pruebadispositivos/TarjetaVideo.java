package com.mycompany.pruebadispositivos;

public class TarjetaVideo extends Dispositivo {
    private int numMuestraEntero;
    private int numMuestraTexto;
    
    @Override
    public void encender() {
        super.encender();
        resetContadores();
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
    
    
    @Override
    public void resetContadores() {
        numMuestraEntero = numMuestraTexto = 0;
    }
}
