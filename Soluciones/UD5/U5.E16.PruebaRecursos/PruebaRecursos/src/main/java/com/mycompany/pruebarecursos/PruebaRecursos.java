package com.mycompany.pruebarecursos;

import java.util.*;

public class PruebaRecursos {

    public static void main(String[] args) {
        Set recursos = new HashSet();
        Autor a = new Autor("Ken", "Follet", "Gran Bretaña");
        ArrayList lista = new ArrayList();
        lista.add(a);
        
        recursos.add(new Recurso(9788401328510L, "Los pilares de la Tierra", lista, 10));
        
        a = new Autor("Ildefonso", "Falcones", "España");
        lista = new ArrayList();
        lista.add(a);
        
        recursos.add(new Recurso(9788499088044L, "La catedral del mar", lista, 8));
        
        lista = new ArrayList();
        a = new Autor("Howard Phillips", "Lovecraft", "Estados Unidos");
        lista.add(a);
        a = new Autor("Alexandre", "Dumas", "Francia");
        lista.add(a);
        
        recursos.add(new Recurso(9788417244712L, "Los mejores cuentos para leer a media noche", lista, 3));
        
        Iterator iter = recursos.iterator();
        
        while (iter.hasNext()) {
            Recurso r = (Recurso) iter.next();
            System.out.println(r);
        }
    }
}
