package Atividade;

import java.util.Scanner;

public class Livro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		livroSistema l1 = new livroSistema();
		
		System.out.print("Titulo do Livro: ");
		l1.setTitulo(sc.nextLine());
		
		System.out.print("Autor do Livro: ");
		l1.setAutor(sc.nextLine());
	
		System.out.print("Ano de Publicação: ");
		l1.setAnoPublicacao(sc.nextInt());
	
		l1.mostrarInfo();
		l1.verificarLivroAntigo();	


}
}