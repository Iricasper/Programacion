package com.mycompany.pruebadispositivos;

public class PruebaDispositivos {

    public static void main(String[] args) {
        Raton r = new Raton();
        Teclado t = new Teclado();
        Pantalla p = new Pantalla();
        Impresora i = new Impresora();
        Entrada e = t;
        Dispositivo d = p;

        Entrada ent = r;
        Dispositivo dis = e;
        Salida sal = t;
        Impresora imp = (Impresora) t;
        EntradaSalida es = i;
        Salida s = (Salida) d;
        Pantalla pant = d;
        Teclado tec = e;
        Raton rat = (Raton) t;
    }
}
