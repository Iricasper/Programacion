/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u3.e09.listanombres;

/**
 *
 * @author XxLok
 */
public class ListaNombres {

    //Propiedad
    private String[] lista = new String[20];

    public void añadirNombre(String nuevoNombre) {
        boolean bandera = false;
        for (int i = 0; i < lista.length; i++) {
            assert (!nuevoNombre.isBlank());
            if (lista[i] == null) {
                lista[i] = nuevoNombre;
                bandera = true;
                break;
            }
        }
        if (!bandera) {
            System.out.println("La lista esta llena");
        }
    }

    public void borrarNombre(String nombre) {
        boolean bandera = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                if (lista[i].equalsIgnoreCase(nombre)) {
                    lista[i] = null;
                    bandera = true;
                    break;
                }
            }
        }
        if (bandera) {
            System.out.println("Nombre borrado");
        } else {
            System.out.println("Nombre no encontrado");

        }
    }

    public void modificarNombre(String viejoNombre, String nuevoNombre) {
        boolean bandera = false;
        assert (!nuevoNombre.isBlank());
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                if (lista[i].equalsIgnoreCase(viejoNombre)) {
                    lista[i] = nuevoNombre;
                    bandera = true;
                    break;
                }
            }
        }
        if (bandera) {
            System.out.println("Nombre cambiado");
        } else {
            System.out.println("Nombre no encontrado");
        }
    }

    public void imprimeLista() {
        System.out.println("Estos son los nombres de la lista: ");
        for (String i : lista) {
            if (i != null) {
                System.out.print(i + " ");
            }
        }
    }
}
