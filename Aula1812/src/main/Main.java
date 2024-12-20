package main;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto("Mouse atlantis", 400);
		Produto p3 = new Produto("Notebook", 4500, 10);
		
		System.out.println(p3.exibirDetalhes() + "\nTotal: " + p3.valorTotal());
		
		p3.setPrice(4500 * 1.1);
		System.out.println(p3.exibirDetalhes() + "\nTotal: " + p3.valorTotal());
	}

}
