package com.mycompany.pruebapersonacoche;

public class PruebaPersonaCoche {

    public static void main(String[] args) {
        Persona p1 = new Persona ("Miguel", "112233");
        Persona p2 = new Persona ();
        p2.setNombre("Gema");
        p2.setDni("223344");
        
        Vehiculo coche1 = new Vehiculo();
        Vehiculo coche2 = new Vehiculo();
        
        p1.comprarCoche(coche1);
        p2.venderCoche();
        p1.arrancarCoche();
        p1.venderCoche();
        p1.recorrerDistancia(100);
    }
}
