package es.tuespiral.u6.p1.conexion.dominio;

import es.tuespiral.u6.p1.conexion.utilidades.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Order {

    private Integer orderId;
    private Integer customerId;
    private String status;
    private Integer salesmanId;
    private LocalDate orderDate;

    public Order(Integer orderId, Integer customerId, String status, Integer salesmanId, LocalDate orderDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.status = status;
        this.salesmanId = salesmanId;
        this.orderDate = orderDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(Integer salesmanId) {
        this.salesmanId = salesmanId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void persist(Connection conn) throws SQLException {
        String INSERT_ORDERS = "INSERT INTO ORDERS (customer_id, status, order_date) VALUES (?, ?, ?)";
        
        PreparedStatement st = conn.prepareStatement(INSERT_ORDERS, PreparedStatement.RETURN_GENERATED_KEYS);
        st.setInt(1, customerId);
        st.setString(2, status);
        java.sql.Date fecha = DBUtils.toSqlDate(orderDate);
        st.setDate(3, fecha);

        int numFilas = st.executeUpdate();
        if (numFilas != 1) {
            throw new SQLException("Falló al insertar el pedido");
        }
        // Recuperamos la PK que se ha generado tras el INSERT en ORDERS
        ResultSet rs = st.getGeneratedKeys();
        if (rs != null && rs.next()) {
            this.orderId = rs.getInt(1);
        }
    }
    
}
