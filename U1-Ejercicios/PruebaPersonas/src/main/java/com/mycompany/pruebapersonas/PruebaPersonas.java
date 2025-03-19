package com.mycompany.pruebapersonas;

public class PruebaPersonas {

    public static void main(String[] args) {
        //Creo los identificadores de los objetos
        Personas p1;
        Personas p2;
        //Los asigno a la clase
        p1 = new Personas();
        p2 = new Personas();
        //Definimos y comprobamos los valores de las propiedades en cada uno de los objetos
        p1.cambiaNombre("Ludoviko");
        p2.cambiaNombre("Iris");
        p1.cambiaEdad(25);
        p2.cambiaEdad(24);
        p1.imprimeNombre();
        p2.imprimeNombre();
        p1.imprimeEdad();
        p2.imprimeEdad();
        p1.imprimeEstadoCivil();
        p2.imprimeEstadoCivil();
        p1.imprimeEstadoTrabajo();
        p2.imprimeEstadoTrabajo();

        p1.consigueTrabajo();
        p1.pierdeTrabajo();
        p1.consigueTrabajo();
        p2.consigueTrabajo();
        p1.cambiaEdad(31);
        p2.cambiaEdad(30);
        p1.seCasa();
        p2.seCasa();
        p1.seDivorcia();

        p1.imprimeNombre();
        p1.imprimeEdad();
        p1.imprimeEstadoCivil();
        p1.imprimeEstadoTrabajo();
        p2.imprimeNombre();
        p2.imprimeEdad();
        p2.imprimeEstadoCivil();
        p2.imprimeEstadoTrabajo();
    }
}
