/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abeja;

/**
 *
 * @author XxLok
 */
public class Abeja {
    //Propiedades
    public int posicionX;
    public int posicionY;
    public int numCargasNectar;
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
        numCargasNectar = nuevaCarga;
    }
    public void imprimeNumCargasNectar(){
        System.out.println("Número de cargas de néctar: " + numCargasNectar);
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
