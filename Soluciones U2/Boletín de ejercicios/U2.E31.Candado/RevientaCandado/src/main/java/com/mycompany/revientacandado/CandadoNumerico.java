package com.mycompany.revientacandado;

public class CandadoNumerico {
    public int numSecreto;
    
    public void setNumSecreto (int nuevoNumSecreto) {
        numSecreto = nuevoNumSecreto;
    }
    
    public boolean seAbreCon (int numero) {
        return numero == numSecreto ? true : false;
    }
}
