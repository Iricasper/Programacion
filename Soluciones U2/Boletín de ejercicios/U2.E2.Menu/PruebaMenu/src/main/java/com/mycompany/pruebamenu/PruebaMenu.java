package com.mycompany.pruebamenu;

public class PruebaMenu {

    public static void main(String[] args) {
        Menu m = new Menu();
        
        m.setPrimerPlato("Ensalada de la casa");
        m.setSegundoPlato("Solomillo al whisky");
        m.setCalorias(798);
        m.setPrecio(11.95);
        
        m.imprimeMenu();
    }
}
