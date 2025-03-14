package com.mycompany.pruebafunda;

public class PruebaFunda {

    public static void main(String[] args) {
        Funda <Smartphone> f1 = new Funda<>();
        Funda <Tablet> f2 = new Funda<>();
        
        f1.guarda(new Smartphone("Samsung", "Galaxy 8", 6));
        f2.guarda(new Tablet("Huawei", "P10", 10));
        
        System.out.println("Sacamos de la funda 1 el siguiente objeto: ");
        System.out.println(f1.saca().toString());
        
        if (f1.isVacia()) {
            System.out.println("La funda 1 está vacía.");
        } else {
            System.out.println("La funda 1 tiene un objeto dentro.");;
        }
        
        if (f2.isVacia()) {
            System.out.println("La funda 2 está vacía.");
        } else {
            System.out.println("La funda 2 tiene un objeto dentro.");;
        }
    }
}
