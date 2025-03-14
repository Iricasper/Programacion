package com.mycompany.pruebacamion;

public class Camion <T> {
    private T carga;
    
    public void cargar(T objeto) {
        carga = objeto;
    }
    
    public T descargar() {
        T auxiliar = carga;
        carga = null;
        return auxiliar;
    }

    public boolean isVacio() {
        return carga == null;
    }

}
