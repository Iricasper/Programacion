package es.tuespiral.u6.p1.conexion;

import es.tuespiral.u6.p1.conexion.dominio.Carrito;
import es.tuespiral.u6.p1.conexion.excepciones.OrderException;
import es.tuespiral.u6.p1.conexion.dominio.OrderItem;
import java.util.Scanner;

public class PruebaTransaccion {

    public static void main(String args[]) throws OrderException {
        Scanner sc = new Scanner(System.in);
        int ordenEnElPedido = 1;
        
        System.out.println("IDENTIFICACIÓN DEL CLIENTE");
        System.out.println("Dime el ID del cliente que realiza el pedido:");
        int idCliente = sc.nextInt();
        Carrito carro = new Carrito(idCliente);
        
        System.out.println("ELIGE EL PACK A PEDIR:");
        System.out.println("1 - PACK BÁSICO:");
        System.out.println("  * CPU: Intel Xeon E5-1650 V3 - 564,89€ - ID=80");
        System.out.println("  * Placa Base: Supermicro X10SAT-O - 281,97€ - ID=151");

        System.out.println("2 - PACK AVANZADO:");
        System.out.println("  * CPU: Intel Core i7-4770K - 799,00€ - ID=73");
        System.out.println("  * Placa Base: Gigabyte GA-Z270X-Gaming  - 503,98€ - ID=225");
        System.out.println("Elige tu opción");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                carro.addItem(new OrderItem(null, ordenEnElPedido++, 80, 1, 564.89));
                carro.addItem(new OrderItem(null, ordenEnElPedido++, 151, 1, 281.97));
                break;
            case 2:
                carro.addItem(new OrderItem(null, ordenEnElPedido++, 73, 1, 799.00));
                carro.addItem(new OrderItem(null, ordenEnElPedido++, 225, 1, 503.98));
                break;
            default:
                System.out.println("Opción incorrecta");
        }

        if (!carro.isEmpty()) {
            double total = carro.getTotalAmount();
            System.out.println("Vas a comprar el pack " + opcion + " por valor de " + total+"€");
            System.out.println("Estás seguro (Sí=S o No=N)");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("S")
                    || respuesta.equalsIgnoreCase("Sí")
                    || respuesta.equalsIgnoreCase("Si")) {
                try {
                    carro.realizaPedidoTransaccional();
                    System.out.println("La transacción finalizó con éxito. El carrito está vacío.");
                    
                } catch (OrderException e) {
                    System.out.println(e);
                    System.out.println("Oups... algó salió mal");
                    System.out.println("La transacción finalizó con errores y se deshicieron los cambios");
                }
            } else {
                System.out.println("Operación anulada.");
            }
        }
        System.out.println("Esperamos que vuelva pronto");
    }
}
