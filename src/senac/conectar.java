package senac;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class conectar {

	static String URL = "jdbc:mysql://localhost:3306/sistemapetshop";
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

		System.out.println("Digite o nome do cliente:");
		String nome = scanner.nextLine();


		String telefone = "";

		while (true) {  
			System.out.println("Digite o telefone do cliente:");
			telefone = scanner.nextLine();

			try {
				int telNum = Integer.parseInt(telefone);   
				break;
			}
			catch (Exception e) {
				System.err.println("Digite apenas numeros");
				continue;
			}
		}
		System.out.println("Digite o endereço do cliente:");
		String endereco = scanner.nextLine();

		String sql = "INSERT INTO clientes(nome, telefone, endereco) VALUES (?, ?, ?);";

		try (Connection realizar_conexao = conexao_com_banco();
				PreparedStatement cursor = realizar_conexao.prepareStatement(sql)) {

			cursor.setString(1, nome);
			cursor.setString(2, telefone);
			cursor.setString(3, endereco);
			cursor.executeUpdate();
			System.out.println("Cliente inserido com sucesso!");
		}
	}

	public static void consultarDados() throws SQLException {
		String sql = "SELECT * FROM clientes";

		try (Connection realizar_conexao = conexao_com_banco();
				Statement cursor = realizar_conexao.createStatement();
				ResultSet resultado_consulta = cursor.executeQuery(sql)) {

			while (resultado_consulta.next()) {
				int id = resultado_consulta.getInt("id");
				String nome = resultado_consulta.getString("nome");
				String telefone = resultado_consulta.getString("telefone");
				String endereco = resultado_consulta.getString("endereco");

				System.out.printf("ID: %d, Nome: %s, Telefone: %s, Endereço: %s\n",
						id, nome, telefone, endereco);
			}
		}
	}

	public static void atualizarDados() throws SQLException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("---------------------------------------------------------------------------------");
		consultarDados();
		System.out.println("---------------------------------------------------------------------------------");

		System.out.print("Digite o ID do produto que deseja atualizar: ");
		int id = Integer.parseInt(scanner.nextLine());

		System.out.print("Digite o novo nome do cliente: ");
		String nome = scanner.nextLine();

		System.out.print("Digite o novo telefone do cliente: ");
		String telefone = scanner.nextLine();

		System.out.print("Digite o novo endereço do cliente: ");
		String endereco = scanner.nextLine();

		String sql = "UPDATE clientes SET nome = ?, telefone = ?, endereco = ? WHERE id = ?";

		try (Connection conexao = conexao_com_banco();
				PreparedStatement cursor = conexao.prepareStatement(sql)) {

			cursor.setString(1, nome);
			cursor.setString(2, telefone);
			cursor.setString(3, endereco);
			cursor.setInt(4, id);
			int rowsAffected = cursor.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Cliente atualizado com sucesso!");
			} else {
				System.out.println("Cliente não encontrado.");
			}
		}
	}

	public static void deletarDados() throws SQLException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("---------------------------------------------------------------------------------");
		consultarDados();
		System.out.println("---------------------------------------------------------------------------------");

		System.out.print("Digite o id do produto que deseja excluir: ");
		int id = scanner.nextInt();

		String sql = "DELETE FROM clientes WHERE id = ?";

		try (Connection conexao = conexao_com_banco();
				PreparedStatement cursor = conexao.prepareStatement(sql)) {

			cursor.setInt(1, id);
			int rowsAffected = cursor.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Cliente deletado com sucesso!");
			} else {
				System.out.println("Cliente não encontrado.");
			}
		}
	}

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);


		while (true) {      	
			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Inserir Dados");
			System.out.println("2. Consultar Dados");
			System.out.println("3. Atualizar Dados");
			System.out.println("4. Deletar Dados");
			System.out.println("5. Sair");
			System.out.print("Opção: ");
			String opcao = scanner.nextLine();

			switch (opcao) {
			case "1":
				inserirDados();
				break;
			case "2":
				consultarDados();
				break;
			case "3":
				atualizarDados();
				break;
			case "4":
				deletarDados();
				break;
			case "5":
				System.out.println("Saindo...");
				return;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

			System.out.println("Pressione uma tecla");
			scanner.nextLine();
		}
	}
}
