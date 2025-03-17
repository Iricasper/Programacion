package es.tuespiral.u6.p1.conexion.persistencia.dataaccess;

import es.tuespiral.u6.p1.conexion.persistencia.entidades.Order;
import es.tuespiral.u6.p1.conexion.persistencia.excepciones.OrderDataAccessException;
import es.tuespiral.u6.p1.conexion.persistencia.utilidades.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDataAccess {

    public static Order create(Order order, Connection conn) throws OrderDataAccessException {

        if (conn == null) {
            throw new NullPointerException("La conexión suministrada no puede ser nula");
        }

        final String SQL = "INSERT INTO ORDERS (CUSTOMER_ID, STATUS, ORDER_DATE) VALUES (?, ?, ?)";

        try (PreparedStatement st = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);) {

            st.setInt(1, order.getCustomerId());
            st.setString(2, order.getStatus());
            java.sql.Date fecha = DBUtils.toSqlDate(order.getOrderDate());
            st.setDate(3, fecha);
            
            st.executeUpdate();

            // Recuperamos la PK que se ha generado tras el INSERT en ORDERS
            ResultSet rs = st.getGeneratedKeys();
            if (rs != null && rs.next()) {
                int nuevaPK = rs.getInt(1);
                return new Order(nuevaPK, order.getCustomerId(), order.getStatus(), order.getSalesmanId(), order.getOrderDate());
            }
            return null;

        } catch (SQLException ex) {
            System.out.println(ex);
            throw new OrderDataAccessException("Se produjo un error al guardar el pedido");
        }

    }

    public static Order create(Order order) throws OrderDataAccessException {

        try (Connection conn = DBUtils.getConnection()) {

            return create(order, conn);

        } catch (SQLException ex) {
            System.out.println(ex);
            throw new OrderDataAccessException("Se produjo un error al guardar el pedido");
        }

    }

}
