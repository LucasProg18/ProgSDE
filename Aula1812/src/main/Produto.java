package main;

public class Produto {
	// Atributos da classe //
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {}
	
	// Construtor com parametro
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrice() {
		return preco;
	}
	public void setPrice(double price) {
		this.preco = price;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	// Métodos da classe //
	public String exibirDetalhes() {
		System.out.println("---------------------------------");
		String resultado = "Nome: " + this.nome + "\nPreço: " + this.preco + "\nQuantidade: " + this.quantidade;
		return resultado;
	}
	
	public double valorTotal() {
		return preco * quantidade;
	}
}
