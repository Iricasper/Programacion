package com.mycompany.pruebamenu;

public class Menu {
    public String primerPlato;
    public String segundoPlato;
    public int calorias;
    public double precio;
    
    
    public String getPrimerPlato() {
        return primerPlato;
    }
    
    public String getSegundoPlato() {
        return segundoPlato;
    }
    
    public int getCalorias() {
        return calorias;
    }
        
    public double getPrecio() {
        return precio;
    }
    
    public void setPrimerPlato (String plato1) {
        primerPlato = plato1;
    }
    
    public void setSegundoPlato (String plato2) {
        segundoPlato = plato2;
    }
    
    public void setCalorias (int cal) {
        calorias = cal;
    }
    
    public void setPrecio (double nuevoPrecio) {
        precio = nuevoPrecio;
    }
    
    public void imprimeMenu() {
        System.out.printf("%-22s", "PRIMER PLATO");
        System.out.printf("%22s%n", "SEGUNDO PLATO");
        System.out.printf("%-22s", getPrimerPlato());
        System.out.printf("%22s%n", getSegundoPlato());
        System.out.printf("----------------------");
        System.out.printf("----------------------%n");
        System.out.printf("%-22s", "CALORÍAS");
        System.out.printf("%22s%n", "PRECIO");
        System.out.printf("%-22d", getCalorias());
        System.out.printf("%21.2f€%n", getPrecio());
        
    }
}
