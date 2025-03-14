package com.mycompany.pruebadispositivo;

public class MemoriaRAM extends Dispositivo {
    private int listaNumeros[] = new int[100];
    private int numLecturas;
    private int numEscrituras;
    
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
    
    @Override
    public String toString() {
        return super.toString() + "Memoria RAM: lecturas=" + numLecturas +
               ", escrituras=" + numEscrituras;
    }
    
}
