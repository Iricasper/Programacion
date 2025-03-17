package es.tuespiral.u6.p1.conexion;
import java.sql.*;
public class PruebaStatementResultSet {
    public static void main(String args[]){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM CUSTOMERS WHERE customer_id <= 10");   
            
            while(rs.next()) {
                long id = rs.getLong(1);
                String name = rs.getString(2);
                double credit = rs.getDouble(5);
                System.out.println("Id = "+id+", name = "+name+", credit = "+credit);
            }
            
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
            System.out.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                
                if (st != null) {
                    st.close();
                }
                    
                DBUtils.close(conn);
            } catch(SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}


