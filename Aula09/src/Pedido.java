public class Pedido {
    private int numeroPedido;
    private double valorTotal;
    private Cliente cliente;

    public Pedido(int numeroPedido, double valorTotal, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public void infoPedido() {
        System.out.println("===== DADOS DO PEDIDO =====");
        System.out.println("Número do pedido: " + this.numeroPedido);
        System.out.println("Valor total: R$ " + this.valorTotal);
        System.out.println("===== DADOS DO CLIENTE =====");
        this.cliente.infoCliente();
    }

    public int getNumeroPedido() { return numeroPedido; }
    public double getValorTotal() { return valorTotal; }
    public Cliente getCliente() { return cliente; }
    public void setNumeroPedido(int numeroPedido) { this.numeroPedido = numeroPedido; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}