package main;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine();
	
		if (nome.charAt(0) == 'a') {
			System.out.print("começa com A");
		}
		else {
			System.out.print("Nao começa com A");
		}
	}

}
