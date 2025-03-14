package es.tuespiral.u3.p4.sobrescritura;

public class PruebaEmpleados {
    public static void main(String[] args) {
        Empleado e = new Empleado();
        Comercial c = new Comercial();
        Directivo d = new Directivo();
        
        // Empleado estándar con 10 años de antigüedad
        e.setAniosAntiguedad(10);
        System.out.println("La nómina de un empleado estándar "
                + "con 10 años de antigüedad es "+e.calculaNomina()+" euros");        
                
        // Comercial con 10 años de antigüedad y 
        // un volumen de ventas de 8000 € al mes
        c.setAniosAntiguedad(10);
        c.setVolumenVentas(8000);
        System.out.println("La nómina de un comercial con 10 años de "
                + "antigüedad y 8000 euros de volumen de ventas es "
                + c.calculaNomina()+" euros");        
        
        
        // Directivo con 10 años de antigüedad y 
        // un bonus anual de 20000
        d.setAniosAntiguedad(10);
        d.setBonusAnual(20000);
        System.out.println("La nómina de un directivo con 10 años de "
                + "antigüedad y 20000 euros de bonus anual es "
                + d.calculaNomina()+" euros"); 
    }
}
