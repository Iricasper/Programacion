/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.u4.ej15;

/**
 *
 * @author usuario24
 */
public interface InterfazImpresora {

    String getMarca();

    String getModelo();

    void encender();

    void apagar();

    void cargarBandeja(int numFolios);

    void imprimir(InterfazDocumento iDocum);

    String getEstado();
}
