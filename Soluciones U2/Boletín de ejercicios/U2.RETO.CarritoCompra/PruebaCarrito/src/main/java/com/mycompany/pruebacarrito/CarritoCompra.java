package com.mycompany.pruebacarrito;

public class CarritoCompra {
    public Articulo[] carrito = new Articulo[10];

    public Articulo[] getCarrito() {
        return carrito;
    }
    
    public void guardarArticulo (Articulo a) {
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] == null) {
                carrito[i] = a;
                System.out.println("Artículo guardado.");
                break;
            }
        }
    }
    
    public void mostrarArticulos() {
        System.out.println("\nLISTADO DE ARTÍCULOS:");
        
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] != null) {
                System.out.println("Id=" + carrito[i].getIdArticulo() + ", nombre=" +
                                   carrito[i].getNombre() + ", precio=" + carrito[i].getPrecio() + "€");
            } else {
                break;
            }
        }
    }
    
    public Articulo buscarArticuloPorId (int id) {
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] != null && carrito[i].getIdArticulo() == id) {
                return carrito[i];
            }
        }
        return null;
    }
    
    public double calcularPrecioTotalCarrito() {
        double total = 0;
        
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] != null) {
                total += carrito[i].getPrecio();
            } else {
                break;
            }
        }
        return total;
    }
}
