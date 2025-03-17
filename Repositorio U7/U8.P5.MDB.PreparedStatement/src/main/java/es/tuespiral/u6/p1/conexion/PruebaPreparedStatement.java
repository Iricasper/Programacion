package es.tuespiral.u6.p1.conexion;

import java.sql.*;
import java.util.Scanner;

public class PruebaPreparedStatement {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Nombre válido: Exelon
        // Nombre SQL Injection: MeLoInvento' OR '1'='1
        System.out.println("Dime el nombre del cliente para ver sus datos:");
        String nombre = sc.nextLine();

        try (Connection conn = DBUtils.getConnection(); 
             PreparedStatement st = conn.prepareStatement("SELECT * FROM CUSTOMERS WHERE NAME = ?");) {

            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();

            int numRows = 0;
            while (rs.next()) {
                long id = rs.getLong(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                String website = rs.getString(4);
                double credit = rs.getDouble(5);
                System.out.println("Id = " + id + ", name = " + name + ", address = " + address
                        + ", website = " + website + ", credit = " + credit);
                numRows++;
            }

            if (numRows == 0) {
                System.out.println("No se encuentra al cliente " + nombre);
            }

        } catch (SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        }
    }
}
