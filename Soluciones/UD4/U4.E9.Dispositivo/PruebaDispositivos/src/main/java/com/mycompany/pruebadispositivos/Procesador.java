package com.mycompany.pruebadispositivos;

public class Procesador extends Dispositivo {
    private int numOperaciones;
    
    @Override
    public void encender() {
        super.encender();
        resetContadores();
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
    
    @Override
    public String toString() {
        return super.toString() + "Procesador: operaciones=" + numOperaciones;
    }
    
    @Override
    public void resetContadores() {
        numOperaciones = 0;
    }
}
