package u1e15.factura;
import java.util.Scanner;

public class Factura {

    public static void main(String[] args) {
        //Creamos la constante IVA
        final int IVA = 21;
        
        //Creamos el objeto de clase Scanner
        Scanner sc = new Scanner(System.in);
        
        //Pedimos al usuario que inserte el valor de la variable precio (double)
        double precio;
        System.out.println("Dime el precio de un pen-drive usando comas para los decimales");
        precio = sc.nextDouble();
        
        //Pedimos al usuario que inserte el valor de la variable numPen (int)
        int numPen;
        System.out.println("Dime el numero de pen-drives que quieres comprar");
        numPen = sc.nextInt();
        
        //Ahora imprimimos la factura, realizando los cálculos necesarios
        System.out.println("FACTURA JAMAZON");
        System.out.println("Precio unitario: " + precio + " €");
        System.out.println("Numero articulos: " + numPen);
        System.out.println("Subtotal: " + (precio*numPen) + " €");
        System.out.println("---------------------------------------");
        System.out.println("Total (IVA incluido): " + ((precio*numPen)*(100+IVA)/100) + " €");
        /* Como no me han pedido que use más variables no he añadido
        resultadoSinIva ni resultadoConIva, hago el cálculo directamente */
    }
}
