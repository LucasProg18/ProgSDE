package senac;
import java.util.Scanner;
public class Teste {
		
		    public static void main(String[] args) {
		        Scanner leitor = new Scanner(System.in);

		        // Solicitar informações do livro ao usuário
		        System.out.println("Digite o título do livro:");
		        String titulo = leitor.nextLine();

		        System.out.println("Digite o autor do livro:");
		        String autor = leitor.nextLine();

		        System.out.println("Digite o ano de publicação do livro:");
		        int anoPublicacao = leitor.nextInt();

		        double preco = 0;
				int quantidade = 0;
				// Criar o objeto livro
		        Livro livro = new Livro(titulo, autor, anoPublicacao, preco, quantidade);

		        // Exibir detalhes do livro
		        System.out.println("\nDetalhes do Livro Registrado:");
		        livro.exibirDetalhes();

		        // Verificar se o livro é antigo
		        if (livro.verificarLivroAntigo()) {
		            System.out.println("Este livro é considerado antigo (mais de 50 anos).");
		        } else {
		            System.out.println("Este livro não é considerado antigo.");
		        }

		        leitor.close();
		    }
		}

	