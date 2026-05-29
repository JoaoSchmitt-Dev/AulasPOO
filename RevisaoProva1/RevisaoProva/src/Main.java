import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner entradas = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int opcao = 0;

        do {
                System.out.println("========== MENU ==========");
                System.out.println("1 - Cadastrar Produto");
                System.out.println("2 - Cadastrar Funcionario");
                System.out.println("3 - Listar Produtos");
                System.out.println("4 - Listar Funcionarios");
                System.out.println("5 - Sair");
                System.out.print("Escolha sua opção: ");

                opcao = entradas.nextInt();

                switch(opcao) {

                        case 1:
                                System.out.println("==== Tipo de Produto ====");
                                System.out.println("1 - Produto normal");
                                System.out.println("2 - Produto promocao");
                                System.out.print("Escolha o tipo de produto: ");

                                int tipo = entradas.nextInt();
                                entradas.nextLine();

                                if (tipo == 1){
                                        System.out.print("Nome do produto: ");
                                        String nome = entradas.nextLine();

                                        System.out.print("Preço do produto: R$ ");
                                        double preco = entradas.nextDouble();
                                        entradas.nextLine();

                                        Produto p = new Produto(nome,preco);
                                        produtos.add(p);

                                } else if (tipo == 2) {
                                        System.out.print("Nome do produto: ");
                                        String nome = entradas.nextLine();

                                        System.out.print("Preço do produto: R$ ");
                                        double preco = entradas.nextDouble();
                                        entradas.nextLine();

                                        System.out.print("Desconto: %");
                                        double desconto = entradas.nextDouble();
                                        entradas.nextLine();

                                        ProdutoPromocao pp = new ProdutoPromocao(nome,preco,desconto);
                                        produtos.add(pp);

                                } else {
                                        System.out.println("Opção incorreta!");
                                }

                                break;

                        case 2:
                                System.out.println("== Cargo do Funcionario ==");
                                System.out.println("1 - Vendedor");
                                System.out.println("2 - Gerente");
                                System.out.print("Escolha o cargo exercido: ");

                                int tipoFunc = entradas.nextInt();
                                entradas.nextLine();

                                if (tipoFunc == 1){
                                        System.out.print("Nome do vendedor: ");
                                        String nome = entradas.nextLine();

                                        System.out.print("Salario base: R$ ");
                                        double salario = entradas.nextDouble();
                                        entradas.nextLine();

                                        System.out.print("Comissão: % ");
                                        double comissao = entradas.nextDouble();
                                        entradas.nextLine();

                                        Vendedor v = new Vendedor(nome,salario,comissao);
                                        funcionarios.add(v);

                                } else if (tipoFunc == 2) {
                                        System.out.print("Nome do gerente: ");
                                        String nome = entradas.nextLine();

                                        System.out.print("Salario base: R$ ");
                                        double salario = entradas.nextDouble();
                                        entradas.nextLine();

                                        System.out.print("Bônus: R$ ");
                                        double bonus = entradas.nextDouble();
                                        entradas.nextLine();

                                        Gerente g = new Gerente(nome,salario,bonus);
                                        funcionarios.add(g);


                                } else {
                                        System.out.println("Opção incorreta!");
                                }
                                break;

                        case 3:
                                for(Produto p : produtos){
                                        p.exibirInformacoes();
                                        System.out.println();
                                }
                                break;

                        case 4:
                                for(Funcionario f : funcionarios){
                                        f.exibirInfoFuncionario();
                                        System.out.println();
                                }
                                break;

                        case 5:
                                System.out.println("Encerrando o programa...");
                                break;

                        default:
                                System.out.println("Opção invalida!");

                }

        }while (opcao != 5);
    }
}

