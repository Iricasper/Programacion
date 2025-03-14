package es.marca.futbol.jugadores;

public class Futbolista {

    //Propiedades en privado
    private String nombre;
    private String apellidos;
    private int numGoles;
    private double salario;
    private boolean lesionado;

    //Métodos
    //Constructor
    public Futbolista(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        if (numGoles < 0) {
            System.out.println("Introduce un numero valido");
        } else {
            this.numGoles = numGoles;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("El salario no puede ser negativo");
        } else {
            this.salario = salario;
        }
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    /**
     * Aumenta el número de goles en uno
     */
    public void marcaGol() {
        if (!lesionado) {
            numGoles++;
        } else {
            System.out.println("El jugador esta lesionado");
        }
    }

    /**
     * Aumenta el número de goles según el parámetro de entrada que reciba
     *
     * @param numGoles
     */
    public void marcaGol(int numGoles) {
        if (numGoles > 0 && !lesionado) {
            this.numGoles = this.numGoles + numGoles;
        } else {
            if (numGoles <= 0) {
                System.out.println("Introduce un numero valido");
            } else {
                System.out.println("El jugador esta lesionado");
            }
        }
    }

    /**
     * Disminuye el número de goles en uno
     */
    public void golAnulado() {
        if (numGoles == 0) {
            System.out.println("el numero de goles no puede ser negativo");
        } else {
            numGoles--;
        }
    }

    /**
     * Disminuye el número de goles según el parámetro de entrada que reciba
     *
     * @param numGoles
     */
    public void golAnulado(int numGoles) {
        if (this.numGoles >= numGoles && numGoles > 0) {
            this.numGoles = this.numGoles - numGoles;
        } else {
            if (numGoles <= 0) {
                System.out.println("Introduce un numero valido");
            } else {
                System.out.println("El numero de goles no puede ser negativo");
            }
        }
    }
}
