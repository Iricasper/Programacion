package u1ejercicios.u1.e13.pruebascanner;
import java.util.Scanner;

public class PruebaScanner {

    public static void main(String[] args) {
        
         // Creamos un objeto de la clase Scanner
         Scanner sc = new Scanner(System.in);
        
         //Creamos las variables a registrar
         String nombre;
         String apellido1;
         int num1;
         int num2;
        
         //Pedimos al usuario que introduzca las variables y las registramos
         System.out.println("Dime tu nombre: ");
         nombre = sc.nextLine();
        
         System.out.println("Dime tu apellido: ");
         apellido1 = sc.nextLine();
        
         System.out.println("Dime un numero entero: ");
         num1 = sc.nextInt();
        
         System.out.println("Dime otro numero entero: ");
         num2 = sc.nextInt();
        
         //Imprimimos las variables y hacemos operaciones con ellas.
         System.out.println("Tu nombre es " + nombre + " y tu apellido es "
                  + apellido1 + ".");
         System.out.println("Los numeros leidos son " + num1 + " y " + num2 + "."
                            + " Su suma es " + (num1 + num2) + " y su producto es "
                            + num1 * num2);
    }
}
