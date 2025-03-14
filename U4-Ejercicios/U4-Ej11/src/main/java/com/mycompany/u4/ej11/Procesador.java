/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej11;

/**
 *
 * @author usuario24
 */
public class Procesador extends Dispositivo {

    // Propiedades
    private int numOperaciones;

    public Procesador(String marca, String modelo) {
        super(marca, modelo);
    }

    // Métodos
    public int sumar(int num1, int num2) {
        numOperaciones++;
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        numOperaciones++;
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        numOperaciones++;
        return num1 * num2;
    }

    public int dividir(int num1, int num2) {
        numOperaciones++;
        return num1 * num2;
    }

    public int getNumOperaciones() {
        return numOperaciones;
    }

}
