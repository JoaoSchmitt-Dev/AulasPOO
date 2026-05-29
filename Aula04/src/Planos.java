public class Planos {
    private int plano;

    public Planos(int plano){
        this.plano = plano;
    }
    public void mostrarPlanos(){

        System.out.println("Plano 1: R$ 120 mensais 5x na semana, um ano de fidelidade");
        System.out.println("Plano 2: R$ 80 mensais 3x na semana, um ano de fidelidade");
        System.out.println("Plano 3: R$ 50 mensais 2x na semana, um ano de fidelidade");
    }

    public void valorAnual(){

        switch (this.plano) {

            case 1: System.out.println("O plano 1 custará: R$ " + 12*120 + " por ano");
                break;

            case 2: System.out.println("O plano 2 custará: R$ " + 12*80 + " por ano");
                break;

            case 3: System.out.println("O plano 3 custará: R$ " + 12*50 + " por ano");
                break;

            default: System.out.printf("Plano invalido!");
                break;
        }
    }

    public int getPlano() {
        return this.plano;
    }
}
