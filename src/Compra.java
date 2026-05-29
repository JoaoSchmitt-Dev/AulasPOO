public class Compra {
    private int id;
    private Cliente cliente;
    private Jogo jogo;
    private String dataCompra;
    private int quantidade;

    public Compra (int id, Cliente cliente, Jogo jogo, String dataCompra, int quantidade){
        this.id = id;
        this.cliente = cliente;
        this.jogo = jogo;
        this.dataCompra = dataCompra;
        this.quantidade = quantidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
