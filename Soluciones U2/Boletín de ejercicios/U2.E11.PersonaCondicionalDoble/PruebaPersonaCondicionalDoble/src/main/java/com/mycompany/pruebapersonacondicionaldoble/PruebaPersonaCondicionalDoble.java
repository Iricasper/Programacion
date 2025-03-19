package com.mycompany.pruebapersonacondicionaldoble;

public class PruebaPersonaCondicionalDoble {

    public static void main(String[] args) {
        PersonaCondicionalDoble p = new PersonaCondicionalDoble();
        
        p.setEdad(20);
        p.setAltura(165);
        p.setEstaCasado(false);
        p.setTieneTrabajo(true);
        
        // Punto 1
        if (p.getEdad() < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }
        
        // Punto 2
        if (p.getAltura() >= 185) {
            System.out.println("Eres alto/a");
        } else {
            System.out.println("No eres alto/a");
        }
        
        // Punto 3
        if (p.isEstaCasado()) {
            if (p.isTieneTrabajo()) {
                System.out.println("Casado/a y con trabajo");
            } else {
                System.out.println("Casado/a y sin trabajo");
            }
        } else {
            System.out.println("No está casado");
        }
    }
}
