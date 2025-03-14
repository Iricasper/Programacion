package es.tuespiral.u4.extra.rendimientolistset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        List buscados = new ArrayList();
        inicializaBuscados(buscados);
        
        List lista = new ArrayList();
        Set conjunto = new HashSet();
        inicializaContenidos(lista, conjunto);
        
        long duracionConList = calculaDuracionBusquedas(buscados, lista);
        long duracionConSet = calculaDuracionBusquedas(buscados, conjunto);
        
        System.out.println("Duración de 1000 búsquedas con listas: "+duracionConList+" nanosegundos");
        System.out.println("Duración de 1000 búsquedas con conjuntos: "+duracionConSet+" nanosegundos");
        System.out.println("Las búsquedas con conjuntos son "+duracionConList/duracionConSet+" veces más rápidas que con listas");
    }

    private static void inicializaBuscados(List buscados) {
        Random r = new Random();
        for(int i = 0; i < 1000; i++) {
            buscados.add(r.nextInt(100000+1));
        }
    }

    private static void inicializaContenidos(List lista, Set conjunto) {
        Random r = new Random();
        for(int i = 0; i < 1000; i++) {
            int valor = r.nextInt(100000+1);
            lista.add(valor);
            conjunto.add(valor);
        }
    }

    private static long calculaDuracionBusquedas(List buscados, Collection coleccion) {
        long inicio = System.nanoTime();
        Iterator iter = buscados.iterator();
        while(iter.hasNext()) {
            Integer elemBuscado = (Integer) iter.next();
            coleccion.contains(elemBuscado);
        }
        long fin = System.nanoTime();
        return fin - inicio;
    }
}
