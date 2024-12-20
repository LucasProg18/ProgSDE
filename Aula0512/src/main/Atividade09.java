package main;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	        int numero=0, soma=0, quantidade=0; 
	        double media=0;

        while (numero >= 0) {
	
            System.out.println("Digite um número inteiro:");
           numero = leitor.nextInt();
            if (numero >= 0) {
                soma += numero;
                quantidade++;
            }else {
                System.out.println("Encerrando o cálculo!");
            }
	
	        }
	        
	        while (true) {
	            System.out.println("Digite um número inteiro:");
	            numero = leitor.nextInt();
	            
	            if (numero >= 0) {
	                soma += numero;
	                quantidade++;
	            }else {
	                System.out.println("Encerrando o cálculo!");
	                break;
	            }
	        }

	        media = soma/quantidade;

	        System.out.println("A média foi: "+ media);

	    }

		
	}

