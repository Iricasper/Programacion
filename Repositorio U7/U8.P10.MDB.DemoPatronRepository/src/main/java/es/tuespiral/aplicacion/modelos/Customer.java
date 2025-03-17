package es.tuespiral.aplicacion.modelos;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Integer customerId;
    private String name, address, website;
    private Double creditLimit;
    private List<Order> orders;
    private List<Contact> contacts;

    public Customer(Integer customerId, String name, String address, String website, Double creditLimit) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.website = website;
        this.creditLimit = creditLimit;
        this.orders = new ArrayList<>();
        this.contacts = new ArrayList<>();
    }
    
    public Customer(Integer customerId, String name, String address, String website, Double creditLimit, List<Order> orders, List<Contact> contacts) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.website = website;
        this.creditLimit = creditLimit;
        this.orders = orders;
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", name=" + name + ", address=" + address + ", website=" + website + ", creditLimit=" + creditLimit + ", \norders=" + orders + ", \ncontacts=" + contacts + '}';
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    
    
}
