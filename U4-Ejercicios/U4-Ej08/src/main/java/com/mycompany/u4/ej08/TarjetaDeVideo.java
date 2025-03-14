/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej08;

/**
 *
 * @author usuario24
 */
public class TarjetaDeVideo extends Dispositivo {

    // Propiedades
    private int numOperacionesNum;
    private int numOperacionesTexto;

    // Getters y Setters
    public int mostrarNumero(int num) {
        numOperacionesNum++;
        return num;
    }

    public String mostrarTexto(String texto) {
        numOperacionesTexto++;
        return texto;
    }

    public int getNumOperacionesNum() {
        return numOperacionesNum;
    }

    public int getNumOperacionesTexto() {
        return numOperacionesTexto;
    }

    @Override
    public String toString() {
        return super.toString()+"TarjetaDeVideo: " + "operacionesNum=" + numOperacionesNum + ", operacionesTexto=" + numOperacionesTexto+". ";
    }
    

}
