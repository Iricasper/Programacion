package com.mycompany.pueblomedieval;

public class Campesino extends Personaje {
    public Campesino (int monedas) {
        this.monedas = monedas;
        this.estaVivo = true;
    }
    
    public void vendeCosecha() {
        monedas += 50;
        System.out.println("Campesino VENDE COSECHA - Tiene " + monedas + " monedas");
    }
    
    public void cultiva() {
        System.out.println("Campesino CULTIVA - Tiene " + monedas + " monedas");
    }
    
    @Override
    public void come() {
        monedas -= 3;
        System.out.println("Campesino COME - Tiene " + monedas + " monedas");
    }

    @Override
    public void muere() {
        estaVivo = false;
        System.out.println("Campesino MUERE - Tiene " + monedas + " monedas");
    }

    @Override
    public void realizaAccion() {
        if (!estaVivo) {
            System.out.println("Campesino MUERTO - SIN ACCIÓN");
        } else {
            int numero = (int)(Math.random() * 101);
            if (numero <= 10) {
                muere();
            } else if (numero <= 60) {
                cultiva();
            } else if (numero <= 70) {
                vendeCosecha();
            } else {
                come();
            }
        }
    }
}
