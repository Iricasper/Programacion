package com.mycompany.u2.e11;

public class PruebaPersonaCondicionalDoble {

    public static void main(String[] args) {

        PersonaCondicionalDoble p = new PersonaCondicionalDoble();

        p.setEdad(20);
        p.setAltura(165);
        p.setEstaCasado(false);
        p.setTieneTrabajo(true);

        //Primera condición: Mayor o menor de edad.
        if (p.getEdad() < 18) {
            System.out.println("Eres menor de edad.");
        }
        else {
            System.out.println("Eres mayor de edad.");
        }
        
        //Segunda condición: Altura mayor o menor de 185.
        if (p.getAltura() >= 185) {
            System.out.println("Eres alto/a.");
        }
        else {
            System.out.println("No eres alto/a.");
        }
        
        //Tercera condición.
        if (!p.isEstaCasado()) {
            System.out.println("No está casado/a.");
        }
        else {
            if (p.isTieneTrabajo()) {
                System.out.println("Casado/a y con trabajo.");
            }
            else { 
                System.out.println("Casado/a y sin trabajo.");
            }
        }
    }
}
