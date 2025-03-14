package com.mycompany.conjuntotelefonos;

import java.util.*;


public class ConjuntoTelefonos {

    public static void main(String[] args) {
        Set permitidos = new HashSet();
        Set prohibidos = new HashSet();
        
        introducirNumerosPermitidos (permitidos);
        introducirNumerosProhibidos (prohibidos);
        simularLlamadas (permitidos, prohibidos);
        
        // Tarea: controlar que no se introduzca como prohibido un número permitido.
        // Tarea: codificar un único método para autoboxing en los dos conjuntos.
    }
    
    
    public static void introducirNumerosPermitidos (Set permitidos) {
        Scanner sc = new Scanner (System.in);
        int numero;
        
        do {
            System.out.print("Introduzca número permitido (<=0 para salir): ");
            numero = sc.nextInt();
            
            if (numero > 0) {
                permitidos.add(numero);
            }
        }while (numero > 0);
        
        System.out.println("");
    }
    
    
    public static void introducirNumerosProhibidos (Set prohibidos) {
        Scanner sc = new Scanner (System.in);
        int numero;
        
        do {
            System.out.print("Introduzca número prohibido (<=0 para salir): ");
            numero = sc.nextInt();
            
            if (numero > 0) {
                prohibidos.add(numero);
            }
        }while (numero > 0);
        
        System.out.println("");
    }
    
    
    public static void simularLlamadas (Set permitidos, Set prohibidos) {
        System.out.println("SIMULACIÓN DE LLAMADAS\n");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("LLAMADA " + (i + 1));
            simularLlamada (permitidos, prohibidos);
        }
    }
    
    
    public static void simularLlamada (Set permitidos, Set prohibidos) {
        int numero = solicitarNumero();
        
        if (permitidos.contains(numero)) {
            System.out.println("El " + numero + " está PERMITIDO, puedes atender la llamada.\n");
        } else {
            if (prohibidos.contains(numero)) {
                System.out.println("El " + numero + " está PROHIBIDO, cuelga.\n");
            } else {
                System.out.println("El " + numero + " no es un número conocido, haz lo que creas.\n");
            }
        }
        
    }
    
    
    public static int solicitarNumero() {
        Scanner sc = new Scanner (System.in);
        int numero;
        
        do {
            System.out.print("Introduzca el número desde el que se efectúa la llamada: ");
            numero = sc.nextInt();
        }while (numero <= 0);
        
        return numero;
    }
}
