package com.mycompany.pruebacarrito;

import java.util.Scanner;

public class PruebaCarrito {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        CarritoCompra c = new CarritoCompra();
        int opcion, id;
        Articulo aux;
        
        do {
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1. Guardar artículo.");
            System.out.println("2. Mostrar artículos.");
            System.out.println("3. Buscar artículo por id.");
            System.out.println("4. Calcular precio total.");
            System.out.println("0. Salir");
            
            System.out.print("\nElija opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: if (c.getCarrito()[c.getCarrito().length-1] != null) {
                            System.out.println("\nEl carrito está lleno y no se pueden guardar más artículos.");
                        } else {
                            aux = new Articulo();
                            
                            System.out.print("\nIntroduzca el id del artículo: ");
                            aux.setIdArticulo(sc.nextInt());
                            aux.setNombre(sc.nextLine()); // Borrado del buffer.
                            System.out.print("Introduzca el nombre del artículo: ");
                            aux.setNombre(sc.nextLine());
                            System.out.print("Introduzca el precio del artículo: ");
                            aux.setPrecio(sc.nextDouble());
                            
                            c.guardarArticulo(aux);
                        }
                        break;
                
                case 2: if (c.getCarrito()[0] == null) {
                            System.out.println("\nEl carrito está vacío.");
                        } else {
                            c.mostrarArticulos();
                        }
                        break;
                
                case 3: System.out.print("\nIntroduzca el id del artículo a buscar: ");
                        id = sc.nextInt();
                        aux = c.buscarArticuloPorId(id);
                        if (aux == null) {
                            System.out.println("Artículo no encontrado.");
                        } else {
                            System.out.println("Id=" + aux.getIdArticulo() + ", nombre=" +
                                               aux.getNombre() + ", precio=" + aux.getPrecio() + "€");
                        }
                        break;
                        
                case 4: System.out.println("\nEl precio total del carrito es de " + c.calcularPrecioTotalCarrito() + " euros.");
                        break;
                
                case 0: break;
                
                default: System.out.println("\nOpción incorrecta");
            }
            
        } while(opcion != 0);
    }
}
