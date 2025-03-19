package com.mycompany.pruebalistanombres;

import java.util.Scanner;


public class PruebaListaNombres {

    public static void main(String[] args) {
        ListaNombres l = new ListaNombres();
        int opcion;
        
        do {
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion (opcion, l);
        } while (opcion != 0);
    }
    
    
    public static void mostrarMenu() {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("--------------------------------------------");
        System.out.println("0-Salir");
        System.out.println("1-Añadir nombre");
        System.out.println("2-Borrar nombre");
        System.out.println("3-Modificar nombre");
        System.out.println("4-Listar nombres");
    }
    
    
    public static int leerOpcion() {
        Scanner sc = new Scanner (System.in);
        System.out.print("\nIntroduzca opcion: ");
        return (sc.nextInt());
    }
    
    
    public static void ejecutarOpcion (int opcion, ListaNombres l) {
        switch (opcion) {
            case 0: break;
            case 1: añadirNombre (l);
                    break;
            case 2: borrarNombre (l);
                    break;
            case 3: modificarNombre (l);
                    break;
            case 4: listarNombres (l);
                    break;
            default: System.out.println("\nOpción incorrecta.");
        }
    }
    
    
    public static void añadirNombre (ListaNombres l) {
        Scanner sc = new Scanner (System.in);
        System.out.print("\nIntroduzca nombre a insertar: ");
        l.añadirNombre(sc.nextLine());
    }
    
    
    public static void borrarNombre (ListaNombres l) {
        Scanner sc = new Scanner (System.in);
        System.out.print("\nIntroduzca nombre a borrar: ");
        l.borrarNombre(sc.nextLine());
    }
    
    
    public static void modificarNombre (ListaNombres l) {
        Scanner sc = new Scanner (System.in);
        String antiguo, nuevo;
        System.out.print("\nIntroduzca nombre a modificar: ");
        antiguo = sc.nextLine();
        System.out.print("Introduzca nombre por el que se va a sustituir: ");
        nuevo = sc.nextLine();
        l.modificarNombre(antiguo, nuevo);
    }
    
    
    public static void listarNombres (ListaNombres l) {
        l.imprimirLista();
    }
}
