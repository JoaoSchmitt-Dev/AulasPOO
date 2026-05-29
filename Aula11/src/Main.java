import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        Scanner entradas = new Scanner(System.in);

        do {
            System.out.print("\n ======== Menu ========" +
                    "\n1 - Cadastrar aluno" +
                    "\n2 - Adicionar nota" +
                    "\n3 - Listar alunos" +
                    "\n4 - Calcular media" +
                    "\n5 - Sair");
            System.out.print("\nEscolha sua opção: ");
            try {
                opcao = entradas.nextInt();
                entradas.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                entradas.nextLine();
            }
            switch (opcao){

                case 1:
                    System.out.print("Nome: ");
                    String nomeAluno = entradas.nextLine();

                    System.out.print("Matricula: ");
                    String matriculaAluno = entradas.nextLine();

                    alunos.add(new Aluno(nomeAluno,matriculaAluno));
                    break;

                case 2:
                    if (alunos.isEmpty()){
                        System.out.println("Nenhum aluno cadastrado!");
                         break;
                    }

                    for (int i = 0; i < alunos.size(); i++){
                        System.out.println(i + " - " + alunos.get(i).getNome());
                    }

                    System.out.print("Qual aluno inserir nota?");
                    int indiceAluno = entradas.nextInt();
                    entradas.nextLine();

                    Aluno alunoEscolhido = null;
                    try {
                        alunoEscolhido = alunos.get(indiceAluno);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Aluno não encontrado!");
                        break;
                    }

                    System.out.println("Aluno " + alunoEscolhido.getNome() + " selecionado!");
                    System.out.print("Digite a nota: ");
                    double nota = entradas.nextDouble();

                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Digite entre 0 e 10.");
                    } else {
                        alunoEscolhido.setNotas(nota);
                        System.out.println("Nota inserida!");
                    }

                    break;

                case 3:
                    if (alunos.isEmpty()){
                        System.out.println("Nenhum aluno cadastrado!");
                        break;
                    }

                    for (Aluno a : alunos){
                        a.exibirInfo();
                    }

                    break;

                case 4:
                    if (alunos.isEmpty()){
                        System.out.println("Nenhum aluno cadastrado!");
                        break;
                    }

                    for (int i = 0; i < alunos.size(); i++){
                        System.out.println(i + " - " + alunos.get(i).getNome());
                    }

                    System.out.print("Qual aluno calcular a media?");
                    int indiceAlunoMedia = entradas.nextInt();
                    entradas.nextLine();

                    Aluno alunoEscolhidoMedia = null;
                    try {
                        alunoEscolhidoMedia = alunos.get(indiceAlunoMedia);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Aluno não encontrado!");
                        break;
                    }

                    double mediaAluno = 0;

                    try {
                        mediaAluno = alunoEscolhidoMedia.calcularMedia();
                    } catch (ArithmeticException e) {
                        System.out.println("Aluno não possui notas!");
                    }

                    System.out.println("A média do(a) aluno(a) " + alunoEscolhidoMedia.getNome() + " é " + mediaAluno);
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao != 5);
    }
}
