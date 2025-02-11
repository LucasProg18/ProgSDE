package main;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String palavra = leitor.nextLine();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.print(palavra.charAt(i) + " ");
		}
	}

}
