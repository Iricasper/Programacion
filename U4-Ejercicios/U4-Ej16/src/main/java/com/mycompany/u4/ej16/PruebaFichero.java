/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4.ej16;

/**
 *
 * @author usuario24
 */
public class PruebaFichero {

    public static void main(String[] args) {
        Fichero f = new Fichero();
        
        f.agregaContenido("Esto es un fichero"); // Da un error: el archivo no esta abierto.
        
        f.abrir(); // Da un error: el archivo no tiene nombre.
        
        f.setNombre("prueba.txt");
        
        f.abrir();
        
        f.agregaContenido("Esto es un fichero");
        
        f.agregaContenido(" creado por mi");
        
        System.out.println("Contenido del archivo: \"" + f.getContenido() + "\"");
        
        f.borraContenido();
        
        System.out.println("Contenido del archivo: \"" + f.getContenido() + "\"");        
        
        f.agregaContenido("Me he equivocado y no debi haberlo borrado");
        
        System.out.println("Contenido del archivo: \"" + f.getContenido() + "\"");
        System.out.println("El archivo ocupa " + f.getTamanioEnBytes() + " bytes");
        
        f.setCodificacion("Inventada");
        System.out.println("El archivo ocupa " + f.getTamanioEnBytes() + " bytes");
        
        f.setCodificacion("UTF-16");
        System.out.println("El archivo ocupa " + f.getTamanioEnBytes() + " bytes");
    }
}
