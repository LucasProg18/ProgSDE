package senac;

import java.util.Scanner;

public class Main {

	private static String titulo;
	private static String autor;

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Livro l1 = new Livro("A metamorfose é irreversível", "Wandy Luz", 2022, 25.00, 0);
		Livro l2 = new Livro("O Universo tem uma queda pelos corajosos", "Wandy Luz",2023, 25.00, 0);
		Livro l3 = new Livro("Dom Casmurro ","Machado de Assis",1899, 30.00, 0);
		   
		
		System.out.println("Digite o título do livro:");
		     titulo = leitor.nextLine();
		System.out.println("Digite o autor do livro:");
		     autor = leitor.nextLine();
	
		     
	    System.out.println(l3.exibirDetalhes()+ "\n\n");
	   // System.out.println(p2.exibirDetalhes());
	    //System.out.println(p3.exibirDetalhes());
	    
	    
	    //l3.setQuantidade(1);
	    //l3.setAno(10);
	    
	    System.out.println(l1.exibirDetalhes()+"\n\n");
	    
	    System.out.println("Receita do produto: " + l3.getTitulo() +
	    "\nValor R$:" + l3.receitaMonetaria());
	    
	    //metodos de acesso
	    //Getters - capturar o valor dos atributos
	    //ceteres - inserir valores no atributo
	    
	   

	}

}
