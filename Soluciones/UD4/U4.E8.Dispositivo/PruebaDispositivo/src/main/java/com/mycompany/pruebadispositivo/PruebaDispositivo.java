package com.mycompany.pruebadispositivo;

public class PruebaDispositivo {

    public static void main(String[] args) {
        Dispositivo d = new Dispositivo();
        Procesador p = new Procesador();
        MemoriaRAM m = new MemoriaRAM();
        TarjetaVideo t = new TarjetaVideo();
        
        System.out.println(d.toString());
        System.out.println(p.toString());
        System.out.println(m.toString());
        System.out.println(t.toString());
    }
}
