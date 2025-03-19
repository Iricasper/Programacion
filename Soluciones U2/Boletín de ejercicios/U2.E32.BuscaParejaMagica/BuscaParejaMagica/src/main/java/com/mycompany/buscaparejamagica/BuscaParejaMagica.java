package com.mycompany.buscaparejamagica;

public class BuscaParejaMagica {

    public static void main(String[] args) {
        int x, y;
        
        for (x = 0; x <= 9; x = x + 2) {
            System.out.print("Parejas mágicas del " + x + ": ");
            
            for (y = 1; y <= 9; y = y + 2) {
                if (x + y > 6 && x * y < 60) {
                    System.out.print(y + " ");
                }
            }
            
            System.out.println("");
        }
    }
}
