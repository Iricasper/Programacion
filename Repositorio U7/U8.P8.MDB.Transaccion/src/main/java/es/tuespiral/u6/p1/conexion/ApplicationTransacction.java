package es.tuespiral.u6.p1.conexion;

import es.tuespiral.u6.p1.conexion.negocio.modelos.ShoppingCart;
import es.tuespiral.u6.p1.conexion.persistencia.excepciones.OrderException;
import es.tuespiral.u6.p1.conexion.persistencia.entidades.OrderItem;
import es.tuespiral.u6.p1.conexion.negocio.servicios.ShopService;
import es.tuespiral.u6.p1.conexion.negocio.excepciones.ShoppingCartDataAccessException;
import es.tuespiral.u6.p1.conexion.persistencia.dataaccess.ProductDataAccess;
import es.tuespiral.u6.p1.conexion.persistencia.entidades.Product;
import es.tuespiral.u6.p1.conexion.persistencia.excepciones.ProductDataAccessException;
import java.util.Scanner;

public class ApplicationTransacction {

    public static void main(String args[]) throws OrderException {
        int idCliente = identificarCliente();
        ShoppingCart carro = new ShoppingCart(idCliente);

        int opcion = elegirPackArticulos();

        cargarCarroConArticulosDelPackElegido(opcion, carro);
        procesarCarro(carro, opcion, idCliente);

    }

    private static void cargarCarroConArticulosDelPackElegido(int opcion, ShoppingCart carro) {
        try {
            switch (opcion) {
                case 1: {
                    Product p = ProductDataAccess.selectById(80);
                    carro.addItem(p);

                    p = ProductDataAccess.selectById(151);
                    carro.addItem(p);
                    break;
                }
                case 2: {
                    Product p = ProductDataAccess.selectById(73);
                    carro.addItem(p);

                    p = ProductDataAccess.selectById(225);
                    carro.addItem(p);
                    break;
                }
                default:
                    System.out.println("Opción incorrecta");
            }
        } catch (ProductDataAccessException e) {
            System.out.println("Algo salió mal al cargar el carrito con los produdctos elegidos");
        }
    }

    private static int identificarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("IDENTIFICACIÓN DEL CLIENTE");
        System.out.println("Dime el ID del cliente que realiza el pedido:");
        return sc.nextInt();
    }

    private static int elegirPackArticulos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ELIGE EL PACK A PEDIR:");
        System.out.println("1 - PACK BÁSICO:");
        System.out.println("  * CPU: Intel Xeon E5-1650 V3 - 564,89€ - ID=80");
        System.out.println("  * Placa Base: Supermicro X10SAT-O - 281,97€ - ID=151");

        System.out.println("2 - PACK AVANZADO:");
        System.out.println("  * CPU: Intel Core i7-4770K - 799,00€ - ID=73");
        System.out.println("  * Placa Base: Gigabyte GA-Z270X-Gaming  - 503,98€ - ID=225");
        System.out.println("Elige tu opción");
        return sc.nextInt();
    }

    private static void procesarCarro(ShoppingCart carro, int opcion, int idCliente) {
        Scanner sc = new Scanner(System.in);

        if (!carro.isEmpty()) {
            double total = carro.getTotalAmount();
            System.out.println("Vas a comprar el pack " + opcion + " por valor de " + total + "€");
            System.out.println("Estás seguro (S=Sí o N=No)");
            String respuesta = sc.nextLine();

            if (!respuesta.equalsIgnoreCase("S")) {
                System.out.println("Operación anulada.");
            } else {
                try {
                    ShopService.checkout(carro, idCliente);
                    System.out.println("La transacción finalizó con éxito. El carrito está vacío.");

                } catch (ShoppingCartDataAccessException e) {
                    System.out.println(e);
                    System.out.println("Oups... algó salió mal");
                    System.out.println("La transacción finalizó con errores y se deshicieron los cambios");
                }

            }
        } else {
            System.out.println("Su carro está vacío, nada que procesar");
        }
        System.out.println("Esperamos que vuelva pronto");
    }
}
