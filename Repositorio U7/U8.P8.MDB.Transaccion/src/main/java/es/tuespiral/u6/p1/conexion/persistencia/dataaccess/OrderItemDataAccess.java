package es.tuespiral.u6.p1.conexion.persistencia.dataaccess;

import es.tuespiral.u6.p1.conexion.persistencia.excepciones.OrderItemDataAccessException;
import es.tuespiral.u6.p1.conexion.persistencia.entidades.OrderItem;
import es.tuespiral.u6.p1.conexion.persistencia.utilidades.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class OrderItemDataAccess {

    public static void create (OrderItem item, Connection conn) throws OrderItemDataAccessException {

        if(conn == null) {
            throw new NullPointerException("La conexión suministrada no puede ser nula");
        }

        final String SQL = "INSERT INTO ORDER_ITEMS (order_id, item_id, product_id, quantity, unit_price) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement st = conn.prepareStatement(SQL);) {

            st.setInt(1, item.getOrderId());
            st.setInt(2, item.getItemId());
            st.setInt(3, item.getProductId());
            st.setInt(4, item.getQuantity());
            st.setDouble(5, item.getUnitPrice());
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new OrderItemDataAccessException("Se produjo un error al guardar los elementos del pedido");
        }
    }
    
    public static void create(OrderItem item) throws OrderItemDataAccessException {

        try (Connection conn = DBUtils.getConnection()) {

            create(item, conn);

        } catch (SQLException ex) {
            System.out.println(ex);
            throw new OrderItemDataAccessException("Se produjo un error al guardar el pedido");
        }

    }
   
}
