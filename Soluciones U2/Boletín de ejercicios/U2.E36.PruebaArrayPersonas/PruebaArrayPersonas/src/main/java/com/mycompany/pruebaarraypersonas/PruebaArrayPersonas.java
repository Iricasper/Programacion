package com.mycompany.pruebaarraypersonas;

public class PruebaArrayPersonas {

    public static void main(String[] args) {
        Persona p[] = new Persona[4];
        int i;
        
        for (i = 0; i < p.length; i++) {
            p[i] = new Persona();
        }
        
        p[0].setRol("padre");
        p[0].setEdad(43);
        p[1].setRol("madre");
        p[1].setEdad(40);
        p[2].setRol("hijo");
        p[2].setEdad(24);
        p[3].setRol("hija");
        p[3].setEdad(14);
        
        for (i = 0; i < p.length; i++) {
            System.out.println("La posición " + (i+1) + " la ocupa el/la " + 
                               p[i].getRol() + " con " +
                               p[i].getEdad() + " años");
        }
        
        p[2] = null;
        
        p[2] = new Persona();
        p[2].setRol("abuelo");
        p[2].setEdad(80);
        
        for (i = 0; i < p.length; i++) {
            System.out.println("La posición " + (i+1) + " la ocupa el/la " + 
                               p[i].getRol() + " con " +
                               p[i].getEdad() + " años");
        }
    }
}
