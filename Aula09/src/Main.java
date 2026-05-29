public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("João Silva", "123.456.789-00");

        Pedido pedido = new Pedido(1001, 250.90, cliente);

        pedido.infoPedido();
    }
}