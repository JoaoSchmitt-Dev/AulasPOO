import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/loja_games";
        String usuario = "root";
        String senha = "bancodedados05";

        Scanner entradas = new Scanner(System.in);
        int opcao = 0;

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado!");

            do {
                System.out.print("\n ======== Menu ========" +
                        "\n1 - Cadastrar jogo" +
                        "\n2 - Cadastrar cliente" +
                        "\n3 - Registrar compra" +
                        "\n4 - Atualizar preco do jogo" +
                        "\n5 - Atualizar email do cliente" +
                        "\n6 - Atualizar quantidade da compra" +
                        "\n7 - Sair");
                System.out.print("\nEscolha sua opção: ");
                opcao = entradas.nextInt();
                entradas.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.print("Titulo: ");
                        String titulo = entradas.nextLine();

                        System.out.print("Genero: ");
                        String genero = entradas.nextLine();

                        System.out.print("Preco: ");
                        double preco = entradas.nextDouble();
                        entradas.nextLine();

                        System.out.print("ID da Categoria: ");
                        int categoriaId = entradas.nextInt();
                        entradas.nextLine();

                        String sqlJogo = "INSERT INTO jogo (titulo, genero, preco, categoria_id) VALUES (?, ?, ?, ?)";
                        PreparedStatement stmtJogo = conexao.prepareStatement(sqlJogo);
                        stmtJogo.setString(1, titulo);
                        stmtJogo.setString(2, genero);
                        stmtJogo.setDouble(3, preco);
                        stmtJogo.setInt(4, categoriaId);
                        stmtJogo.executeUpdate();
                        System.out.println("Jogo cadastrado!");
                        break;

                    case 2:
                        System.out.print("Nome: ");
                        String nome = entradas.nextLine();

                        System.out.print("Email: ");
                        String email = entradas.nextLine();

                        System.out.print("Idade: ");
                        int idade = entradas.nextInt();
                        entradas.nextLine();

                        String sqlCliente = "INSERT INTO cliente (nome, email, idade) VALUES (?,?,?)";
                        PreparedStatement stmtCliente = conexao.prepareStatement(sqlCliente);
                        stmtCliente.setString(1, nome);
                        stmtCliente.setString(2, email);
                        stmtCliente.setInt(3, idade);
                        stmtCliente.executeUpdate();
                        System.out.println("Cliente cadastrado!");
                        break;

                    case 3:
                        System.out.print("ID do cliente: ");
                        int clienteId = entradas.nextInt();

                        System.out.print("ID do jogo: ");
                        int jogoId = entradas.nextInt();
                        entradas.nextLine();

                        System.out.print("Data da compra (AAAA-MM-DD): ");
                        String dataCompra = entradas.nextLine();

                        System.out.print("Quantidade: ");
                        int quantidade = entradas.nextInt();
                        entradas.nextLine();

                        String sqlCompra = "INSERT INTO compra (cliente_id, jogo_id, data_compra, quantidade) VALUES (?, ?, ?, ?)";
                        PreparedStatement stmtCompra = conexao.prepareStatement(sqlCompra);
                        stmtCompra.setInt(1, clienteId);
                        stmtCompra.setInt(2, jogoId);
                        stmtCompra.setString(3, dataCompra);
                        stmtCompra.setInt(4, quantidade);
                        stmtCompra.executeUpdate();
                        System.out.println("Compra registrada!");
                        break;

                    case 4:
                        System.out.print("id do jogo: ");
                        int idjogo = entradas.nextInt();
                        entradas.nextLine();

                        System.out.print("Novo preço: ");
                        double novoPreco = entradas.nextDouble();
                        entradas.nextLine();

                        String sqlAtualizaPreco = ("UPDATE jogo set preco = ? WHERE id = ?");
                        PreparedStatement stmtAtualizaPreco = conexao.prepareStatement(sqlAtualizaPreco);
                        stmtAtualizaPreco.setDouble(1, novoPreco);
                        stmtAtualizaPreco.setInt(2, idjogo);
                        stmtAtualizaPreco.executeUpdate();
                        System.out.println("Preço atualizado!");
                        break;

                    case 5:
                        System.out.print("id do cliente: ");
                        int idCliente = entradas.nextInt();
                        entradas.nextLine();

                        System.out.print("Novo email: ");
                        String novoEmail = entradas.nextLine();

                        String sqlAtualizaEmail = ("UPDATE cliente set email = ? WHERE id = ?");
                        PreparedStatement stmtAtualizaEmail = conexao.prepareStatement(sqlAtualizaEmail);
                        stmtAtualizaEmail.setString(1, novoEmail);
                        stmtAtualizaEmail.setInt(2, idCliente);
                        stmtAtualizaEmail.executeUpdate();
                        System.out.println("Email atualizado!");
                        break;

                    case 6:
                        System.out.print("id da compra: ");
                        int idCompra = entradas.nextInt();
                        entradas.nextLine();

                        System.out.print("Quantidade: ");
                        int novaQuantidade = entradas.nextInt();
                        entradas.nextLine();

                        String sqlAtualizaQuantidade = ("UPDATE compra SET quantidade = ? WHERE id = ?");
                        PreparedStatement stmtAtualizaQuantidade = conexao.prepareStatement(sqlAtualizaQuantidade);
                        stmtAtualizaQuantidade.setInt(1, novaQuantidade);
                        stmtAtualizaQuantidade.setInt(2,idCompra);
                        stmtAtualizaQuantidade.executeUpdate();
                        System.out.println("Quantidade atualizada!");
                        break;

                    case 7:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 7);

            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
