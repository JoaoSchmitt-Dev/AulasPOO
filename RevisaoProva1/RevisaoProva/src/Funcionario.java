public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salarioBase = salario;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirInfoFuncionario(){
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("Salario base: " + this.salarioBase);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salarioBase = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salarioBase;
    }
}
