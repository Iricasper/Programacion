package com.mycompany.u2.e42.compara;

public class PruebaCompara {

    public static void main(String[] args) {
        Compara[] nombres = new Compara[3];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = new Compara();
        }

        nombres[0].setCadena1("Ana");
        nombres[0].setCadena2("Anacleto");
        nombres[1].setCadena1("Pedro");
        nombres[1].setCadena2("pedro");
        nombres[2].setCadena1("Ana");
        nombres[2].setCadena2("Ana");

        for (Compara elem : nombres) {
            System.out.println("Las cadenas " + elem.getCadena1() + " y "
                    + elem.getCadena2() + " son iguales? " + elem.sonIguales());
        }
    }
}
