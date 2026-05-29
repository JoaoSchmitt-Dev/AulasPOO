public class Aluno {
    private String nome,cpf;
    private int idade, plano;

    public Aluno(String nome, String cpf, int idade, int plano) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.plano = plano;
    }

    public void infoAluno(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Plano: " + this.plano);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public int getPlano() {
        return plano;
    }
}
