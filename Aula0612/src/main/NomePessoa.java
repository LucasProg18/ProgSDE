package main;

import java.util.Scanner;

public class NomePessoa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um nome:");
		String nome = leitor.nextLine().trim();
		int quantidadeLetras = nome.length();
		char primeiraLetra = nome.charAt(0);
		
		System.out.println("Quantidade de letras:" + quantidadeLetras);
		System.out.println("Primeira letra:"+ primeiraLetra);
		
	}

}
