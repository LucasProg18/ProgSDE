package main;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String palavra = leitor.nextLine();
		int qtd = 0;
		for (int i = 0; i <= palavra.length()-1; i++) {
			if (palavra.charAt(i) == ' ') {
				qtd++;
			}
		}
		System.out.printf("Palavra: %s \nQuantidade de Espaços: %d", palavra, qtd);

	}

}
