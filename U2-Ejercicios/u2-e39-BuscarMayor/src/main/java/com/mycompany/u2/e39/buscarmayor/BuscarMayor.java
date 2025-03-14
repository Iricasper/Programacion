package com.mycompany.u2.e39.buscarmayor;

public class BuscarMayor {

    public static void main(String[] args) {
        int[] array = new int[500];

        //Creamos una variable que usaremos para registrar el valor más alto
        int max = 0;

        //Creamos el bucle que defina los numeros contenidos en el array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000001);
        }

        //Creamos el bucle que actualizará el valor de max
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("El valor mas alto del array es " + max);
    }
}
