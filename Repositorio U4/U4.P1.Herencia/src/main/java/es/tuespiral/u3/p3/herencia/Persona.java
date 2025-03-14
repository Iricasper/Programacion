package es.tuespiral.u3.p3.herencia;
public class Persona {
    private int edad;
    private String dni;
    protected String nombre, apellidos;
    int numHijos;

    // Todos los getters
    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getNumHijos() {
        return numHijos;
    }

    // Algunos setters
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }   
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Otros métodos
    public void tieneHijo() {
        numHijos++;
    }
    
    public void cumpleAnio() {
        edad++;
    }    
}
