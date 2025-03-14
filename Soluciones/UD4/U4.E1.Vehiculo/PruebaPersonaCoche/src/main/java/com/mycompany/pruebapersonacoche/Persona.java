package com.mycompany.pruebapersonacoche;

public class Persona {

    private String nombre;
    private String dni;
    private Vehiculo coche;
    
    public Persona () {
    }
    
    
    public Persona (String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
        
    public void comprarCoche (Vehiculo coche) {
        this.coche = coche;
    }
    
    
    public void venderCoche () {
        if (this.coche == null) {
            System.out.println("Error: la persona no tiene coche");
        } else {
            this.coche = null;
        }
    }
    
    
    public void arrancarCoche () {
        if (this.coche == null) {
            System.out.println("Error: la persona no tiene coche");
        } else {
            this.coche.arrancar();
        }
    }
    
    
    public void apagarCoche () {
        if (this.coche == null) {
            System.out.println("Error: la persona no tiene coche");
        } else {
            this.coche.apagar();
        }
    }
    
    
    public void recorrerDistancia (double numKm) {
        if (this.coche == null) {
            System.out.println("Error: la persona no tiene coche");
        } else {
            this.coche.recorrerDistancia(numKm);
        }
    }
    
    
    public void reponerCombustible (double numlitros) {
        if (this.coche == null) {
            System.out.println("Error: la persona no tiene coche");
        } else {
            this.coche.reponerCombustible(numlitros);
        }
    }
    
    
    public String getNombre() {
        return nombre;
    }

    
    public String getDni() {
        return dni;
    }

    
    public Vehiculo getCoche() {
        return coche;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void setDni(String dni) {
        this.dni = dni;
    }
}
