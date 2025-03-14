package com.mycompany.pruebamapacliente;

import java.util.*;

public class PruebaMapaCliente {

    public static void main(String[] args) {
        Map clientes = new HashMap();
        
        clientes.put(1, new Cliente (1, "Miguel", "Perez Rodriguez"));
        clientes.put(2, new Cliente (2, "Manuel", "Sanchez Sanchez"));
        clientes.put(3, new Cliente (3, "Marcelo", "Lopez Martinez"));
        
        System.out.println("\nClientes (recorrido desde las claves): ");
        Set conjuntoClaves = clientes.keySet();
        Iterator iter = conjuntoClaves.iterator();
        while(iter.hasNext()) {
            int key = (Integer) iter.next();
            System.out.println("Clave: "+key+". Valor: "+clientes.get(key));
        }
        
        System.out.println("\nVamos a borrar el primer cliente.");
        clientes.remove(1);
        
        System.out.println("\nVamos a cambiar el nombre del segundo cliente (Pedro por Manuel).");
        
        int termino = 2;
        if (clientes.containsKey(termino)) {
            Cliente c = (Cliente) clientes.get(termino);
            c.setNombre("Pedro");
            clientes.replace(2, c);
        } else {
            System.out.println("El diccionario no contiene la clave "+termino);
        }
        
        System.out.println("\nClientes (recorrido desde las claves): ");
        conjuntoClaves = clientes.keySet();
        iter = conjuntoClaves.iterator();
        while(iter.hasNext()) {
            int key = (Integer) iter.next();
            System.out.println("Clave: "+key+". Valor: "+clientes.get(key));
        }
    }
}