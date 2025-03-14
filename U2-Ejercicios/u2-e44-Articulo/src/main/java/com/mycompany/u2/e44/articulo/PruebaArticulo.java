package com.mycompany.u2.e44.articulo;

import java.util.Scanner;

public class PruebaArticulo {

    public static void main(String[] args) {
        Articulo[] array = new Articulo[5];

        //Creamos los objetos
        for (int i = 0; i < array.length; i++) {
            array[i] = new Articulo();
        }

        //Les damos los valores que queramos
        array[0].setIdArticulo(0);
        array[0].setNombre("Chocolate");
        array[0].setPrecio(2.2);

        array[1].setIdArticulo(1);
        array[1].setNombre("Albaricoque");
        array[1].setPrecio(0.5);

        array[2].setIdArticulo(2);
        array[2].setNombre("UNO");
        array[2].setPrecio(1);

        array[3].setIdArticulo(3);
        array[3].setNombre("DOS");
        array[3].setPrecio(2.22);

        array[4].setIdArticulo(4);
        array[4].setNombre("Cinquillo");
        array[4].setPrecio(5);

        Scanner sc = new Scanner(System.in);
        int id;
        int pos = -1;

        System.out.print("Introduce el codigo del articulo que buscas: ");
        id = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (id == array[i].getIdArticulo()) {
                System.out.println("ID: " + array[i].getIdArticulo()
                        + ". Nombre: " + array[i].getNombre() + ". Precio: "
                        + array[i].getPrecio() + " euros");
                pos = i;
            }
        }
        if (pos==-1) {
            System.out.println("Articulo no encontrado");
        }
        for (Articulo elem : array) {
            System.out.println("Posicion " + (elem.getIdArticulo()+1) + ": ID: "
                    + elem.getIdArticulo() + ". Nombre: " + elem.getNombre() +
                    ". Precio: " + elem.getPrecio() + " euros");
        }
    }
}