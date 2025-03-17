package es.tuespiral.u6.p1.conexion.persistencia.excepciones;

/**
 *
 * @author Kike
 */
public class ProductDataAccessException extends DataAccessException {

    /**
     * Creates a new instance of <code>ProductDataAccessException</code> without
     * detail message.
     */
    public ProductDataAccessException() {
    }

    /**
     * Constructs an instance of <code>ProductDataAccessException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ProductDataAccessException(String msg) {
        super(msg);
    }
}
