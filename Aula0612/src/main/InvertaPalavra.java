package main;

import java.util.Scanner;

public class InvertaPalavra {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = leitor.nextLine();
		
		for(int i = 0; i < palavra.length(); i++){
			
			System.out.println(palavra.charAt(palavra.length()-1-i));
			
		}		
	}
}
