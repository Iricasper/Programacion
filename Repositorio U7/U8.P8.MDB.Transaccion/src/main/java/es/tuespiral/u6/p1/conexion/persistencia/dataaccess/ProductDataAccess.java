package es.tuespiral.u6.p1.conexion.persistencia.dataaccess;

import es.tuespiral.u6.p1.conexion.persistencia.entidades.Product;
import es.tuespiral.u6.p1.conexion.persistencia.excepciones.ProductDataAccessException;
import es.tuespiral.u6.p1.conexion.persistencia.utilidades.DBUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDataAccess {
    public static Product selectById(int idProduct) throws ProductDataAccessException {
        final String SQL = "SELECT * FROM PRODUCTS WHERE PRODUCT_ID = "+idProduct;
        
        try (Connection conn = DBUtils.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(SQL)) {
            
            if(rs.next()){
                return new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5), rs.getInt(6));
            }
            
        } catch(SQLException e) {
            System.out.println(e);
            throw new ProductDataAccessException("Ocurrió un error al acceder a los datos del producto");
        }
        return null;
    }
}
