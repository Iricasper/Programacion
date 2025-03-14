package es.tuespiral.u4.p10.metodogenerico;

import java.util.*;

public class PruebaUtilidadGenerica {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Caracola");
        lista.add("Adios");
        lista.add("Caracol");
        UtilidadGenerica.imprimeColeccion(lista);
        
        System.out.println("");
        Set<Integer> conjunto = new HashSet<>();
        UtilidadGenerica.imprimeColeccion(conjunto);        
    }
}
