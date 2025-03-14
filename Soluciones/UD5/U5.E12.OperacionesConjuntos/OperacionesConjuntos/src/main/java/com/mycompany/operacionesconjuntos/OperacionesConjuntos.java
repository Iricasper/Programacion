package com.mycompany.operacionesconjuntos;

import java.util.*;

public class OperacionesConjuntos {

    public static void main(String[] args) {
        Set buscaPolicia = new HashSet();
        Set buscaGuardia = new HashSet();
        
        System.out.println("\nCreamos un conjunto con personas buscadas por la policía.");
        buscaPolicia.add("12345678A");
        buscaPolicia.add("12345678B");
        buscaPolicia.add("12345678C");
        buscaPolicia.add("12345678D");
        System.out.println(buscaPolicia);
        
        System.out.println("\nCreamos un conjunto con personas buscadas por la guardia civil.");
        buscaGuardia.add("12345678E");
        buscaGuardia.add("12345678F");
        buscaGuardia.add("12345678G");
        buscaGuardia.add("12345678D");
        System.out.println(buscaGuardia);
        
        System.out.println("\nAhora creamos un nuevo conjunto con los que están buscados por la policía o por la guardia civil.");
        Set buscadosPorAlguien = new HashSet(buscaPolicia);
        buscadosPorAlguien.addAll(buscaGuardia);
        System.out.println(buscadosPorAlguien);
        
        System.out.println("\nAhora creamos un nuevo conjunto con los que están buscados por la policía y por la guardia civil.");
        Set buscadosPorAmbos = new HashSet(buscaPolicia);
        buscadosPorAmbos.retainAll(buscaGuardia);
        System.out.println(buscadosPorAmbos);
        
        System.out.println("\nAhora creamos un nuevo conjunto con los que están buscados por la policía pero no por la guardia civil.");
        Set buscadosSoloPolicia = new HashSet(buscaPolicia);
        buscadosSoloPolicia.removeAll(buscaGuardia);
        System.out.println(buscadosSoloPolicia);
        
        System.out.println("\nAhora creamos un nuevo conjunto con los que están buscados por la guardia civil pero no por la policia.");
        Set buscadosSoloGuardia = new HashSet(buscaGuardia);
        buscadosSoloGuardia.removeAll(buscaPolicia);
        System.out.println(buscadosSoloGuardia);
    }
}
