package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		String palavra = leitor.nextLine();
		
		char[] abc = palavra.toCharArray();
		
		Arrays.sort(abc);	
		
		String PalavraOrdenada = new String(abc);
		
		System.out.println(PalavraOrdenada);
	}

}
