package com.mycompany.pruebalistanombres;

public class ListaNombres {
    private String array[];
    
    
    public ListaNombres() {
        array = new String[20];
    }
    
    
    public void añadirNombre (String nombre) {
        boolean insertado = false;
        
        assert (nombre != null || nombre.equals (""));
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = nombre;
                insertado = true;
                break;
            }
        }
        
        if (!insertado) {
            System.out.println("\nNo hay sitio para el nuevo nombre en la lista.");
        }
    }
    
    
    public void borrarNombre (String nombre) {
        boolean existe = false;
        
        for (int i = 0; i < array.length; i++) {
            if (nombre.equals(array[i])) {
                array[i] = null;
                existe = true;
                break;
            }
        }
        
        if (!existe) {
            System.out.println("\nNo se ha encontrado el nombre en la lista.");
        }
    }
    
    
    public void modificarNombre (String antiguo, String nuevo) {
        boolean existe = false;
        
        for (int i = 0; i < array.length; i++) {
            if (antiguo.equals(array[i])) {
                array[i] = nuevo;
                existe = true;
                break;
            }
        }
        
        if (!existe) {
            System.out.println("\nNo se ha encontrado el nombre en la lista.");
        }
    }
    
    
    public void imprimirLista () {
        System.out.println("\nNOMBRES ALMACENADOS EN LA LISTA");
        System.out.println("----------------------------------------------");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null &&  !array[i].equals("")) {
                System.out.println(array[i]);
            }
        }
        System.out.println("");
    }
}
