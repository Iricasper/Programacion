package com.mycompany.pruebarecursos;

import java.util.*;

public class Recurso {
    private final long isbn;
    private String titulo;
    private List autores;
    private int numeroEjemplares;

    public Recurso(long isbn, String titulo, List autores, int numeroEjemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = autores;
        this.numeroEjemplares = numeroEjemplares;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public List getAutores() {
        return autores;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(List autores) {
        this.autores = autores;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }
    
    

    @Override
    public String toString() {
        return "Recurso{" + "isbn=" + isbn + ", titulo=" + titulo + ", autores=" + autores + ", numeroEjemplares=" + numeroEjemplares + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.isbn ^ (this.isbn >>> 32));
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
        final Recurso other = (Recurso) obj;
        return this.isbn == other.isbn;
    }   
}
