package com.mycompany.u5.ej08;

import java.util.*;

public class U5Ej0809 {

    public static void main(String[] args) {
        List grupo = new ArrayList();
        
        grupo.add(new Persona("Jesus", "5678B", 21));
        grupo.add(new Persona("Antonio", "1234A", 20));
        grupo.add(new Persona("Paco", "1239N", 40));
        grupo.add(new Persona("Paco", "9132J", 21));
        
        Iterator iter = grupo.iterator();
        
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        Collections.sort(grupo);
        
        iter = grupo.iterator();
        System.out.println("\nLista ordenada alfabeticamente de forma ascendente: ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
