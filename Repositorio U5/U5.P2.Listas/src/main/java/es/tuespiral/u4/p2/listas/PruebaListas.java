package es.tuespiral.u4.p2.listas;

import java.util.*;

public class PruebaListas {
    public static void main(String[] args) {
        
        System.out.println("CREAMOS UNA LISTA Y OPERAMOS CON ELLA");
        // CREACIÓN DE UNA LISTA
        List lista = new ArrayList();  // Hablaremos de esta línea en las diapositivas
        // List lista = new LinkedList();
        
        // AÑADIR ELEMENTOS AL FINAL DE LA LISTA
        lista.add("Juan");
        lista.add("Ana");
        lista.add("Pedro");
        // Imprimir lista
        System.out.println("La lista conserva el orden de inserción de los elementos: ");
        System.out.println(lista);
        
        // Como es una lista podemos incluir elementos duplicados
        lista.add("Ana");
        System.out.println("Se admiten duplicados: ");
        System.out.println(lista);
        
        // INSERTAR ELEMENTOS EN UNA POSICIÓN DETERMINADA
        // Al insertar un elemento en una posición el resto de elementos
        // se "desplaza" automáticamente a la derecha.
        lista.add(1, "Luisa");
        System.out.println("Insertamos 'Luisa' en la posición 1 y se desplazan los elementos de su derecha:");
        System.out.println(lista);
        
        // OJO: si intentamos insertar un elemento en una posición que no existe
        // Se provocaría un IndexOutOfBoundsException. Igual que con los arrays.
        // lista.add(10, "Alberto");

        // ACTUALIZAR ELEMENTOS DE UNA POSICIÓN
        // También podemos actualizar un elemento sustituyendo el que estuviese
        // en una posición por otro nuevo
        lista.set(2, "Irene");
        System.out.println("Actualizamos el elemento de la posición 2 con un nuevo valor");
        System.out.println(lista);
        
        
        // CONSULTAMOS LA LISTA PARA AVERIGUAR CIERTA INFORMACIÓN
        System.out.println("\nAHORA LE HACEMOS PREGUNTAS A LA LISTA");
        System.out.println("¿La lista está vacía?: "+lista.isEmpty());
        System.out.println("¿Cuántos elementos hay en la lista?: "+lista.size()+" elementos");
        System.out.println("El índice que ocupa Ana es el "+lista.indexOf("Ana"));
        
        System.out.print("Nos preguntamos si la lista contiene el elemento 'Luis': ");
        if (lista.contains("Luis")) 
            System.out.println("Sí, lo contiene");
        else
            System.out.println("No, no lo contiene");
        
        
        // RECORRIDO DE UNA LISTA HACIENDO USO DE UN ITERADOR
        System.out.println("\nTAMBIÉN PODEMOS RECORRER LA LISTA CON UN ITERADOR");
        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next(); // Hablaremos de esta línea en las diapositivas
            System.out.println("Elemento: "+elem);
        }
        
        // ORDENACIÓN DE UNA LISTA UTILIZANDO LA CLASE Collections
        // La clase Collections tiene un montón de métodos estáticos para trabajar
        // de forma cómoda con colecciones. Es análoga a la clase Arrays para los arrays
        System.out.println("\nAHORA PODEMOS ORDENAR LA LISTA Y VOLVERLA A RECORRER");
        System.out.println("Lista desordenada: "+lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: "+lista);
        
        
        // BORRADO Y VACIADO DE UNA LISTA
        System.out.println("\nPODEMOS BORRAR ALGUNOS ELEMENTOS Y TAMBIÉN VACIAR LA LISTA");        
        System.out.println("Lista actual: "+lista);
        lista.remove(0);
        System.out.println("Eliminando el elemento de la posición 0: "+lista);
        
        lista.remove("Pedro");
        System.out.println("También podemos eliminar un elemento buscando por su valor. Eliminamos 'Pedro': "+lista);
        
        lista.clear();
        System.out.println("Y también podemos vaciar la lista: "+lista);
        
        

    }
}
