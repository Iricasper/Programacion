package com.mycompany.pruebaconcesionario;

import java.util.*;

public class Concesionario {
    private String nombre;
    private String direccion;
    private Set<Vehiculo> vehiculos;

    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        vehiculos = new HashSet<Vehiculo>();
    }
    
    public void anadirVehiculo (Vehiculo v) {
        vehiculos.add(v);
    }
    
    public void actualizarVehiculo (Vehiculo v) {
        vehiculos.remove(v);
        vehiculos.add(v);
    }
    
    public void borrarVehiculo (Vehiculo v) {
        vehiculos.remove(v);
    }
    
    public void mostrarVehiculos () {
        System.out.println("\nLISTA DE VEHICULOS DEL CONCESIONARIO");
        
        Iterator<Vehiculo> iter = vehiculos.iterator();
        
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    } 
   
    public double calcularSumaPrecios () {
        Iterator<Vehiculo> iter = vehiculos.iterator();
        double cantidad = 0;
        
        while (iter.hasNext()) {
            cantidad += iter.next().getPrecio();
        }
        
        return cantidad;
    }
}
