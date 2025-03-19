package com.mycompany.pruebadado;

public class Dado {
    public int tirada () {
        int tirada = (int) (Math.random()*6 + 1);
        return tirada;
    }
}
