package com.mycompany.u2.e36.arraypersonas;

public class PruebaArrayPersonas {

    public static void main(String[] args) {
        //Creamos el array: tipo Persona, 4 objetos
        Persona[] familia = new Persona[4];
        int i;

        //Creo un objeto Persona con rol padre y edad 43, asignado en la posicion 0
        familia[0] = new Persona();
        familia[0].setRol("padre");
        familia[0].setEdad(43);

        //Creo un objeto Persona con rol madre y edad 40, asignado a la posicion 1
        familia[1] = new Persona();
        familia[1].setRol("madre");
        familia[1].setEdad(40);

        //Creo un objeto Persona con rol hijo y edad 24, posicion 2
        familia[2] = new Persona();
        familia[2].setRol("hijo");
        familia[2].setEdad(24);

        //Creo un objeto Persona con rol hija y edad 14, posicion 3
        familia[3] = new Persona();
        familia[3].setRol("hija");
        familia[3].setEdad(14);

        //Imprimo el estado de cada posicion del array con sus caracteristicas
        for (i = 0; i < familia.length; i++) {
            System.out.println("La posicion " + (i+1) + " la ocupa el/la "
                + familia[i].getRol() + " con " + familia[i].getEdad() + " anios");
        }
        System.out.println("");

        //El hijo se va de casa, para reflejarlo vamos a restablecer sus valores (se quedan en null)
        familia[2] = new Persona();

        //Rellenamos el hueco libre con el abuelo, rol abuelo y edad 80
        familia[2].setRol("abuelo");
        familia[2].setEdad(80);

        for (i = 0; i < familia.length; i++) {
            System.out.println("La posicion " + (i+1) + " la ocupa el/la "
                + familia[i].getRol() + " con " + familia[i].getEdad() + " anios");
        }
    }
}
