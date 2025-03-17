package es.tuespiral.persistencia.dao;

import es.tuespiral.persistencia.dao.excepcion.DataAccessException;
import es.tuespiral.persistencia.dao.entidad.ContactEntity;
import java.util.List;

public interface ContactDao extends Dao<ContactEntity, Integer>{
    List<ContactEntity> obtenerPorCustomerId(Integer customerId) throws DataAccessException;
}
