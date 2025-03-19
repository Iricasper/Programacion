package u1e14.expresiones;
import java.util.Scanner;

public class Expresiones {

    public static void main(String[] args) {
        
        //Creamos un objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        //Creamos las variable a, b, c y d (tipo double)
        double a, b, c, d;
        
        //Pedimos al usuario que le de valor a las variables
        System.out.println("Dame el numero a: ");
        a = sc.nextDouble();
        
        System.out.println("Dame el numero b: ");
        b = sc.nextDouble();
        
        System.out.println("Dame el numero c: ");
        c = sc.nextDouble();
        
        System.out.println("Dame el numero d: ");
        d = sc.nextDouble();
        
        //Hacemos operaciones con las variables y con literales
        System.out.println("Primera operacion: " + ((a+b*38)/(c*d)));
        
        System.out.println("Segunda operacion: " + (a+((30-b)/(c+d))));
        
        System.out.println("Tercera operacion: " + (b*a*((a+b)/(b/d))));
        
        System.out.println("Cuarta operacion: " + (((a+50)/b)/(c/(4+d))));
    }
}
