package main;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero, menor = 0 ;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Digite um número inteiro: ");
			numero = leitor.nextInt();
			
			if (i == 1) {
				menor = numero;
			}
			
			
			else if (numero < menor) {
				menor = numero;
				System.out.println("Número substítuido!");
			}
		}
		
		System.out.println("O menor número é: "+ menor);

	}

}
