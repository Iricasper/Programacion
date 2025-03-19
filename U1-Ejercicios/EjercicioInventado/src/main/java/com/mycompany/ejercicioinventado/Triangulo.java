package com.mycompany.ejercicioinventado;

public class Triangulo {
    //Propiedades
    public float lado1;
    public float lado2;
    public float lado3;
    //Métodos
    public void cambioLado1(float nuevoLado1){
        lado1=nuevoLado1;
    }
    public void cambioLado2(float nuevoLado2){
        lado2=nuevoLado2;
    }
    public void cambioLado3(float nuevoLado3){
        lado3=nuevoLado3;
    }
    public void imprimeDescripcion(){
        System.out.println("Soy un triángulo y mis lados son Lado1: "+lado1+", Lado2: "+lado2+" y lado 3: "+lado3);
    }
    public void imprimePerimetro(){
        float perimetro;
        perimetro = lado1+lado2+lado3;
        System.out.println("Mi perímetro es igual a: "+perimetro);
    }
}
