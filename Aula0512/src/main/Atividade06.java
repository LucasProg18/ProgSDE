package main;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int numero, divisores = 0;
		
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		
		
	for (int i = 2; i <= numero; i++);{
		if(numero % i == 0);{
			divisores++;
			
		}
	}
		
		

	}

}
