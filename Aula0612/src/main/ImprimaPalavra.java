package main;

import java.util.Scanner;

public class ImprimaPalavra {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
		String palavra,palavraInvertida = " ";
		System.out.println("Digite uma palavra:");
		    palavra = leitor.nextLine();
		
		for(int i = 0; i < palavra.length(); i++){
			palavraInvertida += palavra.charAt(palavra.length()-1-i);
		}		
		System.out.println(palavraInvertida);
	}
}

