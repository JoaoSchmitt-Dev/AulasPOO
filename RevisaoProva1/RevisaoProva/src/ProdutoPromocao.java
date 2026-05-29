public class ProdutoPromocao extends Produto{
    private double desconto;

    public ProdutoPromocao(String nome, double preco, double desconto){
        super(nome, preco);
        this.desconto = desconto;
    }

    public double calcularPreco() {
        return super.getPreco() - (super.getPreco() * desconto / 100);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Preco do produto com desconto: " + calcularPreco());

    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
}
