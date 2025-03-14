package com.mycompany.pruebadispositivos;

public class MemoriaRAM extends Dispositivo {
    private int listaNumeros[] = new int[100];
    private int numLecturas;
    private int numEscrituras;
    
    public MemoriaRAM(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public void encender() {
        super.encender();
        numLecturas = numEscrituras = 0;
    }
    
    public void modificaValor (int posicion, int nuevoValor) {
        listaNumeros[posicion] = nuevoValor;
        numEscrituras++;
    }
    
    public int obtenerValor (int posicion) {
        numLecturas++;
        return listaNumeros[posicion];
    }

    public int getNumLecturas() {
        return numLecturas;
    }

    public int getNumEscrituras() {
        return numEscrituras;
    }
    
    
    
}
