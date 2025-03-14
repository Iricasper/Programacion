import records.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Pedro", "Roca Fuerte", 23);
        
        System.out.println("Nombre: "+p.nombre());
        System.out.println("Apellidos: "+p.apellidos());
        System.out.println("Edad: "+p.edad());
        System.out.println(p);
        
        // Observa ahora el código de PersonaConValidaciones
    }
}
