package com.mycompany.pruebamenu;

public class PruebaMenu {

    public static void main(String[] args) {
        Menu m = new Menu();
        
        m.setPrimerPlato("Macarrones");
        m.setSegundoPlato("Entrecot");
        m.setCalorias(780);
        m.setPrecio(12.25);
        
        System.out.println("Menu compuesto por " + 
                           m.getPrimerPlato() + " y " +
                           m.getSegundoPlato() + " (" +
                           m.getCalorias() + " calorías), por un importe de " +
                           m.getPrecio() + " euros.");
    }
}
