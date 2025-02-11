package main;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
		    
		    int numero, contador = 0;
		    
		    for (int i = 1; i <= 10; i++){
		        System.out.println("Digite um número inteiro:");
		        numero = leitor.nextInt();
		        
		        if (numero >= 10 && numero <= 50){
		            System.out.println("Número está no intervalo!");
		            contador++;
		            System.out.println("Números no intervalo até agora: "+contador);
		        }
		    }
		    
		    System.out.println("Total de números no intervalo: "+ contador);

	}

}
