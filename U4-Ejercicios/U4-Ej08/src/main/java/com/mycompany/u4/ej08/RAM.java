/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej08;

/**
 *
 * @author usuario24
 */
public class RAM extends Dispositivo {

    // Propiedades
    private int[] num = new int[100];
    private int numOperacionesLectura;
    private int numOperacionesEscritura;

    // Métodos
    public void setNum(int nuevoNumero, int pos) {
        num[pos] = nuevoNumero;
        numOperacionesEscritura++;
    }

    public int getNum(int pos) {
        numOperacionesLectura++;
        return num[pos];
    }

    // Getters
    public int getNumOperacionesLectura() {
        return numOperacionesLectura;
    }

    public int getNumOperacionesEscritura() {
        return numOperacionesEscritura;
    }

    @Override
    public String toString() {
        return super.toString()+"RAM: " + "operacionesLectura=" + numOperacionesLectura + ", operacionesEscritura=" + numOperacionesEscritura + ". ";
    }

}
