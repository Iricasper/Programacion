/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u3.e10.listacontactos;

/**
 *
 * @author XxLok
 */
public class ListaContactos {

    // Propiedades
    private Contacto[] lista;

    // Constructor
    public ListaContactos(int longitud) {
        lista = new Contacto[longitud];
    }

    // Métodos
    public void agregarContacto(Contacto contacto) {
        boolean duplicado = false;
        int i;
        for (Contacto elem : lista) {
            if (elem.getNombre().equals(contacto.getNombre()) && elem.getApellidos().equals(contacto.getApellidos())) {
                duplicado = true;
                break;
            }
        }
        for (i = 0; i < lista.length && !duplicado; i++) {
            if (lista[i] == null) {
                lista[i] = contacto;
            }
        }
        if (duplicado) {
            System.out.println("El contacto ya estaba en la lista");
        } else if (i == lista.length) {
            System.out.println("La lista esta llena");
        } else {
            System.out.println("El contacto se ha guardado");
        }
    }

    public String buscarContacto(int telefonoBuscado) {
        boolean encontrado = false;
        int i;
        for (i = 0; i < lista.length; i++) {
            if (lista[i].getTelefono() == telefonoBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            return lista[i].imprimeContacto();
        } else {
            return null;
        }
    }

    public String buscarContacto(String emailBuscado) {
        boolean encontrado = false;
        int i;
        for (i = 0; i < lista.length; i++) {
            if (lista[i].getEmail().equals(emailBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            return lista[i].imprimeContacto();
        } else {
            return null;
        }
    }

    public String buscarContacto(String nombreBuscado, String apellidoBuscado) {
        boolean encontrado = false;
        int i;
        for (i = 0; i < lista.length; i++) {
            if (lista[i].getNombre().equals(nombreBuscado) && lista[i].getApellidos().equals(apellidoBuscado)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            return lista[i].imprimeContacto();
        } else {
            return null;
        }
    }

    public void borrarContacto(int telefonoBuscado) {
        boolean borrado = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getTelefono() == telefonoBuscado) {
                lista[i] = null;
                borrado = true;
                break;
            }
        }
        if (borrado) {
            System.out.println("Contacto borrado");
        }
    }

    public void borrarContacto(String emailBuscado) {
        boolean borrado = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getEmail().equals(emailBuscado)) {
                lista[i] = null;
                borrado = true;
                break;
            }
        }
        if (borrado) {
            System.out.println("Contacto borrado");
        }
    }
    
    public void borrarContacto(String nombreBuscado, String apellidoBuscado) {
        boolean borrado = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getNombre().equals(nombreBuscado) && lista[i].getApellidos().equals(apellidoBuscado)) {
                lista[i] = null;
                borrado = true;
                break;
            }
        }
        if (borrado) {
            System.out.println("Contacto borrado");
        } else {
            
        }
    }
    
    public void vaciarLista() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = null;
        }
    }
}
