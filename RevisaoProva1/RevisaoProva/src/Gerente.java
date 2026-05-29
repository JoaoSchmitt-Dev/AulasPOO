public class Gerente extends Funcionario {
    private double bonus;

    public Gerente (String nome, double salarioBase, double bonus){
        super(nome,salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalario() +  bonus;
    }

    @Override
    public void exibirInfoFuncionario(){
        System.out.println("Nome do funcionario: " + super.getNome());
        System.out.println("Salario com bonus: R$ " + calcularSalario());
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
