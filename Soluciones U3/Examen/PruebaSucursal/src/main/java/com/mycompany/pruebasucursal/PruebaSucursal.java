package com.mycompany.pruebasucursal;

import java.util.Scanner;


public class PruebaSucursal {

    public static void main(String[] args) {
        int opcion;
        SucursalBiblioteca s = new SucursalBiblioteca (
                                        "Centro",
                                        new Bibliotecario(null, "Perez", 1200, 35),
                                        new Bibliotecario("Carmen", "Sanchez", 1100, 24),
                                        new Bibliotecario("Elena", "Ruiz", 1150, 26)
                                                       );
        
        do {
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion (opcion, s);
        } while (opcion != 4);
    }
    
    
    public static void mostrarMenu() {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("----------------------------------------------");
        System.out.println("1. Imprimir el costo mensual de la sucursal");
        System.out.println("2. Imprimir la edad promedio de los bibliotecarios");
        System.out.println("3. Imprimir el nombre y los apellidos del jefe de la sucursal");
        System.out.println("4. Salir");
    }
    
    
    public static int leerOpcion() {
        Scanner sc = new Scanner (System.in);
        System.out.print("\nIntroduzca opcion: ");
        return (sc.nextInt());
    }
    
    
    public static void ejecutarOpcion (int op, SucursalBiblioteca s) {
        switch (op) {
            case 1: imprimirCosto (s);
                    break;
            case 2: imprimirEdadPromedio (s);
                    break;
            case 3: imprimirDatosJefe (s);
                    break;
            case 4: break;
            default: System.out.println("Opción incorrecta");
        }
    }
    
    
    public static void imprimirCosto (SucursalBiblioteca s) {
        System.out.println("\nEl costo mensual de la sucursal es de " +
                           s.getCosteMensual() + " euros.");
    }
    
    
    public static void imprimirEdadPromedio (SucursalBiblioteca s) {
        System.out.println("\nLa edad promedio de los bibliotecarios es de " +
                           s.getEdadPromedio() + " años.");
    }
    
    
    public static void imprimirDatosJefe (SucursalBiblioteca s) {
        System.out.println("\nEl jefe de la sucursal se llama " +
                           s.getListaBibliotecarios()[0].getNombre() + " " +
                           s.getListaBibliotecarios()[0].getApellidos());
    }
}
