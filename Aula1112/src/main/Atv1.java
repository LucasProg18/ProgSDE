package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> funcionario = new ArrayList<String>();
		ArrayList<Double> salario = new ArrayList<Double>();
		String nomes = "", novoNomes;
		double salarioF;
		int n1;
		while(true) {
			System.out.println("============================");
			System.out.println("            MENU            ");
			System.out.println("============================");
			System.out.println("1. Inserir Funcionario");
			System.out.println("2. Ver Funcionarios");
			System.out.println("3. Atualizar Funcionario");
			System.out.println("4. Remover Funcionario");
			System.out.println("0. Sair");
			System.out.println(" ");
			System.out.print("Escolha uma opção ");
			String opr = scanner.next();
			
			if (opr.equals("1")) {
				System.out.print("Nome do funcionario: ");
				nomes = scanner.next();
				funcionario.add(nomes);
				System.out.printf("Salario do Funcionario %s: ", nomes);
				salarioF = scanner.nextDouble();
				salario.add(salarioF);
			}
			else if (opr.equals("2")) {
				System.out.println("Lista e Salario dos Funcionarios");
				for (int i = 0; i < funcionario.size(); i++) {
					System.out.printf("%d. %s - R$ %.2f\n", i, funcionario.get(i), salario.get(i));
				}
				System.out.println(" ");
				System.out.print("Qual funcionario voce quer ver: ");
				n1 = scanner.nextInt();
				System.out.print(funcionario.get(n1) + " - " + "R$" + salario.get(n1));
				System.out.println(" ");
			}
			else if (opr.equals("3")) {
				System.out.println("Voce escolheu a opção Atualizar Funcionario");
				
				
				for (int i = 0; i < funcionario.size(); i++) {
					System.out.printf("%d. %s\n", i, funcionario.get(i));
				}
				
				System.out.print("Escolha o funcionario por indice: ");
				n1 = scanner.nextInt();
				
				System.out.print("Novo Nome do funcionario: ");
				novoNomes = scanner.next();
				
				funcionario.set(n1, novoNomes);
				
				
			}
			else if (opr.equals("4")) {
				System.out.println("Voce escolheu a opção Remover Funcionario");
			}
			else if (opr.equals("0")) {
				System.out.println("Saindo do menu...");
				break;
			}
			
			System.out.println("TECLE B PARA CONTINUAR");
			scanner.next();
		}
	}

}
