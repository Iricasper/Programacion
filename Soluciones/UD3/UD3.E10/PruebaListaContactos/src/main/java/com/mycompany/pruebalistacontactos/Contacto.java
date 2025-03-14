package com.mycompany.pruebalistacontactos;

public class Contacto {
    private String nombre;
    private String apellidos;
    private int telefono;
    private String email;

    public Contacto(String nombre, String apellidos, int telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
    }

    public Contacto(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public Contacto() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        assert (nombre != null && !nombre.equals(""));
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        assert (apellidos != null && !apellidos.equals(""));
        this.apellidos = apellidos;
    }

    public void setTelefono(int telefono) {
        assert (telefono > 0);
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        assert (email != null && !email.equals(""));
        this.email = email;
    }
    
    public void imprimirContacto() {
        System.out.println("Nombre completo: " + nombre + " " + apellidos +
                           ", telefono: " + telefono + ", email: " +
                           email);
    }
    
}
