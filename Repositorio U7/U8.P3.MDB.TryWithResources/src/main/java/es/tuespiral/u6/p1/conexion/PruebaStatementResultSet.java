package es.tuespiral.u6.p1.conexion;

import java.sql.*;

public class PruebaStatementResultSet {

    public static void main(String args[]) {
        try (Connection conn = DBUtils.getConnection(); 
             Statement st = conn.createStatement(); 
             ResultSet rs = st.executeQuery("SELECT * FROM CUSTOMERS")) {

            while (rs.next()) {
                long id = rs.getLong(1);
                String name = rs.getString(2);
                System.out.println("Id = " + id + ", name = " + name);
            }

        } catch (SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
            System.out.println(e);
        }
    }
}
