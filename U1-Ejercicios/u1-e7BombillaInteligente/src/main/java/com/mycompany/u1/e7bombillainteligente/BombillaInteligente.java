package com.mycompany.u1.e7bombillainteligente;

public class BombillaInteligente {
    //Propiedades
    public String marca;
    public int potencia, numVecesEncendida;
    public boolean encendido;
    //Métodos
    public void cambiaMarca (String nuevaMarca) {
        marca = nuevaMarca;
    }
    public void imprimeMarca () {
        System.out.println ("Marca: " + marca);
    }
    public void cambiaPotencia (int nuevaPotencia) {
        potencia = nuevaPotencia;
    }
    public void imprimePotencia () {
        System.out.println ("Potencia: " + potencia);
    }
    public void encender () {
        encendido = true;
        numVecesEncendida++;
    }
    public void apagar () {
        encendido = false;
    }
    public void imprimeEstado () {
        System.out.println ("Encendida?: " + encendido);
    }
    public int obtieneNumVecesEncendida(){
        return numVecesEncendida;
    }
}
