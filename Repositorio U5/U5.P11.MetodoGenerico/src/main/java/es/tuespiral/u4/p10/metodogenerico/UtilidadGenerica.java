package es.tuespiral.u4.p10.metodogenerico;

import java.util.*;

public class UtilidadGenerica {
    public static <T> void imprimeColeccion (Collection<T> coleccion) {
        if (coleccion.isEmpty())
            System.out.println("Coleccion vacía");
        else {
            Iterator<T> iter = coleccion.iterator();
            int i = 1;
            while(iter.hasNext()) {
                System.out.println("Elemento "+i+" = "+iter.next());
                i++;
            }
        }
    }
}
