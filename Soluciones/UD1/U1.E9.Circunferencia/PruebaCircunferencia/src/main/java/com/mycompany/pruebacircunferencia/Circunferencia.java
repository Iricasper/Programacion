package com.mycompany.pruebacircunferencia;

public class Circunferencia {
    public double radio;
    
    public void estableceRadio (double nuevoRadio) {
        radio = nuevoRadio;
    }
    
    public double calculaPerimetro () {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    
    public double calculaSuperficie () {
        double superficie = Math.PI * radio * radio;
        return superficie;
    }
}
