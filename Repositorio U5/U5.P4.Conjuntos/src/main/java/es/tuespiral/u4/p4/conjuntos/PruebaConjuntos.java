package es.tuespiral.u4.p4.conjuntos;

import java.util.*;

public class PruebaConjuntos {
    public static void main(String[] args) {
        System.out.println("CREAMOS UN CONJUNTO Y OPERAMOS CON ÉL");
        // CREACIÓN DE UN CONJUNTO
        Set conjunto = new HashSet();
                
        // AÑADIMOS ELEMENTOS AL CONJUNTO
        conjunto.add("Juan");
        conjunto.add("Ana");
        conjunto.add("Pedro");
        // Imprimir conjunto
        System.out.println("El conjunto no conserva el orden de inserción de los elementos: ");
        System.out.println(conjunto);
        
        // Como es una conjunto no permite incluir elementos duplicados
        conjunto.add("Ana");
        System.out.println("Si volvemos a añadir el elemento 'Ana', el conjunto no lo añade porque estaría duplicado: ");
        System.out.println(conjunto);
        
        // CONSULTAMOS EL CONJUNTO PARA AVERIGUAR CIERTA INFORMACIÓN
        System.out.println("\nAHORA LE HACEMOS PREGUNTAS AL CONJUNTO");
        System.out.println("¿El conjunto está vacío?: "+conjunto.isEmpty());
        System.out.println("¿Cuántos elementos hay en el conjunto?: "+conjunto.size()+" elementos");
        
        System.out.print("Nos preguntamos si el conjunto contiene el elemento 'Luis': ");
        if (conjunto.contains("Luis")) 
            System.out.println("Sí, lo contiene");
        else
            System.out.println("No, no lo contiene");
        
        
        // RECORRIDO DE UN CONJUNTO HACIENDO USO DE UN ITERADOR
        System.out.println("\nTAMBIÉN PODEMOS RECORRER UN CONJUNTO CON UN ITERADOR");
        Iterator iter = conjunto.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next(); 
            System.out.println("Elemento: "+elem);
        }
        
        // BORRADO Y VACIADO DE UN CONJUNTO
        System.out.println("\nPODEMOS BORRAR ALGUNOS ELEMENTOS Y TAMBIÉN VACIAR EL CONJUNTO");        
        System.out.println("Conjunto actual: "+conjunto);
                
        conjunto.remove("Pedro");
        System.out.println("Podemos eliminar un elemento buscando por su valor. Eliminamos 'Pedro': "+conjunto);
        
        conjunto.clear();
        System.out.println("Y también podemos vaciar el conjunto: "+conjunto);
        
        // OPERACIONES ENTRE CONJUNTOS
        System.out.println("\nTAMBIÉN PODEMOS REALIZAR OPERACIONES ENTRE CONJUNTOS"); 
        Set tienenCoche = new HashSet();
        tienenCoche.add("Juan");
        tienenCoche.add("Ana");
        tienenCoche.add("Lola");
        tienenCoche.add("Luis");
        tienenCoche.add("Eva");
        tienenCoche.add("Pedro");
        System.out.println("Definimos el conjunto 'tienenCoche' con los valores");
        System.out.println(tienenCoche);
        
        Set tienenBici = new HashSet();
        tienenBici.add("Ana");
        tienenBici.add("Pedro");
        tienenBici.add("Rosa");
        tienenBici.add("Alberto");
        System.out.println("Definimos el conjunto 'tienenBici' con los valores");
        System.out.println(tienenBici);

        System.out.println("Creamos un nuevo conjunto con los que tienen bici O coche (unión)");
        Set tienenAlgo = new HashSet(tienenBici);
        tienenAlgo.addAll(tienenCoche);
        System.out.println(tienenAlgo);
        
        System.out.println("Ahora creamos un nuevo conjunto con los que tienen bici Y coche (intersección)");
        Set tienenAmbos = new HashSet(tienenBici);
        tienenAmbos.retainAll(tienenCoche);
        System.out.println(tienenAmbos);
        
        System.out.println("Ahora creamos un nuevo conjunto con los que tienen bici pero no coche (diferencia)");
        Set tienenBiciNoCoche = new HashSet(tienenBici);
        tienenBiciNoCoche.removeAll(tienenCoche);
        System.out.println(tienenBiciNoCoche);
        
        System.out.println("Ahora creamos un nuevo conjunto con los que tienen coche pero no bici (diferencia)");
        Set tienenCocheNoBici = new HashSet(tienenCoche);
        tienenCocheNoBici.removeAll(tienenBici);
        System.out.println(tienenCocheNoBici);        
    }
}
