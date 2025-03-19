package com.mycompany.pruebaordenador;

public class PruebaOrdenador {

    public static void main(String[] args) {
        Ordenador o1, o2, o3;
        o1 = new Ordenador();
        o2 = new Ordenador("Asus", "1234ABC");
        o3 = new Ordenador("Acer", "2283ZSD", 2021);       
        
        System.out.println("\nOrdenador 1");
        o1.imprimeEstado();
        System.out.println("\nOrdenador 2");
        o2.imprimeEstado();
        System.out.println("\nOrdenador 3");
        o3.imprimeEstado();
    }
}
