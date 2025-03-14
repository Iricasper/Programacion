package com.mycompany.u2.e32.buscaparejamagica;

public class BuscaParejaMagica {

    public static void main(String[] args) {
        
        for (int x = 0; x <= 9; x = x + 2) {
            
            for (int y = 1; y <= 9; y = y + 2) {
                if (x + y > 6 && x * y < 60) {
                    System.out.println("Parejas magicas: "+x+" y "+y);
                }
            }
            System.out.println("");
        }
    }
}
