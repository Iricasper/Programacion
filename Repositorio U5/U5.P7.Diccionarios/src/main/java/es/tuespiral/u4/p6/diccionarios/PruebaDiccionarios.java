package es.tuespiral.u4.p6.diccionarios;

import java.util.*;

public class PruebaDiccionarios {
    public static void main(String[] args) {
        // Creamos el diccionario
        Map diccionario = new HashMap();
        
        // Rellenamos el diccionario
        System.out.println("Cargamos el diccionario con las siguientes definiciones: Mar, Columna, Ratón, Pelota, Zapato, Armario");
        diccionario.put("Mar", "Extensión grande de agua");
        diccionario.put("Columna", "Elemento arquitectónico que sirve de soporte");
        diccionario.put("Ratón", "Mamífero roedor de tamaño pequeño");
        diccionario.put("Pelota", "Esfera de plástico o cuero que sirve para jugar");
        diccionario.put("Zapato", "Objeto para vestir los pies");
        diccionario.put("Armario", "Mueble que sirve para guardar objetos");
        
        // Hacemos algunas consultas
        System.out.println("\nVemos el estado del diccionario:");
        System.out.println("El diccionario está vacio: "+diccionario.isEmpty());
        System.out.println("Número de elementos almacenados: "+diccionario.size());
        
        // Ahora hacemos búsquedas en el diccionario
        String termino = "Columna";
        System.out.println("\nAhora vamos a buscar el término: "+termino);
        if (diccionario.containsKey(termino)) {
            System.out.println("La definición de "+termino+" es: "+diccionario.get(termino));
        } else {
            System.out.println("El diccionario no contiene la clave "+termino);
        }
        
        termino = "Patata";
        System.out.println("\nAhora vamos a buscar el término: "+termino);
        if (diccionario.containsKey(termino)) {
            System.out.println("La definición de "+termino+" es: "+diccionario.get(termino));
        }
        else {
            System.out.println("El diccionario no contiene la clave "+termino);
        }       
        
        System.out.println("\nTambién podemos borrar un elemento por su clave. Eliminamos Zapato");
        // Borramos elementos:
        diccionario.remove("Zapato");
        
        // Si pedimos borrar algo que no existe no pasa nada, no da error
        System.out.println("Si pedimos que borre algo que no existe no da error. Eliminamos Alpargata, que no existe");
        diccionario.remove("Alpargata");
        
        // Si intentamos guardar un elemento con una clave ya existente, se reemplaza el valor por el nuevo
        System.out.println("\nSi volvemos a guardar un elemento usando una clave ya existente, se actualiza el valor. Actualizamos la definición de Mar");
        String clave = "Mar";
        diccionario.put(clave, "Extensión gigantesca de agua salada");
        System.out.println("Nueva definición: "+clave + " - " + diccionario.get(clave));
        
        System.out.println("\nTambién existe un método 'replace' que lo deja más claro. Actualizamos de nuevo la definición de Mar");
        clave = "Mar";
        diccionario.replace(clave, "Extensión inmensa de agua salada");
        System.out.println("Nueva definición: "+clave + " - " + diccionario.get(clave));
        
        
        System.out.println("\nAHORA TOCA RECORRER EL DICCIONARIO");
        System.out.println("Ojo: Map no extiende a Collection, así que no tenemos un iterador 'directamente'");
        // OJO: Map no desciende de Collection, así que no puede ser recorrido
        // mediante un iterador directamente. Es decir, 
        // diccionario.iterator(); NO EXISTE
        // Pero sí que podemos obtener una colección tanto de las claves como
        // de los valores del diccionario y recorrerlas
        System.out.println("\nRecorremos el conjunto de valores: ");
        Collection col = diccionario.values();
        Iterator iter = col.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        // Recorremos el diccionario para imprimirlo partiendo del conjunto de
        // sus claves
        System.out.println("\nTambién podemos recorrerlo partiendo del conjunto de claves: ");
        Set conjuntoClaves = diccionario.keySet();
        iter = conjuntoClaves.iterator();
        while(iter.hasNext()) {
            String key = (String) iter.next();
            System.out.println("Clave: "+key+". Valor: "+diccionario.get(key));
        }
        
    }
}
