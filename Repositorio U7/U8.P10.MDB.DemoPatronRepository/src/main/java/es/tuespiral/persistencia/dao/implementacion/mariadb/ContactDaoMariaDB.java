package es.tuespiral.persistencia.dao.implementacion.mariadb;

import es.tuespiral.persistencia.dao.ContactDao;
import es.tuespiral.persistencia.dao.entidad.CustomerEntity;
import es.tuespiral.persistencia.dao.excepcion.DataAccessException;
import es.tuespiral.persistencia.dao.excepcion.NotFoundException;
import es.tuespiral.persistencia.dao.entidad.ContactEntity;
import es.tuespiral.persistencia.utilidades.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactDaoMariaDB implements ContactDao {
    private Connection conn = null;
    private final String nombreClase;
    private final String nombreTabla = "CONTACTS";
    private final String SELECT_ALL = "SELECT * FROM " + nombreTabla;
    private final String SELECT_ID = "SELECT * FROM " + nombreTabla + " WHERE CONTACT_ID = ?";
    private final String SELECT_CUSTOMER_ID = "SELECT * FROM " + nombreTabla + " WHERE CUSTOMER_ID = ?";
    private final String INSERT = "INSERT INTO " + nombreTabla + " (FIRST_NAME, LAST_NAME, EMAIL, PHONE, CUSTOMER_ID) VALUES (?, ?, ?, ?, ?)";
    private final String UPDATE = "UPDATE " + nombreTabla + " SET FIRST_NAME = ?, LAST_NAME = ?, EMAIL = ?, PHONE = ?, CUSTOMER_ID = ? WHERE CONTACT_ID = ?";
    private final String DELETE = "DELETE FROM " + nombreTabla + " WHERE CONTACT_ID = ?";

    public ContactDaoMariaDB() throws DataAccessException {
        nombreClase = this.getClass().getName();
        try {
            this.conn = DBUtils.getConnection();    
        } catch(SQLException e) {
            throw new DataAccessException(nombreClase+" falló al conectar con la BD");
        }
    }

    @Override
    public void insertar(ContactEntity obj) throws DataAccessException {
        try {
            PreparedStatement st = conn.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getFirstName());
            st.setString(2, obj.getLastName());
            st.setString(3, obj.getEmail());
            st.setString(4, obj.getPhone());
            st.setInt(5, obj.getCustomerId());
            
            int numFilas = st.executeUpdate();
            if (numFilas != 1) {
                throw new DataAccessException(nombreClase + " falló al insertar en la BD");
            }

            // Recuperamos la clave primaria generada para copiarla en el objeto
            ResultSet rs = st.getGeneratedKeys();
            if (rs != null && rs.next()) {
                obj.setContactId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al insertar en la BD", ex);
        }
    }

    @Override
    public void actualizar(ContactEntity obj) throws DataAccessException {
        try {
            PreparedStatement st = conn.prepareStatement(UPDATE);
            st.setString(1, obj.getFirstName());
            st.setString(2, obj.getLastName());
            st.setString(3, obj.getEmail());
            st.setString(4, obj.getPhone());
            st.setInt(5, obj.getCustomerId());
            st.setInt(6, obj.getContactId());
            
            int numFilas = st.executeUpdate();
            if (numFilas != 1) {
                throw new DataAccessException(nombreClase + " falló al actualizar en la BD");
            }
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al actualizar en la BD", ex);
        }
    }

    @Override
    public void eliminar(ContactEntity obj) throws DataAccessException {
        try {
            PreparedStatement st = conn.prepareStatement(DELETE);
            st.setInt(1, obj.getContactId());
            int numFilas = st.executeUpdate();
            if (numFilas != 1) {
                throw new DataAccessException(nombreClase + " falló al borrar en la BD");
            }
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al borrar en la BD", ex);
        }
    }

    @Override
    public List<ContactEntity> obtenerTodos() throws DataAccessException {
        List<ContactEntity> lista = new ArrayList<>();

        try {
            PreparedStatement st = conn.prepareStatement(SELECT_ALL);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ContactEntity contact = rowMapper(rs);
                lista.add(contact);
            }
            return lista;
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al seleccionar de la BD", ex);
        }
    }

    @Override
    public ContactEntity obtener(Integer id) throws DataAccessException {
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
    public List<ContactEntity> obtenerPorCustomerId(Integer customerId) throws DataAccessException {
        List<ContactEntity> lista = new ArrayList<>();

        try {
            PreparedStatement st = conn.prepareStatement(SELECT_CUSTOMER_ID);
            st.setInt(1, customerId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ContactEntity contact = rowMapper(rs);
                lista.add(contact);
            }
            return lista;
        } catch (SQLException ex) {
            throw new DataAccessException(nombreClase + " falló al seleccionar de la BD", ex);
        }
    }
    
    private ContactEntity rowMapper(ResultSet rs) throws SQLException {
        Integer contactId = rs.getInt(1);
        String firstName = rs.getString(2);
        String lastName = rs.getString(3);
        String email = rs.getString(4);
        String phone = rs.getString(5);
        Integer customerId = rs.getInt(6);
        
        return new ContactEntity(contactId, firstName, lastName, email, phone, customerId);
    }

    
}
