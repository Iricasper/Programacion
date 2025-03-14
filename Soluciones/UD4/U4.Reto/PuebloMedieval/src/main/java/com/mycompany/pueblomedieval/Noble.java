package com.mycompany.pueblomedieval;

public class Noble extends Personaje {
    public Noble (int monedas) {
        this.monedas = monedas;
        this.estaVivo = true;
    }
    
    public void recaudaImpuestos() {
        monedas += 500;
        System.out.println("Noble RECAUDA - Tiene " + monedas + " monedas");
    }

    @Override
    public void come() {
        monedas -= 10;
        System.out.println("Noble COME - Tiene " + monedas + " monedas");
    }

    @Override
    public void muere() {
        estaVivo = false;
        System.out.println("Noble MUERE - Tiene " + monedas + " monedas");
    }

    @Override
    public void realizaAccion() {
        if (!estaVivo) {
            System.out.println("Noble MUERTO - SIN ACCIÓN");
        } else {
            int numero = (int)(Math.random() * 101);
            if (numero <= 5) {
                muere();
            } else if (numero <= 20) {
                recaudaImpuestos();
            } else {
                come();
            }
        }
    }
    
    
}
