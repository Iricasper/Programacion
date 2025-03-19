package com.mycompany.pruebapersona;

public class PruebaPersona {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        p1.cambiaNombre("Pepe");
        p1.cambiaEdad(18);
        
        p2.cambiaNombre("Pepa");
        p2.cambiaEdad(19);
        
        p1.imprimeNombre();
        p1.imprimeEdad();
        p1.imprimeEstadoTrabajo();
        p1.imprimeEstadoCivil();
        
        p2.imprimeNombre();
        p2.imprimeEdad();
        p2.imprimeEstadoTrabajo();
        p2.imprimeEstadoCivil();
        
        p1.consigueTrabajo();
        p1.pierdeTrabajo();
        p1.consigueTrabajo();
        
        p2.consigueTrabajo();
        
        p1.cambiaEdad(30);
        p2.cambiaEdad(31);
        
        p1.seCasa();
        p2.seCasa();
        
        p1.seDivorcia();
        
        p1.imprimeNombre();
        p1.imprimeEdad();
        p1.imprimeEstadoTrabajo();
        p1.imprimeEstadoCivil();
        
        p2.imprimeNombre();
        p2.imprimeEdad();
        p2.imprimeEstadoTrabajo();
        p2.imprimeEstadoCivil();
    }
}
