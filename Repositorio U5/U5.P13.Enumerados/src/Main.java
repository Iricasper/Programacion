
import enumerados.Country;
import enumerados.PerfilUsuario;
import enumerados.DiaSemana;
import enumerados.Idioma;



public class Main {
    public static void main(String[] args) {
        // Observa que no usamos el operador new
        PerfilUsuario usu = PerfilUsuario.ADMIN;
        
        // El enum obliga a la variable a tomar el valor de una de las 
        // constantes. Por ejemplo, la siguiente línea daría un error:
        // PerfilUsuario usu2 = "ADMIN";
        
        
        // Los enum los podemos usar en expresiones:
        if(usu == PerfilUsuario.ADMIN) {
            System.out.println("Bien! Eres administrador...");
        }   
        
        // También es muy usual verlos dentro de un switch:
        switch(usu) {
            case ADMIN:
                break;
            case GESTOR:
                break;
            case INVITADO:
                break;
        }
        
        // Y también los podemos imprimir
        System.out.println("Lo imprimimos: "+usu);
        // Sería equivalente usu.toString()
        // y también con el método predefinido usu.name()
        
        System.out.println("--------------------------------------------------");
        
        // Otro ejemplo:
        DiaSemana dia = DiaSemana.MIERCOLES;
        
        // Los tipos enumerados también ofrecen el método predefinido values()
        // que devuelve un array con todas las constantes definidas
        for(DiaSemana diaSem : DiaSemana.values()) {
            System.out.println(diaSem);
        }
        
        System.out.println("--------------------------------------------------");
        
        // El enum Idioma utiliza las capacidades de las clases Java y 
        // permite guardar propiedades asociadas a las constantes, así como
        // métodos
        Idioma lang = Idioma.EN;
        
        for(Idioma id : Idioma.values()) {
            System.out.println(id.toString());
            System.out.println(id.getNombreMayusc());
        }
        
        System.out.println("--------------------------------------------------");
        
        // El enum CountryLanguage muestra un ejemplo en el que guardamos
        // más valores asociados a las constantes
        Country cl = Country.SP;
        System.out.println("País: "+cl.country);
        System.out.println("Idioma: "+cl.language);
        System.out.println("Población: "+cl.population);
        
        
    }
}
