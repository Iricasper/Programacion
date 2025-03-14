package es.tuespiral.u4.p8.cajagenerica;

public class CajaGenerica <T> {
    private T contenido;
    
    public void guarda(T objeto) {
        contenido = objeto;
    }
    
    public T saca() {
        T auxiliar = contenido;
        contenido = null;
        return auxiliar;
    }

    public boolean isVacia() {
        return contenido == null;
    }
}
