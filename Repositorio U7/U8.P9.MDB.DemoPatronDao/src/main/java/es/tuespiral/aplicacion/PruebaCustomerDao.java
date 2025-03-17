package es.tuespiral.aplicacion;

import es.tuespiral.persistencia.dao.implementacion.mariadb.CustomerDaoMariaDB;
import es.tuespiral.persistencia.dao.CustomerDao;
import es.tuespiral.persistencia.entidad.Customer;
import es.tuespiral.persistencia.dao.excepcion.DataAccessException;
import java.util.List;
import java.util.Scanner;

public class PruebaCustomerDao {

    public static void main(String args[]) throws DataAccessException{
        Scanner sc = new Scanner(System.in);
        int opcion;
        CustomerDao dao = new CustomerDaoMariaDB();

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
                    consultarTodos(dao);
                    break;
                case 2:
                    consultarPorId(dao);
                    break;
                case 3:
                    crearNuevo(dao);
                    break;
                case 4:
                    actualizar(dao);
                    break;
                case 5:
                    eliminar(dao);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (opcion != 0);
    }

    private static void eliminar(CustomerDao dao) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID del cliente a eliminar");
        Integer idElimina = sc.nextInt();
        sc.nextLine(); // Vaciamos el buffer
        
        try {
            Customer cliente = dao.obtener(idElimina);
            System.out.println("El cliente a eliminar es: "+cliente.getName());
            System.out.println("Estás seguro (S = Sí / N = No)");
            String respuesta = sc.nextLine();
            
            if (respuesta.equalsIgnoreCase("S") ||
                    respuesta.equalsIgnoreCase("Sí") ||
                    respuesta.equalsIgnoreCase("Si")) {
                dao.eliminar(cliente);
                System.out.println("El cliente se eliminó correctamente");
            }
        } catch(DataAccessException e) {
            System.out.println("Cliente inexistente");
        }
    }

    private static void actualizar(CustomerDao dao) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID del cliente a actualizar");
        Integer idActualiza = sc.nextInt();
        sc.nextLine(); // Vaciamos el buffer
        
        try {
            Customer cliente = dao.obtener(idActualiza);
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
            
            dao.actualizar(cliente);
            System.out.println("El cliente se actualizó correctamente");
        } catch(DataAccessException e) {
            System.out.println("Cliente inexistente");
        }
    }

    private static void crearNuevo(CustomerDao dao) throws DataAccessException {
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
        dao.insertar(nuevoCliente);
        System.out.println("El cliente se creó correctamente");
    }

    private static void consultarPorId(CustomerDao dao) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID del cliente");
        int id = sc.nextInt();
        try {
            Customer resultado = dao.obtener(id);
            System.out.println(resultado);
        } catch(DataAccessException e) {
            System.out.println("Cliente inexistente");
        }
    }

    private static void consultarTodos(CustomerDao dao) throws DataAccessException {
        List<Customer> lista = dao.obtenerTodos();
        for(Customer cli : lista) {
            System.out.println(cli);
        }
    }

}
