package com.mycompany.pruebaclientesusuarios;

public class Cliente {
    private String nombre;
    private String dni;
    private String direccionPostal;
    private String email;
    private Usuario usuario;

    public Cliente(String nombre, String dni, Usuario usu) {
        this.nombre = nombre;
        this.dni = dni;
        
        if (usu == null) {
            System.out.println("Advertencia: cliente creado sin usuario asociado");
        }
        
        this.usuario = usu;
    }

    
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public String getEmail() {
        return email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
