package es.tuespiral.u4.p5.wrappers;

import java.util.*;

public class PruebaWrappers { 
    public static void main(String args[]) 
    { 
//        // PROBAMOS LA CLASE INTEGER. CON LAS DEMÁS SERÍA CASI IGUAL.
//        
//        // Creamos un tipo primitivo int
//        int entero = 10; 
//  
//        // Envolvemos el entero en un objeto
//        Integer objetoInteger = new Integer(entero); 
//  
//        // Desenvolvemos el objeto y obtenemos el entero que almacena dentro
//        int otroEntero = objetoInteger.intValue();
//  
//        // También podemos crear los objetos Integer a partir de valores literales
//        Integer nuevoObjeto2 = Integer.valueOf(100); 
//        Integer nuevoObjeto1 = Integer.parseInt("12345");
//        
//        // También podemos imprimirlo sin problemas
//        System.out.println("Podemos imprimir el objeto Integer del tirón: "+objetoInteger);
//        
//        // La clase nos da algunas constantes de utilidad
//        System.out.println("El entero más grande que podemos guardar es: "+Integer.MAX_VALUE);
//        System.out.println("Y el más pequeño es: "+Integer.MIN_VALUE);
//        
//        // La clase también nos da algunos métodos estáticos útiles
//        System.out.println("El método compare nos permite establecer un criterio de orden cómodamente: ");
//        System.out.println("Comparamos 5 y 6. Resultado: "+Integer.compare(5, 6));
//        System.out.println("Comparamos 6 y 5. Resultado: "+Integer.compare(6, 5));
//        System.out.println("Comparamos 5 y 5. Resultado: "+Integer.compare(5, 5));

//        ----------------------------------------------------------------------------------        
        // Descomenta el siguiente trozo de código cuando estudiemos el AUTOBOXING y UNBOXING
        
        int miEntero = 10;
        // Esto sería AUTOBOXING
        Integer nuevoObjeto3 = miEntero;
        Integer nuevoObjeto4 = 1000;
        
        // Esto sería UNBOXING
        int result1 = nuevoObjeto3;
        // Y esto también
        int result2 = nuevoObjeto3 + nuevoObjeto4;
        
        // También funciona en parámetros de métodos
        System.out.println("Comparamos 10 y 1000. Resultado: "+Integer.compare(nuevoObjeto3, nuevoObjeto4));
        
        // Y como fin de fiesta. También funciona con COLECCIONES
        Set edades = new HashSet();
        // Autoboxing
        edades.add(5);
        edades.add(10);
        edades.add(9);
        
        int suma = 0;
        Iterator iter = edades.iterator();
        while(iter.hasNext()) {
            // Unboxing
            int elem = (Integer) iter.next();
            suma = suma + elem;
        }
        System.out.println("La suma de las edades del conjunto es: "+suma);
    } 
} 