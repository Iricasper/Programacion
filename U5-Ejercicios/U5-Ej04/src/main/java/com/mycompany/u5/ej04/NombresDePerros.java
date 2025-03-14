/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u5.ej04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario24
 */
public class NombresDePerros {

    public static void main(String[] args) {

        List nombres = new ArrayList();
        
        nombres.add("Toby");
        nombres.add("Rocky");
        nombres.add("Max");
        nombres.add("Pancho");
        nombres.add("Coco");
        nombres.add("Chispa");
        
        System.out.println("Actualmente conozco " + nombres.size() + " nombres"
                + " para perros. Te los digo: ");
        Iterator iter = nombres.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        System.out.println("Tambien te los puedo decir en orden alfabetico: ");
        Collections.sort(nombres);
        iter = nombres.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        String nuevoNombre;
        
        do {
        System.out.println("Dime mas nombres de perros. Si no quieres, escribe 'FIN'");
        Scanner sc = new Scanner((System.in));
        nuevoNombre = sc.nextLine();
        if (!nuevoNombre.equals("FIN")) {
            nombres.add(nuevoNombre);
        }
        } while (!nuevoNombre.equals("FIN"));
        
        System.out.println("Gracias. Ahora conozco " + nombres.size()
                + " nombres para perros. Te los digo en orden: ");
        Collections.sort(nombres);
        iter = nombres.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
