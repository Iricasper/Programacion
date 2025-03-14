package com.mycompany.pueblomedieval;

public abstract class Personaje {
    protected int monedas;
    protected boolean estaVivo;
    
    public abstract void come();
    public abstract void muere();
    public abstract void realizaAccion();
}
