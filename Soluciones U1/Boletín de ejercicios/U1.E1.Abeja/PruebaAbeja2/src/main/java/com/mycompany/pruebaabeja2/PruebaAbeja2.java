package com.mycompany.pruebaabeja2;

public class PruebaAbeja2 {

    public static void main(String[] args) {

        // Define una referencia capaz de apuntar a objetos de la clase Abeja
        Abeja willy;
        
        // Crea un objeto de la clase Abeja y asígnalo a la referencia anterior.
        willy = new Abeja();
        
        // A continuación, la abeja debe volar,
        // desplazarse a la posición (2,0),
        // posarse y 
        // cambiar el número de cargas de néctar a 1.
        willy.vuela();
        willy.cambiaPosicionX(2);
        willy.sePosa();
        willy.cambiaCargaNectar(1);
        
        // La abeja debe repetir la operación anterior pero ahora irá a la posición (2,2) y
        // cambiará el número de cargas de néctar a 2.
        willy.vuela();
        willy.cambiaPosicionY(2);
        willy.sePosa();
        willy.cambiaCargaNectar(2);
                
        // La abeja repite la operación anterior pero ahora pasará por la flor de la posición (0,2) y
        // cambiará el número de cargas de néctar a 3.
        willy.vuela();
        willy.cambiaPosicionX(0);
        willy.sePosa();
        willy.cambiaCargaNectar(3);
        
        // Por último, la abeja debe imprimir el valor de sus propiedades haciendo uso de los métodos imprimeXXX().
        willy.imprimeEstadoVuelo();
        willy.imprimeNumCargasNectar();
        willy.imprimePeso();
        willy.imprimePosicionX();
        willy.imprimePosicionY();
    }
}
