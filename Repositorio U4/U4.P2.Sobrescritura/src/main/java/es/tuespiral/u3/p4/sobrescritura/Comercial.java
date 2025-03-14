package es.tuespiral.u3.p4.sobrescritura;

public class Comercial extends Empleado{
    protected double volumenVentas;
    protected static final double PORCENTAJE_VENTAS = 0.10;

    
    // El método calculaNómina se sobrescribe en la clase Comercial
    // adaptándose a las peculiaridades del cálculo de la nómina
    // para este tipo de empleado
    // La anotación @Override le indica a otros desarrolladores que 
    // este método sobrescribe al de su superclase.
    @Override
    public double calculaNomina() {
        // super permite llamar al método calculaNomina() de la superclase
        double sueldoBase = super.calculaNomina(); 
        return sueldoBase + PORCENTAJE_VENTAS*volumenVentas;
    }
    
    public double getVolumenVentas() {
        return volumenVentas;
    }

    public void setVolumenVentas(double volumenVentas) {
        this.volumenVentas = volumenVentas;
    }
    
    
}
