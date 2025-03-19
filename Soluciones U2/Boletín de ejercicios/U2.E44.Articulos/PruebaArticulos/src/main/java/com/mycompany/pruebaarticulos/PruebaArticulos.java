package com.mycompany.pruebaarticulos;

import java.util.Scanner;


public class PruebaArticulos {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Articulo [] lista = new Articulo[5];
        int id;
        int pos = -1;
        
        lista[0] = new Articulo();
        lista[1] = new Articulo();
        lista[2] = new Articulo();
        lista[3] = new Articulo();
        lista[4] = new Articulo();
        
        lista[0].setIdArticulo(1);
        lista[1].setIdArticulo(2);
        lista[2].setIdArticulo(3);
        lista[3].setIdArticulo(4);
        lista[4].setIdArticulo(5);
        
        lista[0].setNombre("Arroz");
        lista[1].setNombre("Garbanzos");
        lista[2].setNombre("Macarrones");
        lista[3].setNombre("Tomate");
        lista[4].setNombre("Yogurt");
        
        lista[0].setPrecio(1.2);
        lista[1].setPrecio(0.85);
        lista[2].setPrecio(0.75);
        lista[3].setPrecio(1.75);
        lista[4].setPrecio(2.15);
        
        System.out.print("Introduzca un identificador de artículo: ");
        id = sc.nextInt();
        
        for (int i = 0; i < lista.length; i++) {
            if (id == lista[i].getIdArticulo()) {
                pos = i;
                break;
            }
        }
        
        if (pos == -1) {
            System.out.println("Artículo no encontrado");
        } else {
            System.out.println("Nombre: " + lista[pos].getNombre() + " - Precio: " + lista[pos].getPrecio());
        }
        
        System.out.println("\nLISTA DE ARTÍCULOS");
        for (int j = 0; j < lista.length; j++) {
            System.out.println("Posicion " + (j+1) + ": idArticulo = " + lista[j].getIdArticulo() +
                               ", nombre = " + lista[j].getNombre() + ", precio = " + lista[j].getPrecio());
        }
    }
}
