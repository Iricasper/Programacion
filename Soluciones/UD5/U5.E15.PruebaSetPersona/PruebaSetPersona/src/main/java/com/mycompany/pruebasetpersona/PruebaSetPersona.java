package com.mycompany.pruebasetpersona;

import java.util.*;

public class PruebaSetPersona {

    public static void main(String[] args) {
        Persona p1, p2, p3;
        p1 = new Persona("11222333A", "Miguel", "Perez Rodriguez", 21, false, false, 666554433, "Calle Ancha, 3");
        p2 = new Persona("11222333A", "Miguel", "Perez Rodriguez", 36, true, true, 666443322, "Calle Estrecha, 33");
        p3 = new Persona("11422333Z", "Carmen", "Lopez Sanchez", 22, false, true, 666998877, "Calle Larga, 333");
        
        System.out.println("Hash code de la primera persona: " + p1.hashCode());
        System.out.println("Hash code de la segunda persona: " + p2.hashCode());
        System.out.println("Hash code de la tercera persona: " + p3.hashCode());
        
        Set conjunto = new HashSet();
        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        
        Iterator iter = conjunto.iterator();
        
        while (iter.hasNext()) {
            Persona p = (Persona) iter.next();
            System.out.println(p);
        }
    }
}
