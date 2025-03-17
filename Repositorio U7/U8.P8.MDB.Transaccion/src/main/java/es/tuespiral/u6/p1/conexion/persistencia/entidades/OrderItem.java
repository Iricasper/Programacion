package es.tuespiral.u6.p1.conexion.persistencia.entidades;


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

    

}
