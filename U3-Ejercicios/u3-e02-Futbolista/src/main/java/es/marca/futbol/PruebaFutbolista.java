package es.marca.futbol;

import es.marca.futbol.jugadores.Futbolista;

public class PruebaFutbolista {

    public static void main(String[] args) {
        Futbolista f = new Futbolista("Ronaldinho", "Soccer");
        
        //Le asignamos valores a sus parámetros
        f.setNumGoles(4);
        f.setSalario(4000);
        
        //Comprobamos su estado
        System.out.println("El futbolista se llama "
                + f.getNombre() + " " + f.getApellidos());
        System.out.println("Goles: " + f.getNumGoles());
        System.out.println("Salario: " + f.getSalario());
        if (f.isLesionado()) {
            System.out.println("Esta lesionado");
        } else {
            System.out.println("Esta en plena forma");
        }
        
        f.setSalario(-2);
        System.out.println("Salario: " + f.getSalario());
        
        f.golAnulado(3);
        System.out.println("Goles: " + f.getNumGoles());
        
        f.golAnulado();
        System.out.println("Goles: " + f.getNumGoles());
        
        f.golAnulado(3);
        System.out.println("Goles: " + f.getNumGoles());
        
        f.marcaGol();
        System.out.println("Goles: " + f.getNumGoles());
        
        f.marcaGol(12);
        System.out.println("Goles: " + f.getNumGoles());
        
        f.marcaGol(0);
        System.out.println("Goles: " + f.getNumGoles());
        
        f.setLesionado(true);
        if (f.isLesionado()) {
            System.out.println("Esta lesionado");
        } else {
            System.out.println("Esta en plena forma");
        }
        
        f.golAnulado();
        System.out.println("Goles: " + f.getNumGoles());
        
        f.golAnulado(3);
        System.out.println("Goles: " + f.getNumGoles());
        
        f.marcaGol();
        System.out.println("Goles: " + f.getNumGoles());
        
        f.marcaGol(12);
        System.out.println("Goles: " + f.getNumGoles());
        
        f.marcaGol();
        System.out.println("Goles: " + f.getNumGoles());
    }
}
