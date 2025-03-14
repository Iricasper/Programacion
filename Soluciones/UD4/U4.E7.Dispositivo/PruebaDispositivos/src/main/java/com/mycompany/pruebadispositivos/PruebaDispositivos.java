package com.mycompany.pruebadispositivos;

public class PruebaDispositivos {

    public static void main(String[] args) {
        Procesador p = new Procesador();
        MemoriaRAM m = new MemoriaRAM();
        TarjetaVideo t = new TarjetaVideo();
        
        // Operaciones con los objetos
        p.encender();
        System.out.println("El resultado de multiplicar 4 por 3 es " +
                            p.multiplicar(4, 3));
        
        m.encender();
        m.modificaValor(10, 123);
        System.out.println("El valor de la celda cuyo indice es 10 es " + 
                            m.obtenerValor(10));
        
        t.encender();
        t.muestraEntero(10);
        t.muestraTexto("Hola");
    }
}
