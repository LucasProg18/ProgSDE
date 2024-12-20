package main;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeFuncoes {

	public static void main(String[] args) {
//		System.out.print(ImparPar(122));
//		ListaPessoa();
		Palavra();
	}
	
	public static boolean ImparPar (int n1) {

		if (n1 % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void ListaPessoa() {
		Scanner leitor = new Scanner(System.in);
		ArrayList<String>nomes = new ArrayList<String>();
		String nome = "", resultado = "";
		
		while (true) {
			System.out.print("Digite nomes: ");
			nome = leitor.nextLine();
			if (nome.equals("sair")) {
				break;
			}
			nomes.add(nome);
			
		}
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(i + ". " + nomes.get(i));
		}
		
	}

	public static void Palavra() {
		ArrayList<Character> vogal = new ArrayList<Character>();
		Scanner scanner = new Scanner(System.in);
		vogal.add('a');
		vogal.add('e');
		vogal.add('i');
		vogal.add('o');
		vogal.add('u');
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		
		
		if (vogal.contains(nome.toLowerCase().charAt(0))) {
			System.out.println("Nome começa com vogal");
			
		}
		else {
			System.out.println("Nome começa com consoante");
		}
		
		for (int i = 0; i < nome.length(); i++) {
			if (vogal.contains(nome.toLowerCase().charAt(i))){
				
			}
			
		}
		
	}
	
}
