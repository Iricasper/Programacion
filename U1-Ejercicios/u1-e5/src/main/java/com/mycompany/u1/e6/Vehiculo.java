/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u1.e6;

public class Vehiculo {
    //Propiedades
    public int numRuedas;
    public double potencia, litrosEnDeposito, consumoPorKm, kmRecorridos;
    public boolean arrancado;
    //Métodos
    public void setNumRuedas (int nuevoNumRuedas){
        numRuedas = nuevoNumRuedas;
    }
    public void setPotencia (double nuevaPotencia){
        potencia = nuevaPotencia;
    }
    public void setConsumoPorKm (double nuevoConsumoPorKm){
        consumoPorKm = nuevoConsumoPorKm;
    }
    public void reponerCombustible (double numLitrosRepuesto){
        litrosEnDeposito = litrosEnDeposito + numLitrosRepuesto;
    }
    public void recorrerDistancia (double numKm){
        litrosEnDeposito = litrosEnDeposito - (numKm * consumoPorKm);
        kmRecorridos= kmRecorridos + numKm;
    }
    public void arrancar (){
        arrancado = true;
    }
    public void apagar (){
        arrancado = false;
    }
    public void imprimeAutonomiaEnKm(){
        double autonomia;
        autonomia = litrosEnDeposito / consumoPorKm;
        System.out.println ("El vehiculo consume " + consumoPorKm +
                            " litros/km, tiene " + litrosEnDeposito + 
                            " litros en el deposito, asi que puede recorrer " + autonomia +
                            " km");
    }
    public void imprimeNumRuedas(){
        System.out.println("El numero de ruedas es: " + numRuedas);
    }
    public void imprimePotencia(){
        System.out.println("La potencia es: " + potencia);
    }
    public void imprimeLitrosEnDeposito(){
        System.out.println("Quedan " + litrosEnDeposito + "litros en el deposito");
    }
    public void imprimeKmRecorridos(){
        System.out.println("Kilometros recorridos: " + kmRecorridos);
    }
}
