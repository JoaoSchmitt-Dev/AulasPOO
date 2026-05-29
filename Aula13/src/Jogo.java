public class Jogo {
    private int id;
    private String titulo;
    private String genero;
    private double preco;
    private Categoria categoria;

    public Jogo (int id, String titulo, String genero, double preco, Categoria categoria){
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
