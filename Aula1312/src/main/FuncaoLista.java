package main;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncaoLista {

	public static void main(String[] args) {
		ArrayList<String> alunos = montarListaNomes();
		
		imprimirLista(alunos);
	
	}

	public static void ola() {
		System.out.println("Hello World!");
	}

	public static void olaNome(String nome) {
		System.out.println("Seja bem vindo, " + nome + "!");
	}

	public static void saudacao(String nome, String prefixo) {
		if (prefixo.equals("Senhor")) {
			System.out.println("Seja bem vindo, " + prefixo + " " + nome + "!");
		} else if (prefixo.equals("Senhora")) {
			System.out.println("Seja bem vinda, " + prefixo + " " + nome + "!");
		} else {
			System.out.println("Seja bem vinde, " + prefixo + " " + nome + "!");
		}
	}
	
	public static int soma(int a, int b) {
		int resultado = a+b;
		return resultado;
	}
	
	public static boolean checarPar (int numero) {
		if (numero % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void mostrarNumerosEntre(int n1, int n2) {
		if (n1 <= n2) {
			for (int i = n1; i <= n2; i++) {
				System.out.println(i);
			}
		}else {
			for (int i = n1; i >= n2; i--) {
				System.out.println(i);
			}
		}

	}
	
	public static ArrayList<Integer> listaNumerosEntre(int n1, int n2) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		if (n1 <= n2) {
			for (int i = n1; i <= n2; i++) {
				numeros.add(i);
			}
		}else {
			for (int i = n1; i >= n2; i--) {
				numeros.add(i);
			}
		}
		return numeros;

	}
	
	public static void comecaVogal(String palavra) {
		
		palavra = palavra.toLowerCase();
		
		if ("aeiou".contains(String.valueOf(palavra.charAt(0)))) {
			System.out.println("A palavra começa com vogal.");
		}else {
			System.out.println("A palavra começa com consoante.");
		}
		
	}
	
	public static ArrayList<String> montarListaNomes(){
		ArrayList<String> nomes = new ArrayList<String>();
		Scanner leitor = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite um nome: ");
			String nome = leitor.nextLine();
			
			if (nome.equalsIgnoreCase("sair")) {
				break;
			}else {
				nomes.add(nome);
			}
			
		}
		
		return nomes;
		
	}
	
	public static void imprimirLista(ArrayList<String> palavras) {
		for (int i = 0; i < palavras.size(); i++) {
			System.out.println((i+1)+". "+ palavras.get(i));
		}
	}
	

}
