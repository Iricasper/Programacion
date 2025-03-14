package es.tuespiral.probandocomparable;

import java.util.*;

public class PruebaOrdenEmpleados {
    public static void main(String[] args) {
        List lista = new ArrayList();

        lista.add(new Empleado("Juan", "Sin Miedo", "Director", 4000));
        lista.add(new Empleado("Inés", "Sanz Garrido", "Auditora", 3500));
        lista.add(new Empleado("Tomás", "Fuerte López", "Comercial", 2000));
        lista.add(new Empleado("Ana", "Sanz Garrido", "Auditora", 3300));
        
        System.out.println("Lista original: ");
        Iterator iter = lista.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        Collections.sort(lista);
        
        System.out.println("\nLista ordenada según el orden del método compareTo: ");
        iter = lista.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
