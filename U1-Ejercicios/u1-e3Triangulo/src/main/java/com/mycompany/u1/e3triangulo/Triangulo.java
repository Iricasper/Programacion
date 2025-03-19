/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u1.e3triangulo;

/**
 *
 * @author XxLok
 */
public class Triangulo {
    //Propiedades
    public double lad1, lad2, lad3;
    //Métodos
    public double setLad1 (double nuevoLad1){
        lad1 = nuevoLad1;
        return lad1;
    }
    public double setLad2 (double nuevoLad2){
        lad2 = nuevoLad2;
        return lad2;
    }
    public double setLad3 (double nuevoLad3){
        lad3 = nuevoLad3;
        return lad3;
    }
    public void setLados (double lad1, double lad2, double lad3){
        this.lad1 = lad1; this.lad2 = lad2; this.lad3 = lad3;
    }
    /*
    public void imprimeDatos(){
        double perimetro;
        perimetro = lad1 + lad2 + lad3;
        System.out.println ("El perimetro del triangulo es: "+ perimetro +
                            ". Sus lados son " + lad1 + ", " + lad2 +
                            " y " + lad3);
    }
    */
    public double calculaPerimetro(){
        double perimetro;
        perimetro = lad1 + lad2 + lad3;
        return perimetro;
    }
    public void imprimePerimetro(){
        double imprPerimetro = calculaPerimetro();
        System.out.println("El valor del perimetro es: " + imprPerimetro + 
                           ". Sus lados son " + lad1 + ", " + lad2 +
                           " y " + lad3);
    }
}
