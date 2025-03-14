package es.tuespiral.u3.p4.sobrescritura;

public class Directivo extends Empleado{
    protected double bonusAnual;
    protected static final double COMPLEMENTO_DIRECTIVO = 500;
    
    // El método calculaNómina se sobrescribe en la clase Directivo
    // adaptándose a las peculiaridades del cálculo de la nómina
    // para este tipo de empleado
    // La anotación @Override le indica a otros desarrolladores que 
    // este método sobrescribe al de su superclase.
    @Override
    public double calculaNomina() {
        // super permite llamar al método calculaNomina() de la superclase
        double sueldoBase = super.calculaNomina();
        return sueldoBase + COMPLEMENTO_DIRECTIVO + bonusAnual/12;
    }
    
    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    
    
}
