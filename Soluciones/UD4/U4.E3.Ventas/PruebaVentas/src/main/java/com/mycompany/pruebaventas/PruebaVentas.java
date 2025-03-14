package com.mycompany.pruebaventas;

public class PruebaVentas {

    public static void main(String[] args) {
        Cliente cl1 = new Cliente ("John", "112233");
        Cliente cl2 = new Cliente ("Anne", "223344");
        Cliente cl3 = new Cliente ("Tom", "334455");
        
        Coche coche1 = new Coche ("Seat", "Ibiza", "1234-IBZ");
        Coche coche2 = new Coche ("Opel", "Corsa", "4321-COR");
        Coche coche3 = new Coche ("Seat", "Toledo", "5678-TOL");
        
        Venta v1 = new Venta ("08-01-2025", 12000, cl1, coche1);
        Venta v2 = new Venta ("09-01-2025", 9900, cl2, coche2);
        Venta v3 = new Venta ("07-01-2025", 12900, cl3, coche3);
    }
}
