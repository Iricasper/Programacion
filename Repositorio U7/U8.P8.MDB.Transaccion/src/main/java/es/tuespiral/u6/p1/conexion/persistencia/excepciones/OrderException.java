package es.tuespiral.u6.p1.conexion.persistencia.excepciones;

public class OrderException extends DataAccessException {

    public OrderException() {
    }

    public OrderException(String msg) {
        super(msg);
    }
}
