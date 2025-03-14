/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.u4.ej2;

/**
 *
 * @author usuario24
 */
public class PruebaClienteUsuario {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Pepe", "12345678A", null);
        Usuario u1 = new Usuario("pepeuser", "password", c1);
        Usuario u2 = new Usuario("erroruser", "passwordn't", null);
        System.out.println("Usuario: " + u1.getNombre() + ". Contraseña: " + u1.getPassword());
        System.out.println("Usuario: " + u2.getNombre() + ". Contraseña: " + u2.getPassword());
        Cliente c2 = new Cliente("Juan", "87654321Z", null);
        Usuario u3 = new Usuario("juanuser", "passwordjuan", c2);
        c2.setUsuario(u3);
        System.out.println("Usuario: " + u3.getNombre() + ". Contraseña: " + u3.getPassword());
        c2.getUsuario().setPassword("nuevapassword");
        System.out.println("Usuario: " + u3.getNombre() + ". Contraseña: " + u3.getPassword());
    }
}
