package com.mycompany.pruebaanimales;

public class PruebaAnimales {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Felino f = new Felino();
        Canido c = new Canido();
        Gato g = new Gato();
        Tigre t = new Tigre();
        Perro p = new Perro();
        
        m.haceRuido();
        f.haceRuido();
        c.haceRuido();
        g.haceRuido();
        t.haceRuido();
        p.haceRuido();
    }
}
