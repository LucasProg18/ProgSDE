package main;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		String nome = leitor.nextLine();
		
		for (int i = nome.length()-1; i >= 0; i--) {
			System.out.println(nome.charAt(i));
		}
	}

}
