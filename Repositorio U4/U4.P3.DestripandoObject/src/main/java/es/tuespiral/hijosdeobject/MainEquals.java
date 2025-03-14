package es.tuespiral.hijosdeobject;

public class MainEquals {

    public static void main(String[] args) {
        Object referencia1 = new Object();
        Object referencia2 = referencia1;

        System.out.println("ANALIZAMOS EL MÉTODO equals CON REFERENCIAS A Object");
        System.out.println("TEST 1: dos referencias que apuntan al mismo objeto");
        if (referencia1.equals(referencia2)) {
            System.out.println("equals devuelve true porque ambas referencias apunta al mismo objeto");
            //Sería equivalente a la condición: referencia1 == referencia2
        }
        else {
            System.out.println("equals devuelve false porque las referencias apuntan a distintas zonas de memoria (objetos distintos)");
        }   
         
        // Ahora creamos un nuevo objeto y su dirección de memoria la guardamos
        // en la referencia2
        referencia2 = new Object();
        System.out.println("TEST 2: dos referencias que apuntan a distintos objetos");
        if (referencia1.equals(referencia2)) {
            System.out.println("equals devuelve true porque ambas referencias apunta al mismo objeto");
        }
        else {
            System.out.println("equals devuelve false porque las referencias apuntan a distintas zonas de memoria (objetos distintos)");
        }

        System.out.println("\nANALIZAMOS EL MÉTODO equals CON REFERENCIAS A String.");
        System.out.println("OJO: La clase String sobrescribe el método toString para hacer una comparación lexicográfica.");
        String s1 = "2874857R";
        String s2 = "2874857R";

        if (s1.equals(s2)) {
            System.out.println("TEST: equals devuelve true porque ambas cadenas guardan el mismo contenido");
        } else {
            System.out.println("TEST: equals devuelve false porque las cadenas tienen contenidos distintos");
        }

    }
}
