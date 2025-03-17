
package es.tuespiral.u6.p1.conexion.persistencia.dao.excepciones;

public class TransactionException extends DataAccessException {

    public TransactionException() {
    }

    public TransactionException(String msg) {
        super(msg);
    }

    public TransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransactionException(Throwable cause) {
        super(cause);
    }
    
    
}
