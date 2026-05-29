import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Double> notas = new ArrayList<Double>();
    private double media;

    public Aluno (String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirInfo(){
        System.out.println("====== Aluno ======");
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Notas: " + getNotas());
        System.out.println("Media: " + getMedia());
    }

    public double calcularMedia(){
        if (notas.isEmpty()){
            System.out.println("Nenhuma nota cadastrada!");
            return 0;
        }

        double soma = 0;

        for (double nota : notas){
            soma += nota;
        }

        return soma/notas.size();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNotas(double nota) {
        this.notas.add(nota);
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public double getMedia() {
        return media;
    }
}
