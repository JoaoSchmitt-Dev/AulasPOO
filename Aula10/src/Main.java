
import java.util.Scanner;
import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {

            int opcao = 0;

            Scanner entradas = new Scanner(System.in);

            ArrayList<Cliente> clientes = new ArrayList<Cliente>();

            ArrayList<Livro> livros = new ArrayList<Livro>();

            ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

            do {
                System.out.print("\n ======== Menu ========" +
                        "\n1 - Cadastrar cliente" +
                        "\n2 - Cadastrar livro" +
                        "\n3 - Criar emprestimo" +
                        "\n4 - Exibir informações do emprestimo" +
                        "\n5 - Registrar devolução" +
                        "\n6 - Sair");
                System.out.print("\nEscolha sua opção: ");
                opcao = entradas.nextInt();
                entradas.nextLine();

                switch (opcao){

                    case 1:
                        System.out.print("Nome do cliente: ");
                        String nomeCliente = entradas.nextLine();


                        System.out.print("CPF do cliente: ");
                        String cpfCliente = entradas.nextLine();

                        clientes.add(new Cliente(nomeCliente, cpfCliente));
                        break;

                    case 2:
                        System.out.print("Titulo do livro: ");
                        String tituloLivro = entradas.nextLine();

                        System.out.print("Autor do livro: ");
                        String autorLivro = entradas.nextLine();

                        System.out.print("N° de Paginas: ");
                        int paginasLivro = entradas.nextInt();

                        livros.add(new Livro(tituloLivro, autorLivro, paginasLivro));
                        break;

                    case 3:

                        if (clientes.isEmpty() || livros.isEmpty()) {
                            System.out.println("Cadastre um cliente e um livro primeiro!");
                            break;
                        }

                        System.out.println("===== Clientes =====");

                        for (int i = 0; i < clientes.size(); i++) {
                            System.out.println(i + " - " + clientes.get(i).getNome());
                        }

                        System.out.print("Escolha o cliente: ");
                        int indiceCliente = entradas.nextInt();

                        System.out.println("===== Livros =====");

                        for (int i = 0; i < livros.size(); i++) {
                            System.out.println(i + " - " + livros.get(i).getTitulo());
                        }

                        System.out.print("Escolha o livro: ");
                        int indiceLivro = entradas.nextInt();
                        entradas.nextLine();

                        System.out.print("Id do emprestimo: ");
                        int idEmprestimo = entradas.nextInt();
                        entradas.nextLine();

                        System.out.print("Data do emprestimo: ");
                        String dataEmprestimo = entradas.nextLine();

                        emprestimos.add(new Emprestimo(
                                idEmprestimo,
                                dataEmprestimo,
                                clientes.get(indiceCliente),
                                livros.get(indiceLivro)
                        ));
                        System.out.println("Emprestimo criado!");

                        break;

                    case 4:
                        if (emprestimos.isEmpty()) {
                            System.out.println("Nenhum emprestimo cadastrado!");
                            break;
                        }
                        for (Emprestimo e : emprestimos) {
                            e.exibirInfo();
                        }

                        break;

                    case 5:
                        if (emprestimos.isEmpty()) {
                            System.out.println("Nenhum emprestimo cadastrado!");
                            break;
                        }
                        System.out.print("Id do emprestimo para devolução: ");
                        int idBusca = entradas.nextInt();
                        entradas.nextLine();

                        boolean achou = false;
                        for (Emprestimo e : emprestimos) {
                            if (e.getIdEmprestimo() == idBusca) {
                                e.registrarDevolucao();
                                achou = true;
                                break;
                            }
                        }
                        if (!achou) System.out.println("Emprestimo não encontrado!");
                        break;

                    case 6:
                        System.out.println("Encerrando sistema...");
                        break;

                    default:
                        System.out.println("Opção invalida!");
                }

            } while(opcao != 6);
        }

    }



