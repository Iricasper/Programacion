package es.tuespiral.u4.p9.listaenlazada;

public class PruebaListaEnlazada {
    public static void main(String[] args) {
        ListaEnlazada<String> lista = new ListaEnlazada<>();
        lista.add("Hola");
        lista.add("Adios");
        lista.add("Hola otra vez");
        lista.add("Adios otra vez");
        
        System.out.println("Número de elementos: "+lista.size());
        
        System.out.println("Primer elemento: "+lista.getFirst());
        
        while(lista.hasNext()) {
            System.out.println(lista.getNext());
        }
    }
}
