package com.mycompany.pruebasetpersona;

import java.util.Objects;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casada;
    private boolean trabaja;
    private int telefono;
    private String direccion;

    public Persona(String dni, String nombre, String apellidos, int edad, boolean casada, boolean trabaja, int telefono, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.casada = casada;
        this.trabaja = trabaja;
        this.telefono = telefono;
        this.direccion = direccion;
    }        
    
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCasada() {
        return casada;
    }

    public boolean isTrabaja() {
        return trabaja;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasada(boolean casada) {
        this.casada = casada;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", casada=" + casada + ", trabaja=" + trabaja + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.dni);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.apellidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellidos, other.apellidos);
    }
    
    
    
}
