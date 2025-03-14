/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.u3.e09.listanombres;

import java.util.Scanner;

/**
 *
 * @author XxLok
 */
public class PruebaListaNombres {

    public static void main(String[] args) {

        ListaNombres l = new ListaNombres();
        int opcion;

        do {
            menu();
            opcion = lecturaSwitch();
            if (opcion == 0) {
                System.out.println("Hasta luego");
            } else {
                catalogo(opcion, l);
            }
        } while (opcion != 0);
    }

    public static void menu() {
        System.out.println("\nMENU DE USUARIO");
        System.out.println("-------------------------------------------------");
        System.out.println("0 - Salir");
        System.out.println("1 - Anadir nombre");
        System.out.println("2 - Borrar nombre");
        System.out.println("3 - Modificar nombre");
        System.out.println("4 - Mostrar lista");
    }

    public static void catalogo(int opcion, ListaNombres l) {
        switch (opcion) {
            case 0:
                break;
            case 1:
                agregar(l);
                break;
            case 2:
                eliminar(l);
                break;
            case 3:
                modificar(l);
                break;
            case 4:
                imprimir(l);
                break;
            default:
                System.out.println("Pero tu eres gilipollas o que");
        }
    }

    public static int lecturaSwitch() {
        Scanner num = new Scanner(System.in);
        System.out.print("Introduce una opcion: ");
        return num.nextInt();
    }

    public static String lecturaNombre() {
        String nombre;
        // Scanner nombres
        Scanner nom = new Scanner(System.in);
        nombre = nom.nextLine();
        return nombre;
    }

    public static void agregar(ListaNombres l) {
        System.out.println("\nEscribe el nombre que quieres agregar: ");
        l.añadirNombre(lecturaNombre());
    }

    public static void eliminar(ListaNombres l) {
        System.out.println("\nEscribe el nombre que quieres borrar :");
        l.borrarNombre(lecturaNombre());
    }

    public static void modificar(ListaNombres l) {
        System.out.println("\nEscribe el nombre que quieres reemplazar, y a "
                + "continuacion el que quieres poner en su lugar");
        l.modificarNombre(lecturaNombre(), lecturaNombre());
    }

    public static void imprimir(ListaNombres l) {
        l.imprimeLista();
    }
}
