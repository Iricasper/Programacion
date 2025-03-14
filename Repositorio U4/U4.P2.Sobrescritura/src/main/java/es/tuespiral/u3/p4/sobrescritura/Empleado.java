package es.tuespiral.u3.p4.sobrescritura;

public class Empleado extends Persona {
    protected static final double SUELDO_BASE = 1250;
    protected static final double INCREMENTO_ANTIGUEDAD = 0.02;
    protected int aniosAntiguedad;

    // El cálculo de la nómina del Empleado estándar
    // Este método será sobrescrito por las subclases 
    // para reflejar las particularidades del cálculo de
    // la nómina para cada tipo de empleado.
    public double calculaNomina() {
        return SUELDO_BASE + SUELDO_BASE*INCREMENTO_ANTIGUEDAD*aniosAntiguedad;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }
}
