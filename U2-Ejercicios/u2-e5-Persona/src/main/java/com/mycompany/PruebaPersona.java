package com.mycompany;

public class PruebaPersona {

    public static void main(String[] args) {
        //Declaramos las variables
        int edad = 39, altura = 200;
        boolean trabajador = false, cochePropio = true, casado = true;
        double salario = 1800.50;
        
        if (edad >= 18 && altura < 180 && casado == true && cochePropio == true) {
            System.out.println("Condicion 1 cumplida");
        }
        
        if (edad >= 18 || altura < 180 || casado == true || cochePropio == true) {
            System.out.println("Condicion 2 cumplida");
        }
        
        if (salario >= 1800 && !(trabajador == false) && !(edad < 18)) {
            System.out.println("Condicion 3 cumplida");
        }
        
        if ((salario >= 1800 || !(trabajador == false) || !(edad < 18))) {
            System.out.println("Condicion 4 cumplida");
        }
        
        if (!trabajador && !casado) {
            System.out.println("Condicion 5 cumplida");
        }
        
        if  (edad < 39 && altura >= 200 && cochePropio && casado) {
            System.out.println("Condicion 6 cumplida");
        }
        
        if (edad > 39 || altura > 200 || cochePropio) {
            System.out.println("Condicion 7 cumplida");
        }
        
        if (edad < 39 && altura >= 200 && cochePropio || casado) {
            System.out.println("Condicion 8 cumplida");
        }
        
        if (edad < 39 && altura >= 200 && (cochePropio || casado)) {
            System.out.println("Condicion 9 cumplida");
        }
        
        /* Analisis preliminar: 1 x, 2 o, 3 x, 4 o, 5 x, 6 x, 7 o, 8 o, 9 x
        Leyenda: x= no se cumple , o= se cumple.
        La 8 se cumple porque primero se resuelven los ands, que dan false, y
        luego se compara con el or (y casado es true), por lo que es true*/
        
        //a) Las operaciones que solo tienen && son false en cuanto una no se cumple
        //b) Las operaciones que solo tienen || son true en cuanto una se cumple
    }
}
