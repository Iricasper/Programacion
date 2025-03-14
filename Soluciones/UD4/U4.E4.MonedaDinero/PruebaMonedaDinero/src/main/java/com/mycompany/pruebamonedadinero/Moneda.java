package com.mycompany.pruebamonedadinero;

public class Moneda {
    private String nombre;
    private String simbolo;

    public Moneda(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }
    
}
