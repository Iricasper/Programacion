package com.mycompany.pruebacuentapar;

public class PruebaCuentaPar {

    public static void main(String[] args) {
        int contador = 0;
        
        System.out.print("Lista de números pares: ");
        
        while (contador <= 100) {
            System.out.print(contador + " ");
            contador += 2;
        }
        
        System.out.println("");
    }
}
