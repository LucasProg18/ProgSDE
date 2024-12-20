	package main;
	
	import java.util.ArrayList;
	import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
	
	public class BilheteLoteria {
	//	Crie um programa de loteria que pede e armazena 6 números inteiro de 0 a 100. Ao final imprima o bilhete gerado para o jogador.
	//
	//	- Os números escolhidos DEVEM ser entre 0 e 100
	//	- Não se deve permitir escolher números repetidos (bilhete.contains(numero))
	// - Imprimir o bilhete no formato "xx - xx - xx - xx - xx - xx" Dica: Comece tentando imprimir cada número do bilhete por linha
		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			Random rng = new Random();
			
			ArrayList<Integer> bilheteGanhador = new ArrayList<Integer>();
			while (true) {
				int numero = rng.nextInt(0,101);
				
				if (!bilheteGanhador.contains(numero)) {
					bilheteGanhador.add(numero);
				}
				
				if (bilheteGanhador.size() == 6) {
					break;
				}
			}
			
			ArrayList<Integer> bilhete = new ArrayList<Integer>();
			//CRUD > CREATE > READ > UPDATE > DELETE
			// INSERIR > LER/VER > ATUALIZAR/MODIFICIAR > APAGAR
			while(true) {
				System.out.println("Digite um número:");
				int numero = leitor.nextInt();
				
				if (numero >= 0 && numero <= 100) {
					if (bilhete.contains(numero)) {
						System.out.println("Você já inseriu esse número! Escolha outro!");
					}else {
						bilhete.add(numero);
					}
					
				}else {
					System.out.println("Número inválido!");
				}
				
				if (bilhete.size() == 6) {
					break;
				}
				
			}
			Collections.sort(bilhete);
			Collections.sort(bilheteGanhador);
	
			System.out.print("Seu bilhete é: ");
			for (int i = 0; i < bilhete.size(); i++) {
			if (i == 0) {
				System.out.print(bilhete.get(i));
			}else {
				System.out.print(" - " + bilhete.get(i));
			}
			
			}
			System.out.println(" ");
			
			if (bilhete.equals(bilheteGanhador)) {
				System.out.println("Você venceu!");
			}
			else {
				System.out.println("Se lascou!");
				System.out.print("O Bilhete vencedor era: ");
				for (int i = 0; i < bilheteGanhador.size(); i++) {
					if (i == 0) {
						System.out.print(bilheteGanhador.get(i));
					}else {
						System.out.print(" - " + bilheteGanhador.get(i));
					}
					
					}
			}
		}
	
	}
