package es.tuespiral.u6.p1.conexion;
import java.sql.*;
public class PruebaStatementExecuteUpdate {
    public static void main(String args[]){
        Connection conn = null;
        Statement st = null;

        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            int numFilas = st.executeUpdate("INSERT INTO CUSTOMERS "
                    + "(name, address, website, credit_limit) "
                    + "VALUES ('PepePhone', 'Avda. Pepe Phone S/N', null, 4000)");   
            
            System.out.println("Se han insertado "+numFilas+" filas");
            
            numFilas = st.executeUpdate("DELETE FROM CUSTOMERS "
                                        + "WHERE NAME = 'PepePhone'"); 
            System.out.println("Se han eliminado "+numFilas+" filas");
            
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        } finally {
            try {  
                DBUtils.close(st);  
                DBUtils.close(conn);
            } catch(SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}


