package com.mycompany.u3.e01.ordenador;

public class PruebaOrdenador {

    public static void main(String[] args) {
        //Creamos los tres objetos para probar los constructores
        Ordenador a = new Ordenador();
        Ordenador b = new Ordenador("MSI", "1");
        Ordenador c = new Ordenador("Intel", "2", 2009);
        
        //Utilizamos el método imprimeEstado para ver cómo se han construido
        a.imprimeEstado();
        System.out.println("");
        b.imprimeEstado();
        System.out.println("");
        c.imprimeEstado();
    }
}
