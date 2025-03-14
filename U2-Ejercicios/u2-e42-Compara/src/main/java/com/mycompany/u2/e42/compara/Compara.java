package com.mycompany.u2.e42.compara;

public class Compara {

    //Propiedades
    public String cadena1, cadena2;

    //Getters y setters
    public String getCadena1() {
        return cadena1;
    }

    public String getCadena2() {
        return cadena2;
    }

    public void setCadena1(String cadena1) {
        this.cadena1 = cadena1;
    }

    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }

    //Método sonIguales, que devuelve si son iguales caracter a caracter
    public boolean sonIguales() {
        if (cadena1.length() == cadena2.length()) {
            for (int i = 0; i < cadena1.length(); i++) {
                return cadena1.charAt(i) == cadena2.charAt(i);
            }

        }
        return false;
    }
}
