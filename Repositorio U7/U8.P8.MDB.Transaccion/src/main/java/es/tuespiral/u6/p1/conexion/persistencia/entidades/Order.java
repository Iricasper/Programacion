package es.tuespiral.u6.p1.conexion.persistencia.entidades;

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

    
    
}
