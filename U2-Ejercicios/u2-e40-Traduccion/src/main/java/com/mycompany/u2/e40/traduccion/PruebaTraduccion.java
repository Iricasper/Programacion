package com.mycompany.u2.e40.traduccion;

public class PruebaTraduccion {

    public static void main(String[] args) {
        Traduccion[] array = new Traduccion[5];

        //Creamos los objetos del array
        for (int i = 0; i < array.length; i++) {
            array[i] = new Traduccion();
        }
        //Introducimos los valores correspondientes
        array[0].setEnglish("To break down");
        array[0].setSpanish("Averiar");
        array[1].setEnglish("To fix");
        array[1].setSpanish("Arreglar");
        array[2].setEnglish("To reboot");
        array[2].setSpanish("Reiniciar");
        array[3].setEnglish("To work");
        array[3].setSpanish("Funcionar");
        array[4].setEnglish("To type");
        array[4].setSpanish("Teclear");

        for (Traduccion elem : array) {
            System.out.println(elem.getEnglish() + " en español se traduce por "
                               + elem.getSpanish());
        }
    }
}
