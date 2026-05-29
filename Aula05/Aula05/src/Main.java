import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int opcao = 0;

        Scanner entradas = new Scanner(System.in);

        Aluno aluno = new Aluno("alal",55,202510,0.0,0.0);
        Professor professor = new Professor("alal",55,2222,"Mat");

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        ArrayList<Professor> profes = new ArrayList<Professor>();

        do {
            System.out.print("\n ======== Menu ========" +
                    "\n1 - Cadastrar aluno" +
                    "\n2 - Cadastrar professor" +
                    "\n3 - Exibir informações de aluno" +
                    "\n4 - Exibir informações de professor" +
                    "\n5 - Sair");
            System.out.print("\nEscolha sua opção: ");
            opcao = entradas.nextInt();
            entradas.nextLine();

            switch (opcao){

                case 1:
                    System.out.print("Nome do aluno: ");
                    String nomeAluno = entradas.nextLine();

                    System.out.print("Idade do aluno: ");
                    int idadeAluno = entradas.nextInt();

                    System.out.print("Matricula do aluno: ");
                    int matriculaAluno = entradas.nextInt();

                    System.out.print("Nota 1: ");
                    double nota1 = entradas.nextDouble();

                    System.out.print("Nota 2: ");
                    double nota2 = entradas.nextDouble();

                    alunos.add(new Aluno(nomeAluno, idadeAluno, matriculaAluno, nota1, nota2));

                    System.out.print("Aluno cadastrado com sucesso!");
                break;

                case 2:
                    System.out.print("Nome do professor: ");
                    String nomeProf = entradas.nextLine();

                    System.out.print("Idade do professor: ");
                    int idadeProf = entradas.nextInt();

                    System.out.print("Salario: R$ ");
                    double salarioProf = entradas.nextDouble();
                    entradas.nextLine();

                    System.out.print("Disciplina: ");
                    String disciplinaProf = entradas.nextLine();

                    profes.add(new Professor(nomeProf, idadeProf, salarioProf, disciplinaProf));

                    System.out.print("Professor cadastrado com sucesso!");
                break;

                case 3:
                    System.out.print("Digite a matricula do aluno para consulta: ");
                    int matriculaBusca = entradas.nextInt();

                    boolean achouMatricula = false;

                    for (Aluno a : alunos){
                        if (a.getMatricula() == matriculaBusca){
                            a.exibirAluno();
                            achouMatricula = true;
                            break;
                        }
                    }

                    if (!achouMatricula) {
                        System.out.print("Aluno não encontrado!");
                    }

                break;

                case 4:
                    System.out.print("Digite o nome do professor para consulta: ");
                    String nomeBusca = entradas.nextLine();

                    boolean achouNome = false;

                    for (Professor p : profes){
                        if (p.getNome().equalsIgnoreCase(nomeBusca)){
                            p.exibirProfe();
                            achouNome = true;
                            break;
                        }
                    }

                    if (!achouNome) {
                        System.out.print("Professor não encontrado!");
                    }
                break;

                case 5:
                    System.out.println("Encerrando sistema...");
                break;

                default:
                    System.out.println("Opção invalida!");
            }

        } while(opcao != 5);
    }

}
