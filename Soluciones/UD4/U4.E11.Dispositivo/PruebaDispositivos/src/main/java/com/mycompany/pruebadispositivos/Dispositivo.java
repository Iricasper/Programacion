package com.mycompany.pruebadispositivos;

public class Dispositivo {
    private boolean encendido;
    private String marca;
    private String modelo;
    
    public Dispositivo (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Dispositivo (String marca) {
        this.marca = marca;
        this.modelo = "Sin definir";
    }
    
    public Dispositivo () {
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        this.encendido = true;
    }
    
    public void apagar() {
        this.encendido = false;
    }
    
    
}
