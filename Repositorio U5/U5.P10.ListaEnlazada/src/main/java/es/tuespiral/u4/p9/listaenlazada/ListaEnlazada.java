package es.tuespiral.u4.p9.listaenlazada;

public class ListaEnlazada <T> {
    private NodoListaEnlazada primerNodo, nodoActual, ultimoNodo;
    private int numElem;
    
    public void add(T elem) {
        NodoListaEnlazada nodo = new NodoListaEnlazada(elem);
        
        if (isEmpty()) 
            primerNodo = nodo;
        else 
            ultimoNodo.setNodoSiguiente(nodo);
        
        ultimoNodo = nodo;
        numElem++;
    }
    
    public int size() {
        return numElem;
    }
    
    public boolean isEmpty() {
        return primerNodo == null && ultimoNodo == null;
    }
        
    public T getFirst() {
        nodoActual = primerNodo;
        return (T) primerNodo.getDato();
    }
    
    public boolean hasNext() {
        if (nodoActual == null)
            return false;
        else {
            nodoActual = nodoActual.getNodoSiguiente();
            return nodoActual != null;
        }
    }
    
    public T getNext() {
        return (T) nodoActual.getDato();
    }
    
}
