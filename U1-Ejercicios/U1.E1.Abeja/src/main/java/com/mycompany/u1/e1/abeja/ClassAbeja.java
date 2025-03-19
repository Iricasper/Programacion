/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u1.e1.abeja;

/**
 *
 * @author XxLok
 */
public class ClassAbeja {
    //Propiedades
    public int posicionX;
    public int posicionY;
    public int CargasNectar;
    public boolean volando;
    public double peso;
    //Métodos
    public void cambiaPosicionX (int nuevaPosX) {
        posicionX = nuevaPosX;
    }
    public void imprimePosicionX(){
        System.out.println("Posición X: " + posicionX);
    }
    public void cambiaPosicionY(int nuevaPosY){
        posicionY = nuevaPosY;
    }
    public void imprimePosicionY(){
        System.out.println("Posición Y: " + posicionY);
    }
    public void numCargasNectar(int nuevaCarga){
        CargasNectar = nuevaCarga;
    }
    public void imprimeNumCargasNectar(){
        System.out.println("Número de cargas de néctar: " + CargasNectar);
    }
    public void cambiaPeso(double nuevoPeso){
        peso = nuevoPeso;
    }
    public void imprimePeso(double peso){
        System.out.println("Peso: " + peso);
    }
    public void vuela(){
        volando = true;
    }
    public void sePosa(){
        volando = false;
    }
    public void imprimeEstadoVuelo(){
        System.out.println("Está volando?: " + volando);
    }
}
