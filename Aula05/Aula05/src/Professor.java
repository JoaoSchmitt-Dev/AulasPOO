public class Professor extends Pessoa {

    private double salario;
    private String disciplina;

    public Professor(String nome, int idade, double salario, String disciplina){
        super.nome = nome;
        super.idade = idade;

        this.salario = salario;
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar(){
        System.out.println("Salário: " + this.salario);
        System.out.println("Disciplina: " + this.disciplina);
    }
    public void exibirProfe(){
        System.out.println("Professor: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: " + this.salario);
        System.out.println("Disciplina: " + this.disciplina);
    }

    public void setNome(String nome){super.nome = nome;}

    public void setIdade(int idade){super.idade = idade;}

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getNome(){return super.nome;}

    public int getIdade(){return super.idade;}

    public double getSalario() {
        return salario;
    }

    public String getDisciplina(){
        return disciplina;
    }
}
