package es.tuespiral.hijosdeobject;

public class MainHashCode {

    public static void main(String[] args) {
        Object referencia1 = new Object();
        String cadena = "Hola qué tal";
        Persona pers = new Persona("Pedro", 20);
        

        System.out.println("OBSERVAMOS LOS RESULTADOS DEL MÉTODO hashCode");
        System.out.println("Este método debe devolver un valor único para cada objeto de la aplicación.");
        System.out.println("El código hash de referencia1 = "+referencia1.hashCode());
        System.out.println("El código hash de cadena = "+cadena.hashCode());
        System.out.println("El código hash de pers = "+pers.hashCode());
      
         // Qué crees que ocurrirá si ejecutamos las siguientes líneas:
         Object referencia2 = referencia1;
         System.out.println("El código hash de referencia2 = "+referencia2.hashCode());
    }
}
