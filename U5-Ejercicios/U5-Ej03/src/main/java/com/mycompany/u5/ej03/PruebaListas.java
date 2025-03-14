/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.u5.ej03;

import java.util.*;

/**
 *
 * @author usuario24
 */
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

        System.out.println("La lista esta vacia?\n" + (meses.isEmpty() ? "Si" : "No"));
        if (!meses.isEmpty()) {
            System.out.println("Contiene " + meses.size() + " elementos");
            System.out.println("Contiene el mes de Henero?\n" + (meses.contains("Henero") ? "Si" : "No"));
        }

        System.out.println("\nLista en orden natural: ");
        Iterator iter = meses.iterator();
        while (iter.hasNext()) {
            System.out.println("-" + iter.next());
        }

        System.out.println("\nLista en orden alfabetico: ");
        Collections.sort(meses);
        iter = meses.iterator();
        while (iter.hasNext()) {
            System.out.println("-" + iter.next());
        }
        
        meses.clear();
        System.out.println("\nHemos vaciado la lista, volvemos a imprimirla: ");
        iter = meses.iterator();
        while (iter.hasNext()) {
            System.out.println("-" + iter.next());
        }
    }
}
