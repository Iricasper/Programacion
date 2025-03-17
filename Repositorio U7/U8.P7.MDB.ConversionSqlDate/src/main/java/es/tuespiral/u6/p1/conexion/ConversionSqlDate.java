package es.tuespiral.u6.p1.conexion;

import java.sql.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConversionSqlDate {

    public static void main(String args[]) throws ParseException {
        Scanner sc = new Scanner(System.in);

        // RECOPILAMOS LOS DATOS
        System.out.println("ALTA DE NUEVO PEDIDO");
        System.out.println("Dime el ID del cliente que realiza el pedido:");
        int idCliente = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime el fecha del pedido (formato dd-mm-aaaa):");
        String fecha = sc.nextLine();

        // Opción a) Con LocalDate. RECOMENDADA.
        DateTimeFormatter localDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        java.time.LocalDate localDate = LocalDate.parse(fecha, localDateFormat);
        java.sql.Date sqlDate = DBUtils.toSqlDate(localDate);

        // Opción b) Con java.util.Date. DESACONSEJADA.
//            SimpleDateFormat utilDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ROOT);
//            java.util.Date utilDate = utilDateFormat.parse(fecha);
//            java.sql.Date sqlDate = DBUtils.toSqlDate(utilDate);
        // LOS SALVAMOS EN EL BD
        try (Connection conn = DBUtils.getConnection(); PreparedStatement st = conn.prepareStatement("INSERT INTO ORDERS (customer_id, "
                + "status, order_date) VALUES (?, ?, ?)");) {

            st.setInt(1, idCliente);
            st.setString(2, "Pending");
            st.setDate(3, sqlDate);
            int numFilas = st.executeUpdate();
            System.out.println(numFilas + " filas insertadas");
        } catch (SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        }

        try (Connection conn = DBUtils.getConnection(); 
             PreparedStatement st = conn.prepareStatement("SELECT order_id, status, order_date "
                + "FROM ORDERS WHERE CUSTOMER_ID =?");) {
            System.out.println("\nLos pedidos del cliente con ID = " + idCliente + " son:");

            st.setInt(1, idCliente);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int orderId = rs.getInt(1);
                String status = rs.getString(2);
                java.sql.Date sDate = rs.getDate(3);

                // Opción a) Con LocalDate. RECOMENDADA.
                LocalDate orderDate = DBUtils.toLocalDate(sDate);

                // Opción b) Con java.util.Date. DESACONSEJADA.
//                java.util.Date orderDate = DBUtils.toUtilDate(sDate);
                System.out.println("Order id = " + orderId + ", Status = " + status
                        + ", Order date = " + orderDate);
            }
        } catch (SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        }
    }
}
