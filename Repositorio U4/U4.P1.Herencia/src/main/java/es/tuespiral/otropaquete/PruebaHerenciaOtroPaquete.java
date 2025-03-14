package es.tuespiral.otropaquete;

import es.tuespiral.u3.p3.herencia.Empleado;

public class PruebaHerenciaOtroPaquete {
    public static void main(String[] args) {
        Empleado e = new Empleado();
        
        // Usamos métodos de la Persona
        // Recordemos que tiene un objeto "Persona" encerrado dentro
        e.setNombre("Juan");
        e.setApellidos("López Caro");
        e.setDni("88543763T");
        
        // Usamos métodos del Empleado
        e.setSalario(1700);
        e.setAnioContratacion(2020);
        
        // Estudiamos cómo se comportan los miembros de la Persona y sus
        // modificadores de acceso para el objeto de la clase Empleado
        // 1) Miembros públicos
        System.out.println("Podemos acceder a los miembros públicos de Persona sin problemas. Ej: DNI = "+e.getDni());
        
        // 2) Miembros protected
        // YA NO PODRÍAMOS ACCEDER PORQUE ESTAMOS EN OTRO PAQUETE
        // System.out.println("Podemos acceder a los miembros protected de Persona solo desde el Empleado. Ej: nombre = "+e.nombre);
        
        // 3) Miembros "friendly"
        // YA NO PODRÍAMOS ACCEDER PORQUE ESTAMOS EN OTRO PAQUETE
        // System.out.println("Podemos acceder a los miembros friendly de Persona pero solo porque estamos en el mismo paquete. Ej: numHijos = "+e.numHijos);

        // 4) Miembros private
        // e.edad = 10;  Falla. No está accesible
        System.out.println("No podemos acceder a los miembros privados. Solo se permitiría utilizando los setters públicos correspondientes");
        
        // 5) También podemos llamar al método que hicimos para probar esto
        System.out.println("-----------------------");
        e.pruebaModificadoresAcceso();
    }
}
