public class ClienteService {
    public void registrarCliente(String nombre, String email) {
        if (nombre == null || email == null) {
            System.out.println("Nombre o email no pueden ser nulos");
            return;
        }
        System.out.println("Cliente registrado: " + nombre + " - " + email);
    }

    public void eliminarCliente(String id) {
        // Método aún no implementado
    }
}