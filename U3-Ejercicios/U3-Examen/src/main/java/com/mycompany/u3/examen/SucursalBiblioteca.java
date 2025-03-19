package com.mycompany.u3.examen;

public class SucursalBiblioteca {

    // Propiedades
    private String nombre;
    private Bibliotecario[] b = new Bibliotecario[3];

    // Constructor
    public SucursalBiblioteca(String nombre, Bibliotecario jefe,
            Bibliotecario bib1, Bibliotecario bib2) {
        assert (nombre != null);
        this.nombre = nombre;
        assert (jefe != null);
        this.b[0] = jefe;
        this.b[0].setJefe(true);
        assert (bib1 != null);
        this.b[1] = bib1;
        assert (bib2 != null);
        this.b[2] = bib2;
    }

    // Métodos
    public double getCostoMensual() {
        double costo = 0;
        for (Bibliotecario elem : b) {
            costo += elem.getSueldoMensual();
        }
        return costo;
    }

    public int getEdadPromedio() {
        int sumaEdad = 0;
        for (Bibliotecario elem : b) {
            sumaEdad += elem.getEdad();
        }
        return sumaEdad/3;
    }

    public Bibliotecario getJefeSucursal() {
        return b[0];
    }
}
