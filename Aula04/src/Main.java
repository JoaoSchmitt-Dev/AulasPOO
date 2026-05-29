import java.util.Scanner;

public class Main {

    Scanner entradas = new Scanner(System.in);

    Aluno aluno = new Aluno("JJ","VV",0,0);
    Planos planosAluno = new Planos(0);

    public void menu() {
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Visualizar dados do aluno");
            System.out.println("3 - Calcular valor anual do plano");
            System.out.println("4 - Planos disponiveis");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entradas.nextInt();
            entradas.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = entradas.nextLine();

                    System.out.print("CPF do aluno: ");
                    String cpf = entradas.nextLine();

                    System.out.print("Idade do aluno: ");
                    int idade = entradas.nextInt();

                    System.out.print("Plano do aluno: ");
                    int plano = entradas.nextInt();

                    this.planosAluno = new Planos(plano);
                    this.aluno = new Aluno(nome, cpf, idade, plano);

                    break;

                case 2:
                    aluno.infoAluno();
                    break;

                case 3:
                    planosAluno.valorAnual();
                    break;

                case 4:
                    planosAluno.mostrarPlanos();
                    break;

                case 5:
                    System.out.println("Encerrando o sistema!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);
    }

    public static void main(String[] args) {
        Main sistema = new Main();
        sistema.menu();
    }
}