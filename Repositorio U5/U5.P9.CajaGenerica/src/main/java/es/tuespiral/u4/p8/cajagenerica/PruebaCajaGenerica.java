package es.tuespiral.u4.p8.cajagenerica;

import java.util.Set;

public class PruebaCajaGenerica {
    public static void main(String[] args) {
        CajaGenerica<Ropa> cajaRopa = new CajaGenerica<>();
        CajaGenerica<Comida> cajaComida = new CajaGenerica<>();
        Set<String> conjunto;
        
        Ropa pantalon = new Ropa();
        Comida pan = new Comida();      
        
        cajaRopa.guarda(pantalon);
        System.out.println("Está vacía: "+cajaRopa.isVacia());
        
        cajaRopa.saca();
        System.out.println("Está vacía: "+cajaRopa.isVacia());
        
        cajaComida.guarda(pan);
        
        //cajaRopa.guarda(pan);
    }
}
