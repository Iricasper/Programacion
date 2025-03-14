package es.tuespiral.u3.p4.herenciaconstructores;

public class Empleado extends Persona {
    private final double SALARIO_MINIMO = 1050;
    private double salario;
    
    public Empleado() {
        // La primera línea del constructor de la subclase debe 
        // ser una llamada al constructor de la superclase.
        // Si el desarrollado no la pone explícitamente, Java
        // añadiría esta línea:
        super();
        salario = SALARIO_MINIMO;
    }
    
//    public Empleado(String nombre, String apellidos, double salario) {
//        super(nombre, apellidos);
//        this.salario = salario;
//    }

    @Override
    public String toString() {
        return super.toString()+". Empleado{" + "SALARIO_MINIMO=" + SALARIO_MINIMO + ", salario=" + salario + '}';
    }
    
    
}

