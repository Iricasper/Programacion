/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personas;

/**
 *
 * @author XxLok
 */
public class Personas1 {
            //Propiedades
        public String nombre;
        public String apellidos;
        public int edad;
        //Métodos
        public void cambiaNombre (String nuevoNombre) {
            nombre = nuevoNombre;
        }
        public void imprimeNombre (){
            System.out.println("Nombre: " + nombre);
        }
        public void cambiaApellidos (String nuevosApellidos){
            apellidos = nuevosApellidos;
        }
        public void imprimeApellidos (){
            System.out.println("Apellidos: " + apellidos);
        }
        public void cambiaEdad (int nuevaEdad) {
            edad = nuevaEdad;
        }
        public void imprimeEdad (){
            System.out.println("Edad: " + edad);
        }
    }
