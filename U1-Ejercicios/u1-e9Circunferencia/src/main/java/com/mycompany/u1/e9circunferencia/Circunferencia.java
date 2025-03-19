package com.mycompany.u1.e9circunferencia;

public class Circunferencia {
    
    //Propiedades
    public double radio;
    
    //Métodos
    public void estableceRadio (double nuevoRadio){
        radio = nuevoRadio;
    }
    public double calculaPerimetro(){
        double perimetro;
        perimetro = Math.PI*radio*2;
        return perimetro;
    }
    public double calculaSuperficie(){
        double superficie;
        superficie = Math.PI*Math.pow(radio, 2);
        return superficie;
    }
}
