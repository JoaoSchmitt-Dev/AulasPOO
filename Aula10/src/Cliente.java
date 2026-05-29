public class Cliente {
    private String nome;
    private String cpf;

    public Cliente (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirInfo(){
        System.out.println("====== Cliente ======");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
