package es.tuespiral.hijosdeobject;

public class MainToString {

    public static void main(String[] args) {
        Object referencia1 = new Object();
        Object referencia2 = referencia1;

        System.out.println("ANALIZAMOS EL MÉTODO toString CON REFERENCIAS A Object");
        System.out.println(referencia1.toString()); 
        System.out.println(referencia2); // se hace una llamada implícita a toString
         
        // Para averigurar qué es lo que sale después de la @ descomenta la siguiente línea
        //System.out.println(Integer.toHexString(referencia1.hashCode()));
        
        
        System.out.println("\nANALIZAMOS EL MÉTODO toString CON REFERENCIAS A Persona que lo sobrescribe");
        
        Persona p = new Persona("José Haro Quesí", 34);
        Persona p2 = new Persona("Ana López Iturriaga", 342);
        // Aquí vemos que ya no sale el resultado del toString de Object, sino el de Persona.
        System.out.println(p.toString());  
        System.out.println(p2);  // se hace una llamada implícita a toString
        
    }
}

