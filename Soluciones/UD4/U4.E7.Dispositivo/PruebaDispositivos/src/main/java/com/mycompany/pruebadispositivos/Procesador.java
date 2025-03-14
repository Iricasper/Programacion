package com.mycompany.pruebadispositivos;

public class Procesador extends Dispositivo {
    private int numOperaciones;
    
    @Override
    public void encender() {
        super.encender();
        numOperaciones = 0;
    }
    
    
    public int sumar (int n1, int n2) {
        numOperaciones++;
        return n1 + n2;
    }
    
    public int restar (int n1, int n2) {
        numOperaciones++;
        return n1 - n2;
    }
    
    public int multiplicar (int n1, int n2) {
        numOperaciones++;
        return n1 * n2;
    }
    
    public int dividir (int n1, int n2) {
        numOperaciones++;
        return n1 / n2;
    }

    public int getNumOperaciones() {
        return numOperaciones;
    }
    
    
}
