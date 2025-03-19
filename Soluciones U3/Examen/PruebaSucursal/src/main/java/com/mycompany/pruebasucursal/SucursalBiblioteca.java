package com.mycompany.pruebasucursal;

public class SucursalBiblioteca {
    private String nombre;
    private Bibliotecario[] listaBibliotecarios = new Bibliotecario[3];
    
    
    public SucursalBiblioteca (String nombre, Bibliotecario jefe, Bibliotecario bib1, Bibliotecario bib2) {
        assert (nombre != null && nombre.equals(""));
        assert (jefe != null && bib1 != null && bib2 != null);
        this.nombre = nombre;
        this.listaBibliotecarios[0] = jefe;
        jefe.setJefe(true);
        this.listaBibliotecarios[1] = bib1;
        this.listaBibliotecarios[2] = bib2;
    }
    
    
    public Bibliotecario[] getListaBibliotecarios() {
        return listaBibliotecarios;
    }
        
    
    public double getCosteMensual () {
        double sumaSueldos = 0;
        
        for (Bibliotecario b : listaBibliotecarios) {
            sumaSueldos += b.getSueldo();
        }
        
        return sumaSueldos;
    }
    
    
    public double getEdadPromedio () {
        double sumaEdades = 0;
        
        for (Bibliotecario b : listaBibliotecarios) {
            sumaEdades += b.getEdad();
        }
        
        return sumaEdades / 3;
    }
    
    
    public Bibliotecario getJefeSucursal () {
        return listaBibliotecarios[0];
    }
}
