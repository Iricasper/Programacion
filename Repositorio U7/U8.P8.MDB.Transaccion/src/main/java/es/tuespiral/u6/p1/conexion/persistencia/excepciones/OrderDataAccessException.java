package es.tuespiral.u6.p1.conexion.persistencia.excepciones;

/**
 *
 * @author Kike
 */
public class OrderDataAccessException extends DataAccessException {

    /**
     * Creates a new instance of <code>OrderDataAccessException</code> without
     * detail message.
     */
    public OrderDataAccessException() {
    }

    /**
     * Constructs an instance of <code>OrderDataAccessException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public OrderDataAccessException(String msg) {
        super(msg);
    }
}
