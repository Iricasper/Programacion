package com.mycompany.pruebaclientesusuarios;

public class PruebaClientesUsuarios {

    public static void main(String[] args) {
        // Crea un cliente sin usuario llamado “Pepe”, con el DNI que quieras.
        Cliente cli1 = new Cliente ("Pepe", "112233", null);
        // Cliente cli1 = new Cliente ("Pepe", "112233"); Estaría bien
        
        
        // Crea un usuario de nombre “pepeuser” con la password que quieras
        // asociado al cliente “Pepe”.
        Usuario usu1 = new Usuario ("pepeuser", "hola", cli1);
        
        
        // Crea un usuario “erroruser”, con la contraseña que quieras que no se
        // asocie a ningún cliente.
        Usuario usu2 = new Usuario ("erroruser", "adios", null);
        
        
        // Imprime el nombre y password del usuario que acabas de crear.
        System.out.println("Ultimo usuario dado de alta: Nombre - " +
                           usu2.getNombre() + ", Contraseña - " +
                           usu2.getPassword());
        
        
        // Crea un cliente sin usuario llamado “Juan”, con el DNI que quieras.
        Cliente cli2 = new Cliente ("Juan", "quepasa", null);
        
        
        // Crea un usuario de nombre “juanuser” con la password que quieras
        // asociado al cliente “Juan”.
        Usuario usu3 = new Usuario ("juanuser", "yatedigo", cli2);
        
        
        // Ahora utiliza el método setUsuario(…) del cliente “Juan” para
        // asociarlo con el usuario “juanuser”.
        cli2.setUsuario(usu3);
        
        
        // Pídele al cliente “Juan” que te devuelva su usuario asociado y
        // después cámbiale el valor de la contraseña.
        cli2.getUsuario().setPassword("cambiada");
    }
}
