package es.tuespiral.persistencia.dao;

import es.tuespiral.persistencia.dao.excepcion.DataAccessException;
import es.tuespiral.persistencia.dao.entidad.OrderEntity;
import java.util.List;


public interface OrderDao extends Dao<OrderEntity, Integer> {
    List<OrderEntity> obtenerPorCustomerId(Integer customerId) throws DataAccessException;
}

