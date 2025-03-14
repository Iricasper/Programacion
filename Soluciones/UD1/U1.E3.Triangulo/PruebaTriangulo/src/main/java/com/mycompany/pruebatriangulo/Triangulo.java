package com.mycompany.pruebatriangulo;

public class Triangulo {
    public double tamLado1;
    public double tamLado2;
    public double tamLado3;
    
    public void cambiaLado1 (double nuevoTamanio) {
        tamLado1 = nuevoTamanio;
    }
    
    public void cambiaLado2 (double nuevoTamanio) {
        tamLado2 = nuevoTamanio;
    }
    
    public void cambiaLado3 (double nuevoTamanio) {
        tamLado3 = nuevoTamanio;
    }
    
    public void imprimePerimetro () {
        double perimetro;
        perimetro = tamLado1 + tamLado2 + tamLado3;
        System.out.println("El perímetro del triángulo es: " + perimetro);
    }
    
    public void imprimeDescripcion () {
        System.out.println("Soy un triángulo y el tamaño de mis lados es\n" +
                           "lado1=" + tamLado1 + ", lado2=" + tamLado2 + " y lado3=" + tamLado3);
    }
}
