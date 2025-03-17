package es.tuespiral.persistencia.dao.implementacion.mariadb;

import es.tuespiral.persistencia.dao.CustomerDao;
import es.tuespiral.persistencia.entidad.Customer;
import es.tuespiral.persistencia.dao.excepcion.DataAccessException;
import es.tuespiral.persistencia.dao.excepcion.NotFoundException;
import es.tuespiral.persistencia.utilidades.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoMariaDB implements CustomerDao {
    private Connection conn = null;
    private final String nombreClase;
    private final String nombreTabla = "CUSTOMERS";
    private final String SELECT_ALL = "SELECT * FROM " + nombreTabla;
    private final String SELECT_ID = "SELECT * FROM " + nombreTabla + " WHERE CUSTOMER_ID = ?";
    private final String INSERT = "INSERT INTO " + nombreTabla + " (NAME, ADDRESS, WEBSITE, CREDIT_LIMIT) VALUES (?, ?, ?, ?)";
    private final String UPDATE = "UPDATE " + nombreTabla + " SET NAME = ?, ADDRESS = ?, WEBSITE = ?, CREDIT_LIMIT = ? WHERE CUSTOMER_ID = ?";
    private final String DELETE = "DELETE FROM " + nombreTabla + " WHERE CUSTOMER_ID = ?";

    public CustomerDaoMariaDB() throws DataAccessException {
        nombreClase = this.getClass().getName();
        try {
            this.conn = DBUtils.getConnection();    
        } catch(SQLException e) {
            throw new DataAccessException(nombreClase+" falló al conectar con la BD");
        }
    }

    @Override
    public void insertar(Customer obj) throws DataAccessException {
        try {
            PreparedStatement st = conn.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getName());
            st.setString(2, obj.getAddress());
            st.setString(3, obj.getWebsite());
            st.setDouble(4, obj.getCreditLimit());
            
            int numFilas = st.executeUpdate();
            if (numFilas != 1) {
                throw new DataAccessException(nombreClase + " falló al insertar en la BD");
            }

            // Recuperamos la clave primaria generada para copiarla en el objeto
            ResultSet rs = st.getGeneratedKeys();
            if (rs != null && rs.next()) {
                obj.setCustomerId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al insertar en la BD", ex);
        }
    }

    @Override
    public void actualizar(Customer obj) throws DataAccessException {
        try {
            PreparedStatement st = conn.prepareStatement(UPDATE);
            st.setString(1, obj.getName());
            st.setString(2, obj.getAddress());
            st.setString(3, obj.getWebsite());
            st.setDouble(4, obj.getCreditLimit());
            st.setInt(5, obj.getCustomerId());
            
            int numFilas = st.executeUpdate();
            if (numFilas != 1) {
                throw new DataAccessException(nombreClase + " falló al actualizar en la BD");
            }
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al actualizar en la BD", ex);
        }
    }

    @Override
    public void eliminar(Customer obj) throws DataAccessException {
        try {
            PreparedStatement st = conn.prepareStatement(DELETE);
            st.setInt(1, obj.getCustomerId());
            int numFilas = st.executeUpdate();
            if (numFilas != 1) {
                throw new DataAccessException(nombreClase + " falló al borrar en la BD");
            }
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al borrar en la BD", ex);
        }
    }

    @Override
    public List<Customer> obtenerTodos() throws DataAccessException {
        List<Customer> lista = new ArrayList<>();

        try {
            PreparedStatement st = conn.prepareStatement(SELECT_ALL);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Customer customer = rowMapper(rs);
                lista.add(customer);
            }
            return lista;
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al seleccionar de la BD", ex);
        }
    }

    @Override
    public Customer obtener(Integer id) throws DataAccessException {
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

    private Customer rowMapper(ResultSet rs) throws SQLException {
        Integer id = rs.getInt(1);
        String name = rs.getString(2);
        String address = rs.getString(3);
        String website = rs.getString(4);
        Double creditLimit = rs.getDouble(5);
        
        return new Customer(id, name, address, website, creditLimit);
    }
}
