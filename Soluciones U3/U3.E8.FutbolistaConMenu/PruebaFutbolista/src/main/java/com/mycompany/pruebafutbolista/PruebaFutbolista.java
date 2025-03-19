package com.mycompany.pruebafutbolista;

import java.util.Scanner;


public class PruebaFutbolista {

    public static void main(String[] args) {
        int opcion;
        Futbolista f = new Futbolista("Pepe", "Perez");
        
        do{
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion(opcion, f);
        }while(opcion != 0);
    }
    
    
    public static void mostrarMenu() {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("--------------------------------------------");
        System.out.println("0-Salir");
        System.out.println("1-Mostrar estado");
        System.out.println("2-Marcar varios goles");
        System.out.println("3-Anular varios goles");
        System.out.println("4-Cambiar nombre y apellidos");
        System.out.println("5-Cambiar salario");
        System.out.println("6-Se lesiona");
        System.out.println("7-Se recupera\n");
    }
    
    
    public static int leerOpcion() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca opcion: ");
        return (sc.nextInt());
    }
    
    
    public static void ejecutarOpcion (int op, Futbolista f) {
        switch (op) {
            case 0: break;
            case 1: mostrarEstado (f);
                    break;
            case 2: marcarVariosGoles (f);
                    break;
            case 3: anularVariosGoles (f);
                    break;
            case 4: cambiarNombreYApellidos (f);
                    break;
            case 5: cambiarSalario (f);
                    break;
            case 6: seLesiona (f);
                    break;
            case 7: seRecupera (f);
                    break;
            default: System.out.println("\nOpción incorrecta");
        }
    }
    
    
    public static void mostrarEstado (Futbolista f) {
        System.out.println("");
        System.out.println(f.getNombre() + " " + f.getApellidos() + 
                           " está " + (f.isLesionado() ? "lesionado, " : "activo, ") +
                           "ha marcado " + f.getNumGoles() + " goles y gana " +
                           f.getSalario() + " euros.");
    }
    
    
    public static void marcarVariosGoles (Futbolista f) {
        Scanner sc = new Scanner (System.in);
        int goles;
        
        do {
            System.out.print("Introduzca cuántos goles ha marcado (>0): ");
            goles = sc.nextInt();
        }while (goles <= 0);
        
        f.marcaGol(goles);
    }
    
    
    public static void anularVariosGoles (Futbolista f) {
        Scanner sc = new Scanner (System.in);
        int goles;
        
        do {
            System.out.print("Introduzca cuántos goles hay que anularle (>0): ");
            goles = sc.nextInt();
        }while (goles <= 0);
        
        f.golAnulado(goles);
    }
    
    
    public static void cambiarNombreYApellidos (Futbolista f) {
        Scanner sc = new Scanner (System.in);
        String cadena;
        System.out.print("\nIndique el nombre: ");
        cadena = sc.nextLine();
        f.setNombre(cadena);
        System.out.print("Indique los apellidos: ");
        cadena = sc.nextLine();
        f.setApellidos(cadena);
        System.out.println("\nDatos modificados.");
    }
    
    
    public static void cambiarSalario (Futbolista f) {
        Scanner sc = new Scanner (System.in);
        double salario;
        
        do {
            System.out.print("\nIntroduzca el nuevo salario (>0): ");
            salario = sc.nextDouble();
        }while (salario <= 0);
        
        f.setSalario(salario);
        System.out.println("\nSalario modificado.");
    }
    
    
    public static void seLesiona (Futbolista f) {
        if (f.isLesionado()) {
            System.out.println("\nEl futbolista ya estaba lesionado.");
        } else {
            f.setLesionado(true);
            System.out.println("\nEl futbolista se ha lesionado.");
        }
    }
    
    
    public static void seRecupera (Futbolista f) {
        if (f.isLesionado()) {
            f.setLesionado(false);
            System.out.println("\nEl futbolista se ha recuperado.");
        } else {
            System.out.println("\nEl futbolista no estaba lesionado.");
        }
    }
}
