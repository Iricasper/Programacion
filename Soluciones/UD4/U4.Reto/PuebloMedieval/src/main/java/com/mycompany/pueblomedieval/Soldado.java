package com.mycompany.pueblomedieval;

public class Soldado extends Personaje {
    public Soldado (int monedas) {
        this.monedas = monedas;
        this.estaVivo = true;
    }
    
    public void luchaEnBatalla() {
        monedas += 50;
        System.out.println("Soldado LUCHA - Tiene " + monedas + " monedas");
    }
    
    @Override
    public void come() {
        monedas -= 5;
        System.out.println("Soldado COME - Tiene " + monedas + " monedas");
    }

    @Override
    public void muere() {
        estaVivo = false;
        System.out.println("Soldado MUERE - Tiene " + monedas + " monedas");
    }

    @Override
    public void realizaAccion() {
        if (!estaVivo) {
            System.out.println("Soldado MUERTO - SIN ACCIÓN");
        } else {
            int numero = (int)(Math.random() * 101);
            if (numero <= 20) {
                muere();
            } else if (numero <= 60) {
                luchaEnBatalla();
            } else {
                come();
            }
        }
    }
}
