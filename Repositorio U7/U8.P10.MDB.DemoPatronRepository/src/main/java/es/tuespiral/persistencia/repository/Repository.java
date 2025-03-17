package es.tuespiral.persistencia.repository;

import es.tuespiral.persistencia.dao.excepcion.DataAccessException;
import java.util.List;

public interface Repository <T, K> {
    public void add(T obj) throws DataAccessException;
    public void update(T obj) throws DataAccessException;
    public void remove(T obj) throws DataAccessException;
    public T get(K id) throws DataAccessException;
    public List<T> getAll() throws DataAccessException;
}
