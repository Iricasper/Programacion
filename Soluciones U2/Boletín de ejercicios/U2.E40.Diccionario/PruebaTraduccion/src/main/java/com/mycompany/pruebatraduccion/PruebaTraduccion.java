package com.mycompany.pruebatraduccion;

public class PruebaTraduccion {

    public static void main(String[] args) {
        Traduccion [] lista = new Traduccion[5];
        
        lista[0] = new Traduccion();
        lista[1] = new Traduccion();
        lista[2] = new Traduccion();
        lista[3] = new Traduccion();
        lista[4] = new Traduccion();
        
        lista[0].setEnglish("To break down");
        lista[0].setSpanish("Averiar");
        lista[1].setEnglish("To fix");
        lista[1].setSpanish("Arreglar");
        lista[2].setEnglish("To reboot");
        lista[2].setSpanish("Reiniciar");
        lista[3].setEnglish("To work");
        lista[3].setSpanish("Funcionar");
        lista[4].setEnglish("To type");
        lista[4].setSpanish("Teclear");
        /*
        for (Traduccion palabra: lista) {
            System.out.println(palabra.getEnglish() + " en español se traduce por " + 
                               palabra.getSpanish());
        }*/
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].getEnglish() + " en español se traduce por " + 
                               lista[i].getSpanish());
        }
    }
}