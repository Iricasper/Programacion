package com.mycompany.mapahabitaciones;

import java.util.*;

public class MapaHabitaciones {

    public static void main(String[] args) {
        Map estadoHabitaciones = new HashMap();
        int opcion;
        
        insertarDatosEnMapa (estadoHabitaciones);
        do {
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion (estadoHabitaciones, opcion);
        }while(opcion != 0);
    }
    
    
    public static void insertarDatosEnMapa (Map estadoHabitaciones) {
        estadoHabitaciones.put(101, false);
        estadoHabitaciones.put(102, true);
        estadoHabitaciones.put(103, true);
        estadoHabitaciones.put(104, false);
        estadoHabitaciones.put(105, true);
        estadoHabitaciones.put(201, true);
        estadoHabitaciones.put(202, false);
        estadoHabitaciones.put(203, false);
        estadoHabitaciones.put(204, true);
        estadoHabitaciones.put(205, false);
    }
    
    
    public static void mostrarMenu() {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("0 - Salir");
        System.out.println("1 - Ver estado de ocupación");
        System.out.println("2 - Ocupar una habitación");
        System.out.println("3 - Liberar una habitación\n");
    }
    
    
    public static int leerOpcion() {
        Scanner sc = new Scanner (System.in);
        int opcion;
        
        do {
            System.out.print("Introduzca opcion: ");
            opcion = sc.nextInt();
        }while (opcion < 0 || opcion > 3);
        
        return opcion;
    }
    
    
    public static void ejecutarOpcion (Map estadoHabitaciones,int opcion) {
        /*
La opción 3 preguntará qué habitación se desea liberar y la liberará, si no estaba
        libre previamente, en ese caso debe emitir un mensaje de error.
        */
        switch (opcion) {
            case 0: return;
            case 1: estadoOcupacion (estadoHabitaciones);
                    break;
            case 2: ocuparHabitacion (estadoHabitaciones);
                    break;
            case 3: liberarHabitacion (estadoHabitaciones);
        }
    }
    
    
    public static void estadoOcupacion (Map estadoHabitaciones) {
        System.out.println("\nEstado de ocupación:");
        Set conjuntoClaves = estadoHabitaciones.keySet();
        Iterator iter = conjuntoClaves.iterator();
        while(iter.hasNext()) {
            int key = (Integer) iter.next();
            System.out.println("Habitación " + key + ": " +
                               ((Boolean) estadoHabitaciones.get(key) ? "ocupada" : "libre"));
        }
    }
    
    
    public static void ocuparHabitacion (Map estadoHabitaciones) {
        int habitacion = leerHabitacion();
        
        if (!estadoHabitaciones.containsKey(habitacion)) {
            System.out.println("\nLa habitación indicada no existe.");
        } else {
            if ((Boolean) estadoHabitaciones.get(habitacion)) {
                System.out.println("\nLa habitación indicada ya está ocupada.");
            } else {
                estadoHabitaciones.put(habitacion, true);
            }
        }
    }
    
    
    public static int leerHabitacion() {
        System.out.print("\nIntroduzca el número de la habitación: ");
        return new Scanner(System.in).nextInt();
    }
    
    
    public static void liberarHabitacion (Map estadoHabitaciones) {
        int habitacion = leerHabitacion();
        
        if (!estadoHabitaciones.containsKey(habitacion)) {
            System.out.println("\nLa habitación indicada no existe.");
        } else {
            if (!(Boolean) estadoHabitaciones.get(habitacion)) {
                System.out.println("\nLa habitación indicada ya estaba libre.");
            } else {
                estadoHabitaciones.put(habitacion, false);
            }
        }
    }
}
