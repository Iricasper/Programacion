package com.mycompany.nombresdeperros;

import java.util.*;

public class NombresDePerros {

    public static void main(String[] args) {
        List nombres = new ArrayList();
        
        nombres.add("Toby");
        nombres.add("Rocky");
        nombres.add("Max");
        nombres.add("Pancho");
        nombres.add("Coco");
        nombres.add("Chispa");
        
        System.out.println("Actualmente conozco " + nombres.size() +
                           " nombres para perros. Te los digo: ");
        
        Iterator iter = nombres.iterator();
        
        while (iter.hasNext()) {
            System.out.println((String) iter.next());
        }
        
        System.out.println("\nTambién te los puedo decir en orden alfabético:");
        
        Collections.sort(nombres);
        
        iter = nombres.iterator();
        
        while (iter.hasNext()) {
            System.out.println((String) iter.next());
        }
        
        System.out.println("\nAhora voy a pedirte nombres de perros para " +
                           "añadirlos a mi lista (escribe FIN para acabar):");
        String nombre;
        Scanner sc = new Scanner (System.in);
        
        do {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            if (!nombre.equals("FIN")) {
                nombres.add(nombre);
            }
        }while(!nombre.equals("FIN"));
        
        Collections.sort(nombres);
        
        System.out.println("\nGracias. Ahora conozco " + nombres.size() +
                           " nombres de perros. Te los digo en orden:");
        
        iter = nombres.iterator();
        
        while (iter.hasNext()) {
            System.out.println((String) iter.next());
        }
    }
}
