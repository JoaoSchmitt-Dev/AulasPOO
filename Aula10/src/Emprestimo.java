public class Emprestimo {
    private int idEmprestimo;
    private String dataEmprestimo;
    private boolean devolvido;
    private Cliente cliente;
    private Livro livro;

    public Emprestimo (int idEmprestimo, String dataEmprestimo, Cliente cliente, Livro livro){
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.devolvido = false;
        this.cliente = cliente;
        this.livro = livro;
    }

    //@Override
    public void exibirInfo(){
        System.out.println("====== Emprestimo ======");
        System.out.println("Id do Emprestimo: " + getIdEmprestimo());
        System.out.println("Data do Emprestimos: " + getDataEmprestimo());
        System.out.println("Devolvido: " + isDevolvido());
        cliente.exibirInfo();
        livro.exibirInfo();
    }

    public void registrarDevolucao(){
        setDevolvido(true);
        System.out.println("Devolução Registrada!");

    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Livro getLivro() {
        return livro;
    }
}
