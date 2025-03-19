package com.mycompany.pruebacomparacion;

public class PruebaComparacion {

    public static void main(String[] args) {
        Compara c = new Compara();
        
        c.setCadena1("Ana");
        c.setCadena2("Anacleto");
        System.out.println("\nCadena1 = " + c.getCadena1() + 
                           ", Cadena2 = " + c.getCadena2());
        System.out.println("¿Son iguales?: " + c.sonIguales());
        
        c.setCadena1("Pedro");
        c.setCadena2("pedro");
        System.out.println("\nCadena1 = " + c.getCadena1() + 
                           ", Cadena2 = " + c.getCadena2());
        System.out.println("¿Son iguales?: " + c.sonIguales());
        
        c.setCadena1("Ana");
        c.setCadena2("Ana");
        System.out.println("\nCadena1 = " + c.getCadena1() + 
                           ", Cadena2 = " + c.getCadena2());
        System.out.println("¿Son iguales?: " + c.sonIguales());
    }
}
