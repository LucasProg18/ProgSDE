package senac;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;

public class conectar {

    static String URL = "jdbc:mysql://localhost:3306/senac";
    static String USER = "root";
    static String PASSWORD = "123456";

    public static Connection conexao_com_banco() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("ERRO, QUEBROU TUDO :c " + e.getMessage());
            return null;
        }
    }

    public static void inserirDados() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        BigDecimal preco = new BigDecimal(scanner.nextLine());

        System.out.println("Digite a quantidade do produto:");
        int quantidade = Integer.parseInt(scanner.nextLine());

        String sql = "INSERT INTO produtos(nome, preco, quantidade) VALUES (?, ?, ?);";

        try (Connection realizar_conexao = conexao_com_banco();
             PreparedStatement cursor = realizar_conexao.prepareStatement(sql)) {

            cursor.setString(1, nome);
            cursor.setBigDecimal(2, preco);
            cursor.setInt(3, quantidade);
            cursor.executeUpdate();
            System.out.println("Produto inserido com sucesso!");
        }
    }

    public static void consultarDados() throws SQLException {
        String sql = "SELECT * FROM produtos";

        try (Connection realizar_conexao = conexao_com_banco();
             Statement cursor = realizar_conexao.createStatement();
             ResultSet resultado_consulta = cursor.executeQuery(sql)) {

            while (resultado_consulta.next()) {
                int id = resultado_consulta.getInt("id");
                String nome = resultado_consulta.getString("nome");
                double preco = resultado_consulta.getDouble("preco");
                int quantidade = resultado_consulta.getInt("quantidade");

                System.out.printf("ID: %d, Nome: %s, Preço: %.2f, Quantidade: %d%n",
                        id, nome, preco, quantidade);
            }
        }
    }

    public static void atualizarDados() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ID do produto que deseja atualizar:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o novo nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o novo preço do produto:");
        BigDecimal preco = new BigDecimal(scanner.nextLine());

        System.out.println("Digite a nova quantidade do produto:");
        int quantidade = Integer.parseInt(scanner.nextLine());

        String sql = "UPDATE produtos SET nome = ?, preco = ?, quantidade = ? WHERE id = ?";

        try (Connection conexao = conexao_com_banco();
             PreparedStatement cursor = conexao.prepareStatement(sql)) {

            cursor.setString(1, nome);
            cursor.setBigDecimal(2, preco);
            cursor.setInt(3, quantidade);
            cursor.setInt(4, id);
            int rowsAffected = cursor.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Produto atualizado com sucesso!");
            } else {
                System.out.println("Produto não encontrado.");
            }
        }
    }

    public static void deletarDados() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto que deseja excluir:");
        String nome = scanner.nextLine();

        String sql = "DELETE FROM produtos WHERE nome = ?";

        try (Connection conexao = conexao_com_banco();
             PreparedStatement cursor = conexao.prepareStatement(sql)) {

            cursor.setString(1, nome);
            int rowsAffected = cursor.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Produto deletado com sucesso!");
            } else {
                System.out.println("Produto não encontrado.");
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Inserir Dados");
            System.out.println("2. Consultar Dados");
            System.out.println("3. Atualizar Dados");
            System.out.println("4. Deletar Dados");
            System.out.println("5. Sair");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    inserirDados();
                    break;
                case 2:
                    consultarDados();
                    break;
                case 3:
                    atualizarDados();
                    break;
                case 4:
                    deletarDados();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
