package es.tuespiral.u4.p9.listaenlazada;

class NodoListaEnlazada <T> {
    private T dato;
    private NodoListaEnlazada nodoSiguiente;
    
    public NodoListaEnlazada(T elem) {
        dato = elem;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoListaEnlazada getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(NodoListaEnlazada nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
}
