
package sistemarh;
import java.util.ArrayList;
import java.util.Scanner;
public class SistemaRH {
	
		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
			
			// Crie uma estrutura de repetição que pede nome, cargo, salario e departamento de um funcionário. Use essas informações para criar um novo funcionário e adicionar à lista. Continue até a pessoa digitar SAIR
			
			System.out.println("Cadastro de Funcionários");
			while (true) {
				System.out.println("Digite o nome: ");
				String nome = leitor.nextLine();
				
				System.out.println("Digite o cargo: ");
				String cargo = leitor.nextLine();
				
				System.out.println("Digite o salário: ");
				double salario = Double.parseDouble(leitor.nextLine());
				
				System.out.println("Digite o departamento: ");
				String departamento = leitor.nextLine();
				
				Funcionario novoFuncionario = new Funcionario(nome, cargo, salario, departamento);
				
				funcionarios.add(novoFuncionario);
				
				System.out.println("Digite SAIR se desejar encerrar o cadastro!");
				String sair = leitor.nextLine();

				if (sair.equalsIgnoreCase("SAIR")) {
					break;
				}
			}
			
			System.out.println("Funcionários Cadastrados");
			for(int i = 0; i < funcionarios.size(); i++) {
				// funcionarios.get(i).mostrarInformacoes
			System.out.println((i+1)+ ". "+ funcionarios.get(i).nome);
			}
			//Ignorar essa parte
			System.out.println("Digite o número do funcionário desejado:");
			int numero = leitor.nextInt();
			
			funcionarios.get(numero-1).mostrarInformacoes();
		
		}

      }
