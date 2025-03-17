package es.tuespiral.aplicacion;

import es.tuespiral.aplicacion.modelos.Customer;
import es.tuespiral.persistencia.dao.CustomerDao;
import es.tuespiral.persistencia.dao.entidad.CustomerEntity;
import es.tuespiral.persistencia.dao.excepcion.DataAccessException;
import es.tuespiral.persistencia.repository.CustomerRepository;
import es.tuespiral.persistencia.repository.implementacion.CustomerRepositoryMariaDB;
import java.util.List;
import java.util.Scanner;

public class PruebaCustomerRepository {

    public static void main(String args[]) throws DataAccessException{
        Scanner sc = new Scanner(System.in);
        int opcion;
        CustomerRepository customerRepo = new CustomerRepositoryMariaDB();

        do {
            System.out.println("\nMENU CLIENTES");
            System.out.println("0 - Salir");
            System.out.println("1 - Consultar todos");
            System.out.println("2 - Consultar por ID");
            System.out.println("3 - Crear un nuevo cliente");
            System.out.println("4 - Actualizar un cliente existente");
            System.out.println("5 - Eliminar un cliente");
            System.out.println("Elige una opción:");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 0:
                    System.out.println("Adios...");
                    break;
                case 1:
                    consultarTodos(customerRepo);
                    break;
                case 2:
                    consultarPorId(customerRepo);
                    break;
                case 3:
                    crearNuevo(customerRepo);
                    break;
                case 4:
                    actualizar(customerRepo);
                    break;
                case 5:
                    eliminar(customerRepo);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (opcion != 0);
    }

    private static void eliminar(CustomerRepository repo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID del cliente a eliminar");
        Integer idElimina = sc.nextInt();
        sc.nextLine(); // Vaciamos el buffer
        
        try {
            Customer cliente = repo.get(idElimina);
            System.out.println("El cliente a eliminar es: "+cliente.getName());
            System.out.println("Estás seguro (S = Sí / N = No)");
            String respuesta = sc.nextLine();
            
            if (respuesta.equalsIgnoreCase("S") ||
                    respuesta.equalsIgnoreCase("Sí") ||
                    respuesta.equalsIgnoreCase("Si")) {
                repo.remove(cliente);
                System.out.println("El cliente se eliminó correctamente");
            }
        } catch(DataAccessException e) {
            System.out.println("Cliente inexistente");
        }
    }

    private static void actualizar(CustomerRepository repo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID del cliente a actualizar");
        Integer idActualiza = sc.nextInt();
        sc.nextLine(); // Vaciamos el buffer
        
        try {
            Customer cliente = repo.get(idActualiza);
            System.out.println("El nombre actual del cliente es: "+cliente.getName());
            System.out.println("Dime el nuevo nombre del cliente (pulsa INTRO para dejarlo igual)");
            String nuevoNombre = sc.nextLine();
            if (!nuevoNombre.isBlank()) {
                cliente.setName(nuevoNombre);
            }
            System.out.println("La dirección actual del cliente es: "+cliente.getAddress());
            System.out.println("Dime la nueva dirección (pulsa INTRO para dejarlo igual)");
            String nuevaDireccion = sc.nextLine();
            if (!nuevaDireccion.isBlank()) {
                cliente.setAddress(nuevaDireccion);
            }
            
            System.out.println("El website actual del cliente es: "+cliente.getWebsite());
            System.out.println("Dime el nuevo website (pulsa INTRO para dejarlo igual)");
            String nuevoWebsite = sc.nextLine();
            if (!nuevoWebsite.isBlank()) {
                cliente.setWebsite(nuevoWebsite);
            }
            
            System.out.println("El límite de crédito actual del cliente es: "+cliente.getCreditLimit());
            System.out.println("Dime el nuevo límite de crédito (pulsa INTRO para dejarlo igual)");
            String nuevoCredito = sc.nextLine();
            if (!nuevoWebsite.isBlank()) {
                Double credito = Double.valueOf(nuevoCredito);
                cliente.setCreditLimit(credito);
            }
            
            repo.update(cliente);
            System.out.println("El cliente se actualizó correctamente");
        } catch(DataAccessException e) {
            System.out.println("Categoría inexistente");
        }
    }

    private static void crearNuevo(CustomerRepository repo) throws DataAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del nuevo cliente");
        String nombre = sc.nextLine();
        System.out.println("Dime su dirección");
        String direccion = sc.nextLine();
        System.out.println("Dime su website");
        String website = sc.nextLine();
        System.out.println("Dime su límite de crédito");
        Double limiteCredito = sc.nextDouble();
        Customer nuevoCliente = new Customer(null, nombre, direccion, website, limiteCredito);
        repo.add(nuevoCliente);
        System.out.println("El cliente se creó correctamente");
    }

    private static void consultarPorId(CustomerRepository repo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID del cliente");
        int id = sc.nextInt();
        try {
            Customer resultado = repo.get(id);
            System.out.println(resultado);
        } catch(DataAccessException e) {
            System.out.println("Cliente inexistente");
        }
    }

    private static void consultarTodos(CustomerRepository repo) throws DataAccessException {
        List<Customer> lista = repo.getAll();
        for(Customer cli : lista) {
            System.out.println(cli);
        }
    }

}
