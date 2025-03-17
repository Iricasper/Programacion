package es.tuespiral.u6.p1.conexion.negocio.servicios;

import es.tuespiral.u6.p1.conexion.negocio.modelos.ShoppingCart;
import es.tuespiral.u6.p1.conexion.persistencia.entidades.Order;
import es.tuespiral.u6.p1.conexion.persistencia.entidades.OrderItem;
import es.tuespiral.u6.p1.conexion.persistencia.excepciones.DataAccessException;
import es.tuespiral.u6.p1.conexion.negocio.excepciones.ShoppingCartDataAccessException;
import es.tuespiral.u6.p1.conexion.persistencia.dataaccess.OrderDataAccess;
import es.tuespiral.u6.p1.conexion.persistencia.dataaccess.OrderItemDataAccess;
import es.tuespiral.u6.p1.conexion.persistencia.entidades.Product;
import es.tuespiral.u6.p1.conexion.persistencia.utilidades.DBUtils;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class ShopService {

    // La transacción consistirá en realizar las siguientes acciones de forma "indivisible":
    // - Insertar un registro en la tabla ORDERS
    // - Recuperar el nuevo ID generado tras la inserción
    // - Insertar en ORDER_ITEMS las distintas líneas de pedido almacenadas en el carrito 
    public static void checkout(ShoppingCart cart, int idCliente) throws ShoppingCartDataAccessException {

        boolean hasToRollback = false;
        Connection connTrans = null;

        try {
            // Arrancamos una nueva conexión con el autocommit OFF
            connTrans = DBUtils.getTransactionConnection();

            Order orderToInsert = new Order(null, idCliente, "Pending", null, LocalDate.now());
            // Insertamos el pedido en la BD y recuperamos el objeto resultante con su PK
            Order orderWithPK = OrderDataAccess.create(orderToInsert, connTrans);

            int orderId = orderWithPK.getOrderId();
            int numberOfItem = 1;
            for (Product p : cart.getProducts()) {
                OrderItem item = new OrderItem(orderId, numberOfItem++, p.getProductId(), cart.getQuantity(p), p.getListPrice());
                // Insertamos el item en la BD
                OrderItemDataAccess.create(item, connTrans);
            }

            // Descomenta la siguiente línea si quieres probar como al hacer rollback
            // no se graba ningún cambio en la BD
            // throw new SQLException("Forzando el rollback");
            
            
            connTrans.commit();

            // Vaciamos el carrito
            cart.removeAll();

        } catch (DataAccessException | SQLException e) {
            hasToRollback = true;
            System.out.println(e);
            throw new ShoppingCartDataAccessException("Ocurrió un error al realizar la transacción y se intentará revertir los cambios");

        } finally { // En cualquier caso cerramos los elementos abiertos
            try {
                if (connTrans != null && hasToRollback) {
                    connTrans.rollback();
                }

            } catch (SQLException e) {
                throw new ShoppingCartDataAccessException("Ocurrió un error al realizar la transacción y se deshicieron los cambios");
            }
        }
    }
}
