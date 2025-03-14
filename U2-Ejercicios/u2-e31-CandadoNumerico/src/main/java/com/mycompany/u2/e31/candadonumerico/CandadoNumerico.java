package com.mycompany.u2.e31.candadonumerico;

public class CandadoNumerico {
    //Propiedades
    int numSecreto;
    
    //Métodos

    public void setNumSecreto(int nuevoNumSecreto) {
        numSecreto = nuevoNumSecreto;
    }
    
    public boolean seAbreCon (int numero) {
        boolean abierto = false;
        if (numero == numSecreto) {
            abierto = true;
        }
        return abierto;
    }
}
