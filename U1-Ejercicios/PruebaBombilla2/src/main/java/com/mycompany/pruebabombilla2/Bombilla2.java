/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebabombilla2;

/**
 *
 * @author XxLok
 */
public class Bombilla2 {
    //Propiedades
    public String marca;
    public int potencia;
    public boolean encendido;
    //Métodos
    public void cambiaMarca (String nuevaMarca) {
        marca = nuevaMarca;
    }
    public void imprimeMarca () {
        System.out.println ("Marca: " + marca);
    }
    public void cambiaPotencia (int nuevaPotencia) {
        potencia = nuevaPotencia;
    }
    public void imprimePotencia () {
        System.out.println ("Potencia: " + potencia);
    }
    public void encender () {
        encendido = true;
    }
    public void apagar () {
        encendido = false;
    }
    public void imprimeEstado () {
        System.out.println ("Encendida?: " + encendido);
    }
}
