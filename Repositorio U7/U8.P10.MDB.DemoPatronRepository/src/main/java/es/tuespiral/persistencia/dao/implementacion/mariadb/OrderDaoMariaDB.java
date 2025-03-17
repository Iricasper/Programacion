package es.tuespiral.persistencia.dao.implementacion.mariadb;

import es.tuespiral.persistencia.dao.OrderDao;
import es.tuespiral.persistencia.dao.entidad.CustomerEntity;
import es.tuespiral.persistencia.dao.excepcion.DataAccessException;
import es.tuespiral.persistencia.dao.excepcion.NotFoundException;
import es.tuespiral.persistencia.dao.entidad.OrderEntity;
import es.tuespiral.persistencia.utilidades.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoMariaDB implements OrderDao {
    private Connection conn = null;
    private final String nombreClase;
    private final String nombreTabla = "ORDERS";
    private final String SELECT_ALL = "SELECT * FROM " + nombreTabla;
    private final String SELECT_ID = "SELECT * FROM " + nombreTabla + " WHERE ORDER_ID = ?";
    private final String SELECT_CUSTOMER_ID = "SELECT * FROM " + nombreTabla + " WHERE CUSTOMER_ID = ?";
    private final String INSERT = "INSERT INTO " + nombreTabla + " (CUSTOMER_ID, STATUS, SALESMAN_ID, ORDER_DATE) VALUES (?, ?, ?, ?)";
    private final String UPDATE = "UPDATE " + nombreTabla + " SET CUSTOMER_ID = ?, STATUS = ?, SALESMAN_ID = ?, ORDER_DATE = ? WHERE ORDER_ID = ?";
    private final String DELETE = "DELETE FROM " + nombreTabla + " WHERE ORDER_ID = ?";

    public OrderDaoMariaDB() throws DataAccessException {
        nombreClase = this.getClass().getName();
        try {
            this.conn = DBUtils.getConnection();    
        } catch(SQLException e) {
            throw new DataAccessException(nombreClase+" falló al conectar con la BD");
        }
    }

    @Override
    public void insertar(OrderEntity obj) throws DataAccessException {
        try {
            PreparedStatement st = conn.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setInt(1, obj.getCustomerId());
            st.setString(2, obj.getStatus());
            st.setInt(3, obj.getSalesmanId());
            st.setDate(4, DBUtils.toSqlDate(obj.getOrderDate()));
            
            int numFilas = st.executeUpdate();
            if (numFilas != 1) {
                throw new DataAccessException(nombreClase + " falló al insertar en la BD");
            }

            // Recuperamos la clave primaria generada para copiarla en el objeto
            ResultSet rs = st.getGeneratedKeys();
            if (rs != null && rs.next()) {
                obj.setOrderId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al insertar en la BD", ex);
        }
    }

    @Override
    public void actualizar(OrderEntity obj) throws DataAccessException {
        try {
            PreparedStatement st = conn.prepareStatement(UPDATE);
            st.setInt(1, obj.getCustomerId());
            st.setString(2, obj.getStatus());
            st.setInt(3, obj.getSalesmanId());
            st.setDate(4, DBUtils.toSqlDate(obj.getOrderDate()));
            st.setInt(5, obj.getOrderId());
            
            int numFilas = st.executeUpdate();
            if (numFilas != 1) {
                throw new DataAccessException(nombreClase + " falló al actualizar en la BD");
            }
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al actualizar en la BD", ex);
        }
    }

    @Override
    public void eliminar(OrderEntity obj) throws DataAccessException {
        try {
            PreparedStatement st = conn.prepareStatement(DELETE);
            st.setInt(1, obj.getOrderId());
            int numFilas = st.executeUpdate();
            if (numFilas != 1) {
                throw new DataAccessException(nombreClase + " falló al borrar en la BD");
            }
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al borrar en la BD", ex);
        }
    }

    @Override
    public List<OrderEntity> obtenerTodos() throws DataAccessException {
        List<OrderEntity> lista = new ArrayList<>();

        try {
            PreparedStatement st = conn.prepareStatement(SELECT_ALL);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                OrderEntity order = rowMapper(rs);
                lista.add(order);
            }
            return lista;
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al seleccionar de la BD", ex);
        }
    }

    @Override
    public OrderEntity obtener(Integer id) throws DataAccessException {
        try {
            PreparedStatement st = conn.prepareStatement(SELECT_ID);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs != null && rs.next()) {
                return rowMapper(rs);
            } else {
                throw new NotFoundException(nombreClase + " falló al seleccionar el id = " + id);
            }
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al seleccionar el id = " + id, ex);
        }
    }

    @Override
    public List<OrderEntity> obtenerPorCustomerId(Integer customerId) throws DataAccessException {
        List<OrderEntity> lista = new ArrayList<>();

        try {
            PreparedStatement st = conn.prepareStatement(SELECT_CUSTOMER_ID);
            st.setInt(1, customerId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                OrderEntity order = rowMapper(rs);
                lista.add(order);
            }
            return lista;
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al seleccionar de la BD", ex);
        }
    }
    
    
    private OrderEntity rowMapper(ResultSet rs) throws SQLException {
        Integer orderId = rs.getInt(1);
        Integer customerId = rs.getInt(2);
        String status = rs.getString(3);
        Integer salesmanId = rs.getInt(4);
        LocalDate orderDate = DBUtils.toLocalDate(rs.getDate(5));
        
        return new OrderEntity(orderId, customerId, status, salesmanId, orderDate);
    }

    
}
