package com.mycompany.pruebafichero;

public class Fichero implements InterfazFichero {
    
    private String nombre;
    private String codificacion = "UTF-8";
    private boolean abierto;
    private String contenido;
    

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setCodificacion(String codificacion) {
        if (codificacion.equals("UTF-8") || codificacion.equals("UTF-16")) {
            this.codificacion = codificacion;
        } else
            this.codificacion = "UTF-8";
    }

    @Override
    public String getCodificacion() {
        return codificacion;
    }

    @Override
    public void abrir() {
        if (nombre == null || nombre.equals("")) {
            System.out.println("El archivo debe tener un nombre");
        } else {
            abierto = true;
        }
    }

    @Override
    public void cerrar() {
        abierto = false;
    }

    @Override
    public void borraContenido() {
        if (!abierto) {
            System.out.println("El archivo no está abierto");
        } else {
            contenido = "";
        }
    }

    @Override
    public void agregaContenido(String contenido) {
        if (!abierto) {
            System.out.println("El archivo no está abierto");
        } else {
            if (this.contenido == null) {
                this.contenido = contenido;
            } else {
                this.contenido += contenido;
            }
        }
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public int getTamanioEnBytes() {
        if (codificacion.equals("UTF-8")) {
            return contenido.length();
        } else {
            return contenido.length() * 2;
        }
    }
    
}
