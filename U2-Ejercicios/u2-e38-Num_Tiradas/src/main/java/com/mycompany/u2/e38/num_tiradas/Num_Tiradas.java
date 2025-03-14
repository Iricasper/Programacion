package com.mycompany.u2.e38.num_tiradas;

public class Num_Tiradas {

    public static void main(String[] args) {
        final int NUM_TIRADAS = 50;
        //Creo variables cuya función será guardar el numero de veces que salga cada número
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0;
        //Creamos el array
        int[] tir = new int[NUM_TIRADAS];
        
        //Le asignamos valor a las tiradas
        for (int i = 0; i < tir.length; i++) {
            tir[i] = (int) (Math.random() * 6 + 1);
        }
        
        //Recorro el array contando las veces que ha salido cada número
        for (int i = 0; i < tir.length; i++) {
            if (tir[i] == 1) {
                uno++;
            }
            if (tir[i] == 2) {
                dos++;
            }
            if (tir[i] == 3) {
                tres++;
            }
            if (tir[i] == 4) {
                cuatro++;
            }
            if (tir[i] == 5) {
                cinco++;
            }
            if (tir[i] == 6) {
                seis++;
            }
        }
        
        System.out.println("Se han analizado " + NUM_TIRADAS + " tiradas de un"
                + "dado de 6 caras y se obtienen los siguientes resultados:");
        System.out.println("El numero 6 ha aparecido " + seis + " veces.");
        System.out.println("El numero 5 ha aparecido " + cinco + " veces.");
        System.out.println("El numero 4 ha aparecido " + cuatro + " veces.");
        System.out.println("El numero 3 ha aparecido " + tres + " veces.");
        System.out.println("El numero 2 ha aparecido " + dos + " veces.");
        System.out.println("El numero 1 ha aparecido " + uno + " veces.");
    }
}
