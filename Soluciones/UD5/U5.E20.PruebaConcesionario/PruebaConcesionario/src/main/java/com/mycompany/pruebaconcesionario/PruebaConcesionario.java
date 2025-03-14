package com.mycompany.pruebaconcesionario;

import java.util.*;

public class PruebaConcesionario {

    public static void main(String[] args) {
        Concesionario c = new Concesionario ("ConSanJuan", "Calle Principal, 1");
        
        c.anadirVehiculo(new Vehiculo ("Citroen", "C5", "1234HHH", 2000, 21345.75));
        c.anadirVehiculo(new Vehiculo ("Audi", "A1", "4321SSS", 2020, 12765.35));
        c.anadirVehiculo(new Vehiculo ("Hyundai", "AX7", "4365TRY", 2005, 22005));
        c.anadirVehiculo(new Vehiculo ("Kia", "Carnival", "0912RFG", 2010, 9762.95));
        
        c.actualizarVehiculo (new Vehiculo ("Hyundai", "AX8", "4365TRY", 2006, 24005));
        c.borrarVehiculo (new Vehiculo ("Audi", "A1", "4321SSS", 2020, 12765.35));
        c.mostrarVehiculos();
        System.out.println("\nLa suma de los precios de los vehiculos asciende a " +
                           c.calcularSumaPrecios() + " euros.");
    }
}
