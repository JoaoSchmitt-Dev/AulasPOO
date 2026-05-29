public class Aluno extends Pessoa {

    private int matricula;
    private double nota1,nota2;

    public Aluno(String nome, int idade, int matricula, double nota1, double nota2){
        super.nome = nome;
        super.idade = idade;

        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void exibirAluno(){
        super.apresentar();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Média: " + (this.nota1 + this.nota2) / 2);
    }

    public double calcularMedia(double nota1, double nota2){
        return (this.nota1 + this.nota2) / 2;
    }

    public void setNome(String nome){super.nome = nome;}

    public void setIdade(int idade){super.idade = idade;}

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getNome(){return super.nome;}

    public int getIdade(){return super.idade;}

    public int getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
}
