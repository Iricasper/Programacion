package es.tuespiral.u4.p7.necesidadgenericos;

import java.util.*;

public class NecesidadGenericos {
    public static void main(String[] args) {

        List listaBlanca = new ArrayList();
        listaBlanca.add("954784512");
        listaBlanca.add("654987123");
        listaBlanca.add("658789451");
        listaBlanca.add(954865784);  // El IDE no nos avisa
        
        Iterator iter = listaBlanca.iterator();
        while(iter.hasNext()) {
            String elem = (String) iter.next();  
            System.out.println("Teléfono permitido: "+elem);
        }        
    }
}
