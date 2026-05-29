public class Filme {

    private String titulo, genero;
    private int duracao;
    private double avaliacao;

    public Filme(String titulo,String genero,int duracao){
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.avaliacao = 0;
    }

    public void avaliarFilme(double avaliacao){
        if (avaliacao < 0){
            this.avaliacao = 0;
        } else if (avaliacao > 10) {
            this.avaliacao = 10;
        } else {
            this.avaliacao = avaliacao;
        }
    }

    public void exibirInformacoes(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Genero: " + getGenero());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Avaliação: " + getAvaliacao());
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setDuracao(int duracao){
       if (duracao < 0){
           this.duracao = 0;
       } else if (duracao > 59) {
           this.duracao = 59;
       } else {
           this.duracao = duracao;
       }
    }

    public void setAvaliacao(double avaliacao){
        if (avaliacao < 0){
            this.avaliacao = 0;
        } else if (avaliacao > 10) {
            this.avaliacao = 10;
        } else {
            this.avaliacao = avaliacao;
        }
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getGenero(){
        return this.genero;
    }

    public int getDuracao(){
        return this.duracao;
    }

    public double getAvaliacao(){
        return this.avaliacao;
    }
}
