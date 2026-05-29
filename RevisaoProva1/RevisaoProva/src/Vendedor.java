public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, double salarioBase,double comissao){
        super(nome,salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + (getSalario() * comissao / 100);
    }

    @Override
    public void exibirInfoFuncionario(){
        System.out.println("Nome do funcionario: " + super.getNome());
        System.out.println("Salario com comissao: R$ " + calcularSalario());
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao(){
        return this.comissao;
    }
}
