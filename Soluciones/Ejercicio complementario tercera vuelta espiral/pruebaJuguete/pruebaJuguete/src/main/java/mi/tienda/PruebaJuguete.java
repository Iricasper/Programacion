package mi.tienda;

import mi.tienda.juguetes.Juguete;
import java.util.Scanner;


public class PruebaJuguete {

    public static void main(String[] args) {
        Juguete j = new Juguete();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el nombre del juguete: ");
        j.estableceNombreJuguete(sc.nextLine());
        
        System.out.print("Introduzca la edad recomendada para el juguete: ");
        j.estableceEdadJuguete(sc.nextLine());
        
        System.out.print("Introduzca el precio del juguete: ");
        j.establecePrecioJuguete(sc.nextDouble());
        
        System.out.print("Introduzca el stock del juguete: ");
        j.estableceStock(sc.nextInt());
        
        System.out.println("");
        System.out.println("Acaban de comprar productos por importe de " + j.compra(1) + " euros.");
        System.out.println("Acaban de comprar productos por importe de " + j.compra(2) + " euros.");
        System.out.println("Acaban de comprar productos por importe de " + j.compra(3) + " euros.");
        System.out.println("Acaban de comprar productos por importe de " + j.compra(4) + " euros.");
        System.out.println("Acaban de devolver productos por importe de " + j.devuelve(3) + " euros.");
        
        System.out.println("");
        System.out.println("Nombre del juguete: " + j.obtieneNombreJuguete());
        System.out.println("Edad recomendada del juguete: " + j.obtieneEdadJuguete());
        System.out.println("Precio del juguete: " + j.obtienePrecioJuguete() + " euros.");
        System.out.println("Stock actual del juguete: " + j.obtieneStock() + " unidades.");
        
        System.out.println("");
        System.out.println("Precio rebajado un 25 %: " + j.calculaPrecioRebajado25() + " euros.");
        System.out.println("Precio rebajado un 40 %: " + j.calculaPrecioRebajado40() + " euros.");
        
        
    }
}
