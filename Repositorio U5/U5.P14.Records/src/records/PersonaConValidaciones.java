package records;

public record PersonaConValidaciones (String nombre, String apellidos, int edad) {
    
    // Podemos sobrescribir el constructor por defecto con la siguiente sintaxis
    // para a?adirle validaciones. Observa:
    public PersonaConValidaciones {
        if(nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        if(apellidos == null || apellidos.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
    }
    
}
