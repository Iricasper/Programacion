package com.mycompany.pruebaclientesusuarios;

public class Usuario {
    private String nombre;
    private String password;
    private Cliente cliente;

    public Usuario(String nombre, String pass, Cliente cli) {
        if (cli == null) {
            System.out.println("Error: este usuario NO tiene un cliente asociado");
            this.nombre = this.password = "error";            
        } else {
            this.nombre = nombre;
            this.password = pass;
        }
        
        this.cliente = cli;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
