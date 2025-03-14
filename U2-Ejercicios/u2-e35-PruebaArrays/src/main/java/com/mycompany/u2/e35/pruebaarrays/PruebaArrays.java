package com.mycompany.u2.e35.pruebaarrays;

public class PruebaArrays {

    public static void main(String[] args) {
        //Creamos y declaramos un array llamado notas de 25 posiciones
        double [] notas = new double[25];
        
        //Asignamos las notas 4.3, 5.3, 5.6 y 7.8 a las posiciones 2, 3, 5 y 7
        notas[2] = 4.3;
        notas[3] = 5.3;
        notas[5] = 5.6;
        notas[7] = 7.8;
        
        //Imprimimos las notas de las posiciones 0, 2, 4 y 5
        System.out.println("Las notas son " + notas[0] + ", " + notas[2] + ", "
                + notas[4] + " y " + notas[5]);
        
        /* Declaramos y creamos otro array de enteros llamado metrosRecorridos
        con los siguientes valores: 200, 400, 800, 1500, 42000. */
        int[] metrosRecorridos = { 200, 400, 800, 1500, 42000 };
        
        //Imprimimos los valores de las posiciones 0, 1 y 2
        System.out.println("Los metros recorridos son " + metrosRecorridos[0]
                + ", " + metrosRecorridos[1] + " y " + metrosRecorridos[2]);
        
        //Imprimiremos un valor fuera de rango, por ejemplo la 20. Esto peta
        //System.out.println("Metros recorridos: " + metrosRecorridos[20]);
    }
}
