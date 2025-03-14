package com.mycompany.pruebacumplepersona;

public class PruebaCumplePersona {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        p1.cambiaNombre("Carmen");
        p1.cambiaEdad(15);
        
        p2.cambiaNombre("Alberto");
        p2.cambiaEdad(16);
        
        p1.imprimeNombre();
        p1.imprimeEdad();
        p1.imprimeEstadoTrabajo();
        p1.imprimeEstadoCivil();
        
        p2.imprimeNombre();
        p2.imprimeEdad();
        p2.imprimeEstadoTrabajo();
        p2.imprimeEstadoCivil();
        
        p1.cumpleAnios();
        p1.cumpleAnios();
        p1.cumpleAnios();
        p1.cumpleAnios();
        
        p2.cumpleAnios();
        p2.cumpleAnios();
        p2.cumpleAnios();
        
        System.out.println(p1.nombre + " tiene " + p1.obtieneNumAnios() + " años");
        System.out.println(p2.nombre + " tiene " + p2.obtieneNumAnios() + " años");
    }
}
