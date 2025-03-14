package com.mycompany.u2.e30.dadotriple6;

public class Dado {

    //Propiedades
    int tirada1, tirada2, tirada3;

    //Métodos
    public int tirada1() {
        tirada1 = (int) (Math.random() * 6 + 1);
        return tirada1;
    }

    public int tirada2() {
        tirada2 = (int) (Math.random() * 6 + 1);
        return tirada2;
    }
    
    public int tirada3() {
        tirada3 = (int) (Math.random() * 6 + 1);
        return tirada3;
    }
}
