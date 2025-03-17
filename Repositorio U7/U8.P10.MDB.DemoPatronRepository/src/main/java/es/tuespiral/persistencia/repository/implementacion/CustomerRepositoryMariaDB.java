package es.tuespiral.persistencia.repository.implementacion;

import es.tuespiral.aplicacion.modelos.Contact;
import es.tuespiral.aplicacion.modelos.Customer;
import es.tuespiral.aplicacion.modelos.Order;
import es.tuespiral.persistencia.dao.ContactDao;
import es.tuespiral.persistencia.dao.CustomerDao;
import es.tuespiral.persistencia.dao.OrderDao;
import es.tuespiral.persistencia.dao.entidad.ContactEntity;
import es.tuespiral.persistencia.dao.entidad.CustomerEntity;
import es.tuespiral.persistencia.dao.entidad.OrderEntity;
import es.tuespiral.persistencia.dao.excepcion.DataAccessException;
import es.tuespiral.persistencia.dao.implementacion.mariadb.ContactDaoMariaDB;
import es.tuespiral.persistencia.dao.implementacion.mariadb.CustomerDaoMariaDB;
import es.tuespiral.persistencia.dao.implementacion.mariadb.OrderDaoMariaDB;
import es.tuespiral.persistencia.repository.CustomerRepository;
import java.util.ArrayList;
import java.util.List;


public class CustomerRepositoryMariaDB implements CustomerRepository {
    private CustomerDao customerDao;
    private ContactDao contactDao;
    private OrderDao orderDao;
           
    public CustomerRepositoryMariaDB() throws DataAccessException {
        customerDao = new CustomerDaoMariaDB();
        orderDao = new OrderDaoMariaDB();
        contactDao = new ContactDaoMariaDB();
    }
    
    @Override
    public void add(Customer obj) throws DataAccessException {
        if(obj == null)
            throw new NullPointerException();
        
        CustomerEntity customerEntity = convertToEntity(obj);
        customerDao.insertar(customerEntity);
        obj.setCustomerId(customerEntity.getCustomerId());
        
        for(Contact c : obj.getContacts()) {
            ContactEntity contactEntity = convertToEntity(c);
            contactDao.insertar(contactEntity);
            c.setContactId(contactEntity.getContactId());
        }
        
        for(Order o : obj.getOrders()) {
            OrderEntity orderEntity = convertToEntity(o);
            orderDao.insertar(orderEntity);
            o.setOrderId(orderEntity.getOrderId());
        }
    }

    @Override
    public void update(Customer obj) throws DataAccessException {
        if(obj == null)
            throw new NullPointerException();
        if(obj.getCustomerId() == null)
            throw new NullPointerException("El customerId no puede ser nulo para hacer un update");
        
        CustomerEntity customerEntity = convertToEntity(obj);
        customerDao.actualizar(customerEntity);
        
        // Actualizamos en cascada sus contactos
        for(Contact c : obj.getContacts()) {
            ContactEntity contactEntity = convertToEntity(c);
            contactDao.actualizar(contactEntity);
        }
        
        // Actualizamos en cascada sus pedidos
        for(Order o : obj.getOrders()) {
            OrderEntity orderEntity = convertToEntity(o);
            orderDao.actualizar(orderEntity);
        }
    }

    @Override
    public void remove(Customer obj) throws DataAccessException {
        if(obj == null)
            throw new NullPointerException();
        
        // Si tiene pedidos (orders) o contactos asociados
        // no permitimos el borrado y lanzamos una excepción
        if (obj.getOrders().isEmpty() && obj.getContacts().isEmpty()) {
            CustomerEntity customerEntity = convertToEntity(obj);
            customerDao.eliminar(customerEntity);
        } else {
            throw new DataAccessException("No se puede borrar porque hay pedidos o contactos asociados");
        }
    }

    @Override
    public Customer get(Integer id) throws DataAccessException{
        if(id == null)
            throw new NullPointerException();
        
        CustomerEntity customerEntity = customerDao.obtener(id);
        Customer customer = convertToModel(customerEntity);
        
        for(OrderEntity orderEntity : orderDao.obtenerPorCustomerId(id)) {
            Order order = convertToModel(orderEntity);
            order.setCustomer(customer);
            customer.getOrders().add(order);
        }
        
        for(ContactEntity contactEntity : contactDao.obtenerPorCustomerId(id)) {
            Contact contact = convertToModel(contactEntity);
            contact.setCustomer(customer);
            customer.getContacts().add(contact);
        }
        return customer;
    }

    @Override
    public List<Customer> getAll() throws DataAccessException{
        List<Customer> lista = new ArrayList<>();
        for (CustomerEntity ent : customerDao.obtenerTodos()) {
            Customer c = get(ent.getCustomerId());
            lista.add(c);
        }
        return lista;
    }
    
    
    private ContactEntity convertToEntity(Contact c) {
        return new ContactEntity(c.getContactId(), c.getFirstName(), c.getLastName(), c.getEmail(), c.getPhone(), c.getCustomer().getCustomerId());
    }
 
    private OrderEntity convertToEntity(Order o) {
        return new OrderEntity(o.getOrderId(), o.getCustomer().getCustomerId(), "Pending", null, o.getOrderDate());
    }
    
    private CustomerEntity convertToEntity(Customer obj) {
        return new CustomerEntity(obj.getCustomerId(), obj.getName(), obj.getAddress(), obj.getWebsite(), obj.getCreditLimit());
    }

    private Customer convertToModel(CustomerEntity ent) {
        return new Customer(ent.getCustomerId(), ent.getName(), ent.getAddress(), ent.getWebsite(), ent.getCreditLimit());
    }

    private Order convertToModel(OrderEntity ent) {
        return new Order(ent.getOrderId(), null, ent.getStatus(), null, ent.getOrderDate() );
    }

    private Contact convertToModel(ContactEntity ent) {
        return new Contact(ent.getContactId(), ent.getFirstName(), ent.getLastName(), ent.getEmail(), ent.getPhone(), null);
    }
    
}
