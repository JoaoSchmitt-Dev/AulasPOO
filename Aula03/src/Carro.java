public class Carro {

    private String marca, modelo;
    private int ano, velocidadeAtual;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int valor){
        this.velocidadeAtual = this.velocidadeAtual + valor;
    }

    public void frear(int valor){
        if (this.velocidadeAtual - valor < 0){
            this.velocidadeAtual = 0;
        } else {
            this.velocidadeAtual = this.velocidadeAtual - valor;
        }
    }

    public void velocimetro(){
        System.out.printf("Velocidade Atual: " + this.velocidadeAtual);
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setVelocidadeAtual(int velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

}
