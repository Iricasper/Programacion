package com.mycompany.u3.examen;

import java.util.Scanner;

public class pruebaSucursal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SucursalBiblioteca p = new SucursalBiblioteca("Centro",
                new Bibliotecario("Jose Luis", "Martinez", 3000, 37),
                new Bibliotecario("Carapolla", "Fernandez", 900, 33),
                new Bibliotecario("Tres", "Tres", 36));
        int opcion;
        do {
            menu();
            opcion = sc.nextInt();
            acciones(opcion, p);
        } while (opcion != 4);

    }

    public static void menu() {
        System.out.println("\nMENU BABLUTECAS DE ANDALUCIA");
        System.out.println("-------------------------------------------------");
        System.out.println("1. Imprimir el costo mensual de la sucursal");
        System.out.println("2. Imprimir la edad promedio de los bablutecarios");
        System.out.println("3. Imprimir el nombre y apellido del jefe de la sucursal");
        System.out.println("4. Salir");
    }

    public static void acciones(int opcion, SucursalBiblioteca p) {
        switch (opcion) {
            case 1:
                sablazo(p);
                break;
            case 2:
                viejunaCompartida(p);
                break;
            case 3:
                jefazo(p);
                break;
        }
    }

    public static void sablazo(SucursalBiblioteca p) {
        System.out.println("El costo mensual es de "
                + p.getCostoMensual() + " euros al mes");
    }

    public static void viejunaCompartida(SucursalBiblioteca p) {
        System.out.println("La edad media de los bablutecarios es de "
                + p.getEdadPromedio() + " anios");
    }

    public static void jefazo(SucursalBiblioteca p) {
        System.out.println("El jefe de la babluteca se llama "
                + p.getJefeSucursal().getNombre() + " "
                + p.getJefeSucursal().getApellidos());
    }

}
