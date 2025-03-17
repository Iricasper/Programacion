package es.tuespiral.u6.p1.conexion;
import java.sql.*;
import java.util.Scanner;

public class PruebaSqlInjection {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el nombre del cliente para ver sus datos:");
        String nombre = sc.nextLine();
        
        // Nombre válido: Exelon
        // Nombre SQL Injection: MeLoInvento' OR '1'='1
        
        
        final String SQL = "SELECT * FROM CUSTOMERS WHERE NAME = '"+nombre+"'";
        System.out.println("SQL ejecutada: "+SQL);
        
        
        try (Connection conn = DBUtils.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);) {
            
            
            
            while(rs.next()) {
                long id = rs.getLong(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                String website = rs.getString(4);
                double credit = rs.getDouble(5);
                System.out.println("Id = "+id+", name = "+name+", address = "+address+
                                   ", website = "+website+", credit = "+credit);
            }
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        }
    }
}


