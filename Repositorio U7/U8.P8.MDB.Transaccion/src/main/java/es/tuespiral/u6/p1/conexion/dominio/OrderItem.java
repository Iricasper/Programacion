package es.tuespiral.u6.p1.conexion.dominio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class OrderItem {

    private Integer orderId;
    private Integer itemId;
    private Integer productId;
    private Integer quantity;
    private Double unitPrice;

    public OrderItem(Integer orderId, Integer itemId, Integer productId, Integer quantity, Double unitPrice) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void persist(Connection conn) throws SQLException {
        String INSERT_ORDER_ITEMS = "INSERT INTO ORDER_ITEMS (order_id, item_id, product_id, quantity, unit_price) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement st = conn.prepareStatement(INSERT_ORDER_ITEMS);
        st.setInt(1, orderId);
        st.setInt(2, itemId);
        st.setInt(3, productId);
        st.setInt(4, quantity);
        st.setDouble(5, unitPrice);
        int numFilas = st.executeUpdate();
        if (numFilas != 1) {
            throw new SQLException("Falló al insertar un item del pedido");
        }
    }

}
