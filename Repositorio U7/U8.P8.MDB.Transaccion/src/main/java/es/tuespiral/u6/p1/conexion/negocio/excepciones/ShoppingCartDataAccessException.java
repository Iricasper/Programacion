package es.tuespiral.u6.p1.conexion.negocio.excepciones;


/**
 *
 * @author Kike
 */
public class ShoppingCartDataAccessException extends Exception {

    /**
     * Creates a new instance of <code>ShoppingCartDataAccessException</code>
     * without detail message.
     */
    public ShoppingCartDataAccessException() {
    }

    /**
     * Constructs an instance of <code>ShoppingCartDataAccessException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ShoppingCartDataAccessException(String msg) {
        super(msg);
    }
}
