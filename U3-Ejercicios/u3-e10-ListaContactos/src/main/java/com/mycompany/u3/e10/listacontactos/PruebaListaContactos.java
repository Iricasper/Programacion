/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3.e10.listacontactos;

import java.util.Scanner;

/**
 *
 * @author XxLok
 */
public class PruebaListaContactos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ListaContactos l = null;
        crearLista(l);
        int opcion;
        do {
            menuLista();
            opcion = lectura(sc);
            if (opcion == 0) {
                System.out.println("Adios");
            } else {
                
            }
        } while (opcion != 0);
        
        switch (opcion) {
            case 1:
                menuAgregar(sc, l);
                break;
            case 2:
                menuBuscar(sc, l);
                break;
            case 3:
                
                break;
            case 4:
                tabulaRasa(l);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        
        
        
    }
    
    public static void menuBuscar(Scanner sc, ListaContactos l) {
        System.out.println("1 - Buscar por numero de telefono");
        System.out.println("2 - Buscar por email");
        System.out.println("3 - Buscar por nombre y apellidos");
        System.out.println("Elige una opcion:");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                
        }
    }

    public static void menuAgregar(Scanner sc, ListaContactos l) {
        System.out.println("1 - Introducir nombre, apellidos, email y telefono.");
        System.out.println("2 - Introducir nombre, apellidos y email.");
        System.out.println("3 - Introducir nombre, apellidos y telefono.");
        System.out.println("Elige una opcion:");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Introduce el nombre:");
                String nombre = sc.nextLine();
                System.out.println("Introduce los apellidos:");
                String apellidos = sc.nextLine();
                System.out.println("Introduce el correo:");
                String email = sc.nextLine();
                System.out.println("Introduce el telefono:");
                int telefono = sc.nextInt();
                l.agregarContacto(new Contacto(nombre, apellidos, email, telefono));
                break;
            case 2:
                System.out.println("Introduce el nombre:");
                nombre = sc.nextLine();
                System.out.println("Introduce los apellidos:");
                apellidos = sc.nextLine();
                System.out.println("Introduce el correo:");
                email = sc.nextLine();
                l.agregarContacto(new Contacto(nombre, apellidos, email));
                break;
            case 3:
                nombre = sc.nextLine();
                apellidos = sc.nextLine();
                telefono = sc.nextInt();
                l.agregarContacto(new Contacto(nombre, apellidos, telefono));
        }
    }

    public static void crearLista(ListaContactos l) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la longitud de la lista: ");
        l = new ListaContactos(sc.nextInt());
    }
    
    public static void menuLista() {
        System.out.println("\nMENU DE USUARIO");
        System.out.println("-------------------------------------------------");
        System.out.println("0 - Salir");
        System.out.println("1 - Agregar contacto");
        System.out.println("2 - Buscar contacto");
        System.out.println("3 - Eliminar contacto");
        System.out.println("4 - Vaciar la lista");
    }
    
    public static int lectura(Scanner sc) {
        System.out.println("Elige una opcion:");
        int opcion = sc.nextInt();
        return opcion;
    }
    
    public static void tabulaRasa(ListaContactos l) {
        l.vaciarLista();
    }
    
}
