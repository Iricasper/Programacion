package mi.tienda;

import mi.tienda.juguetes.Juguete;
import java.util.Scanner;

public class PruebaJuguete {

    public static void main(String[] args) {
        
        Juguete j1 = new Juguete();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del juguete: ");
        j1.estableceNombreJuguete(sc.nextLine());
        
        System.out.println("Introduzca la edad recomendada para el juguete: ");
        j1.estableceEdadJuguete(sc.nextLine());
        
        System.out.println("Introduzca el precio del juguete: ");
        j1.establecePrecioJuguete(sc.nextDouble());
        
        System.out.println("Introduzca el stock disponible: ");
        j1.estableceStock(sc.nextInt());
        
        System.out.println("------------");
        System.out.println("Acaban de comprar productos por valor de "+j1.compra(1)+" euros");
        System.out.println("Acaban de comprar productos por valor de "+j1.compra(2)+" euros");
        System.out.println("Acaban de comprar productos por valor de "+j1.compra(3)+" euros");
        System.out.println("Acaban de comprar productos por valor de "+j1.compra(4)+" euros");
        System.out.println("Acaban de devolver productos por valor de "+j1.devuelve(3)+" euros");
        System.out.println("-----------");
        System.out.println("El nombre del juguete es "+j1.obtieneNombreJuguete());
        System.out.println("La edad recomendada para el juguete es "+j1.obtieneEdadJuguete()+" anios");
        System.out.println("El precio de este juguete es de "+j1.obtienePrecioJuguete()+" euros");
        System.out.println("El stock de este juguete es de "+j1.obtieneStock()+" unidades");
        System.out.println("Con una oferta del 25%, el precio del juguete es de "+j1.calculaPrecioRebajado25());
        System.out.println("Con una oferta del 40%, el precio del juguete es de "+j1.calculaPrecioRebajado40());
    }   
}