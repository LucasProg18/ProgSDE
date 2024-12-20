package SistemaRH;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemasFuncionarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Funcionarios> fc = new ArrayList<Funcionarios>();
		
		String nome = "", cargo, departamento;
		double salario;
		
		while(true) {
			System.out.print("Nome: ");
			nome = sc.nextLine();
			
			if (nome.equalsIgnoreCase("sair")) {
				break;
			}
			
			System.out.print("Cargo: ");
			cargo = sc.nextLine();
			
			System.out.print("Departamento: ");
			departamento = sc.nextLine();
			
			System.out.print("Salario: ");
			salario = sc.nextDouble();
			
			fc.add(new Funcionarios(nome, cargo, departamento, salario));
			
			System.out.println("Aperte B");
			sc.nextLine();
			fc.get(1).mostrarFuncionario();
			
		}
	
	}

}
