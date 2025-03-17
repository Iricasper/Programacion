package es.tuespiral.u6.p1.conexion.negocio.modelos;

import es.tuespiral.u6.p1.conexion.persistencia.entidades.Product;
import java.util.*;


public class ShoppingCart {
    private int idCliente;
    private Map<Product, Integer> cart;
    
    public ShoppingCart(int idCliente) {
        this.idCliente = idCliente;
        cart = new HashMap<>();
    }

    public void addItem(Product p) {
        if(p==null) {
            throw new NullPointerException("El producto a añadir al carro no puede ser nulo");
        }
        
        int quantity = 1;
        if(cart.containsKey(p)) {
            quantity = cart.get(p);
            quantity++;
        } 
        
        cart.put(p, quantity);
        
    }

    public boolean isEmpty() {
        return cart.isEmpty();
    }

    public double getTotalAmount() {
        double suma = 0;

        for (Product p : cart.keySet()) {
            
            suma = suma + getQuantity(p) * p.getListPrice();
        }
        return suma;
    }

    // Vacía el carrito
    public void removeAll() {
        cart.clear();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Set<Product> getProducts() {
        return cart.keySet();
    }
    
    public int getQuantity(Product p) {
        return cart.get(p);
    }

}
