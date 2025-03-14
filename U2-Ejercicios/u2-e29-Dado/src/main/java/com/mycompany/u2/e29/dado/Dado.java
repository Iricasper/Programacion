package com.mycompany.u2.e29.dado;

public class Dado {
    
    //Propiedades
    int tirada;
    
    //Métodos
    public int tirada() {
        tirada = (int) (Math.random() * 6 + 1);
        return tirada;
    }
}
