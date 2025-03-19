package com.mycompany.pruebacuentaimpar;

public class PruebaCuentaImpar {

    public static void main(String[] args) {
        int contador = 1;
        
        System.out.print("Lista de números impares: ");
        
        while (contador <= 99) {
            System.out.print(contador + " ");
            contador += 2;
        }
        
        System.out.println("");
    }
}
