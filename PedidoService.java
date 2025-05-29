public class PedidoService {
    public void crearPedido(String cliente, String producto, int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida para el pedido.");
            return;
        }

        System.out.println("Pedido creado para: " + cliente + " - Producto: " + producto + " - Cantidad: " + cantidad);
    }
}