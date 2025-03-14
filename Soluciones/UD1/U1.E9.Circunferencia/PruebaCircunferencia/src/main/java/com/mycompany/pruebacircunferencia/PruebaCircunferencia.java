package com.mycompany.pruebacircunferencia;

public class PruebaCircunferencia {

    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        
        c1.estableceRadio(2.25);
        System.out.println("El perímetro es " + c1.calculaPerimetro());
        System.out.println("El área es " + c1.calculaSuperficie());
    }
}
