package com.mycompany.buscatriomagico;

public class BuscaTrioMagico {

    public static void main(String[] args) {
        int x, y, z;
        
        for (x = 0; x <= 9; x = x + 2) {
            System.out.print("Tríos mágicos del " + x + ": ");
            
            for (y = 1; y <= 9; y = y + 2) {
                for (z = 0; z <= 9; z = z + 2) {
                    if (x + y + z > 10 && x * y * z < 90) {
                        System.out.print(y + "-" + z + " ");
                    }
                }
            }
            
            System.out.println("");
        }
    }
}
