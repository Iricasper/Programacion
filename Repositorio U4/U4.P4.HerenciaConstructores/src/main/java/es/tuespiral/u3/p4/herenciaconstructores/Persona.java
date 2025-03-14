package es.tuespiral.u3.p4.herenciaconstructores;

public class Persona {
    private String nombre, apellidos;
    
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
    }
    
//    public Persona(String nombre, String apellidos) {
//        this.nombre = nombre;
//        this.apellidos = apellidos;
//    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
    
    
}

