package com.mycompany.pruebalistas;

import java.util.*;

public class PruebaListas {

    public static void main(String[] args) {
        List meses = new ArrayList();
        
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");
        
        if (meses.isEmpty()) {
            System.out.println("La lista esta vacia.");
        } else {
            System.out.println("La lista contiene " + meses.size() + " elementos.");
        }
        
        if (meses.contains("Henero")) {
            System.out.println("La lista contiene HENERO.");
        } else {
            System.out.println("La lista no contiene HENERO.");
        }
        
        System.out.println("\nVAMOS A IMPRIMIR EL CONTENIDO DE LA LISTA");
        Iterator iter = meses.iterator();
        while (iter.hasNext()) {
            String mes = (String) iter.next();
            System.out.println("Mes: " + mes);
        }
        
        Collections.sort(meses);
        
        System.out.println("\nVAMOS A IMPRIMIR EL CONTENIDO DE LA LISTA ORDENADA");
        iter = meses.iterator();
        while (iter.hasNext()) {
            String mes = (String) iter.next();
            System.out.println("Mes: " + mes);
        }
        
        meses.clear();
        
        System.out.println("\nVAMOS A IMPRIMIR EL CONTENIDO DE LA LISTA (VACIA)");
        iter = meses.iterator();
        while (iter.hasNext()) {
            String mes = (String) iter.next();
            System.out.println("Mes: " + mes);
        }
    }
}
