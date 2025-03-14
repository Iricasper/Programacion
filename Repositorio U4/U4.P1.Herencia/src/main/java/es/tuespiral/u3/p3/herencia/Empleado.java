package es.tuespiral.u3.p3.herencia;


public class Empleado extends Persona {
    private double salario;
    private int anioContratacion;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salarioBase) {
        this.salario = salarioBase;
    }

    public int getAnioContratacion() {
        return anioContratacion;
    }

    public void setAnioContratacion(int anioContratacion) {
        this.anioContratacion = anioContratacion;
    }
    
    public void pruebaModificadoresAcceso () {
        // El Empleado puede acceder a los miembros protected
        System.out.println("Puedo usar sin problemas propiedades protegidas: "+nombre+" "+apellidos);
                
        // Pero no a los miembros privados
        // edad = 10; daría un error
        // Sin embargo, sí podemos usar el setter público que consigue lo mismo
        setEdad(10);
        
        // Como Empleado está en el mismo paquete que Persona también podría
        // acceder a los miembros "friendly"
        System.out.println("También puedo usar los miembros friendly pero porque estamos en el mismo paquete: numHijos = "+numHijos);        
    }

}
