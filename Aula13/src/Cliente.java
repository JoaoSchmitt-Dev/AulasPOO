public class Cliente {
    private int id;
    private String nome;
    private String email;
    private int idade;


    public Cliente(int id, String nome, String email, int idade){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
}
