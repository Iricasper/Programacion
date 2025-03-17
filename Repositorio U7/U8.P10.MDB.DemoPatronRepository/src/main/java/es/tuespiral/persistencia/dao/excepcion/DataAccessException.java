package es.tuespiral.persistencia.dao.excepcion;

public class DataAccessException extends Exception {

    public DataAccessException() {
    }

    public DataAccessException(String msg) {
        super(msg);
    }

    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataAccessException(Throwable cause) {
        super(cause);
    }
    
    
}
