package enumerados;

/**
 * Además, los enums los podemos usar también como una clase Java pero
 * teniendo en cuenta que:
 * - El constructor no puede ser público
 * - Y cuando definimos las constantes tenemos que invocar al constructor
 * Observa:
 */
public enum Idioma {
    // Constantes que invocan al constructor
    SP("Español"), EN("Inglés"), FR("Francés");
    
    // Propiedad constante y pública
    public final String nombre;
    
    // Constructor privado
    private Idioma(String nombre) {
        this.nombre = nombre;
    }
    
    // Otro método cualquiera
    public String getNombreMayusc() {
        return nombre.toUpperCase();
    }
    
    @Override 
    public String toString() {
        return "Idioma: "+nombre;
    }
}
