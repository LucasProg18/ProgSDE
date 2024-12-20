package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaChamada {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		ArrayList <String> nomes = new ArrayList<String>();
         
		while(true) {
		 System.out.println("***Digite um nome de funcionários:***");
		 nome = leitor.nextLine();
		 
		 if (nome.equalsIgnoreCase("SAIR")) {
             System.out.println("Encerrando o programa.");
             break;
		 }else {
			 nomes.add(nome);
		 
              }	 
		 System.out.println(nomes);
		}
	}
}
