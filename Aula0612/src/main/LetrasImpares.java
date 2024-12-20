package main;

import java.util.Scanner;

public class LetrasImpares {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = leitor.nextLine();
		
		for(int i = 0; i < palavra.length(); i++){
			if(i%2 == 1) {
			System.out.println(palavra.charAt(i));
			
		}		
	}
}
}

	
