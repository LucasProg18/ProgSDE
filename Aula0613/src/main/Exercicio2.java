package main;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		String nome = leitor.nextLine();
		
		
		System.out.printf("Nome: %s\nPrimeira letra do nome: %s \nNumeros de letras: %s",nome, nome.charAt(0), nome.length());
		
	}

}
