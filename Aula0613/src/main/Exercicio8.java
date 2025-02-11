package main;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine();
		String invertido = "";
		for (int i = nome.length()-1; i >= 0; i--) {
			invertido += nome.charAt();
			
		}
		if (nome.equalsIgnoreCase(invertido)) {
			System.out.print(nome);
		}
		
		
	}
}

