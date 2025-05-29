public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de gestión del restaurante...");

        ClienteService clienteService = new ClienteService();
        clienteService.registrarCliente("Carlos", "carlos@mail.com");

        PedidoService pedidoService = new PedidoService();
        pedidoService.crearPedido("Carlos", "Pizza Margarita", 2);

        InventarioService inventarioService = new InventarioService();
        inventarioService.actualizarInventario("Pizza Margarita", -2);

        String estado = null;
        if (estado.equals("abierto")) { // Esto causará un posible NullPointerException
            System.out.println("El restaurante está abierto");
        }
    }
}