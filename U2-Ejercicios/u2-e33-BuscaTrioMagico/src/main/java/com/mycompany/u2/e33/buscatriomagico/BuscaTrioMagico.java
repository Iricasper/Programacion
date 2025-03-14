package com.mycompany.u2.e33.buscatriomagico;

public class BuscaTrioMagico {

    public static void main(String[] args) {
        for (int x = 0; x <= 9; x = x + 2) {

            for (int y = 1; y <= 9; y = y + 2) {

                for (int z = 0; z <= 9; z = z + 2) {
                    if (x + y + z > 10 && x * y * z < 90) {
                        System.out.println(x + ", " + y + ", " + z);
                    }
                }
            }
            System.out.println("");
        }
    }
}
