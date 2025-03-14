/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u4.ej15;

/**
 *
 * @author usuario24
 */
public class Impresora implements InterfazImpresora {

    // Propiedades
    private String marca;
    private String modelo;
    private String estado;
    private boolean encendido;
    private int numFolios;
    
    // Constructor
    public Impresora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos
    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void encender() {
        encendido = true;
        estado = "OK";
    }

    @Override
    public void apagar() {
        encendido = false;
        estado = "Fuera de servicio";
    }

    @Override
    public void cargarBandeja(int numFolios) {
        this.numFolios += numFolios;
    }

    @Override
    public void imprimir(InterfazDocumento iDocum) {
        if (encendido) {
            if (numFolios >= iDocum.getNumPaginasImpresion()) {
                System.out.println("Se esta imprimiendo el documento "
                        + iDocum.getTitulo() + " que ocupa "
                        + iDocum.getNumPaginasImpresion() + " paginas.");
                this.numFolios -= iDocum.getNumPaginasImpresion();
            } else {
                System.out.println("Error: no hay suficiente papel para imprimir"
                        + " el documento " + iDocum.getTitulo());
                estado = "Falta papel";
            }
        } else {
            System.out.println("ERROR: La impresora esta apagada");
        }
    }

    @Override
    public String getEstado() {
        return estado;
    }

}
