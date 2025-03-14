package com.mycompany.pruebalistacontactos;

public class ListaContactos {
    private Contacto [] lista;

    public ListaContactos(int numero) {
        lista = new Contacto[numero];
    }

    public void añadirContacto (Contacto c) {
        int i, j;
        
        for (i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                
                for (j = 0; j < lista.length; j++) {
                    if (lista[j] != null &&
                        lista[j].getNombre().equals (c.getNombre()) &&
                        lista[j].getApellidos().equals (c.getApellidos())) {
                        System.out.println("El nombre completo suministrado ya existe en el array.");
                        break;
                    }
                }
                
                if (j == lista.length) {
                    lista[i] = c;
                    break;
                }
            } 
        }
        
        if (i == lista.length) {
            System.out.println("No hay huecos en el array");
        }
    }
    
}