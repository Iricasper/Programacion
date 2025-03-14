package com.mycompany.u2.e30.dadotriple6;

public class DadoMejorado {

    //Propiedades
    int tirada;

    //Métodos
    public int tirada() {
        tirada = (int) (Math.random() * 6 + 1);
        return tirada;
    }
}
