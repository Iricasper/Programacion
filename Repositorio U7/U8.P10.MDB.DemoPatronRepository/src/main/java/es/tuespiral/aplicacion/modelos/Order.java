package es.tuespiral.aplicacion.modelos;

import java.time.LocalDate;

public class Order {
    private Integer orderId;
    private Customer customer;
    private String status;
    // Debería ser: private SalesMan salesman
    // pero lo dejamos así por simplificar
    private Integer salesmanId;
    private LocalDate orderDate;

    public Order(Integer orderId, Customer customer, String status, Integer salesmanId, LocalDate orderDate) {
        this.orderId = orderId;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", status=" + status + ", salesmanId=" + salesmanId + ", orderDate=" + orderDate + '}';
    }


}
