package senac;

public class Produto {
    //Atributos da classe
	private String nome;
	private double preco;
	private int quantidade;
	
	// Construtor Padrão
	public Produto(){}

	// Construtor Parametrizado 
	public Produto(String nome, double preco){
       this.nome = nome;
       this.preco = preco;

       
       }
	public Produto(String nome, double preco, int quantidade){
	       this.nome = nome;
	       this.preco = preco;
	       this.quantidade = quantidade;
	       
	       }

	//Método Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
		
	}
	
	public int getQuantidade() {
		return quantidade;
		
	}
	
	public void setNome(String nome){
	     this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//Métodos da classe
	public String exibirDetalhes(){
		System.out.println("************************************");
	 return "Nome: " + nome + "  " + "Preço:" + preco + " " + "Quantidade: " + quantidade;
	}
	 
	
	//Método para retornar a receita monetária do produto
	 public double receitaMonetaria(){
		 return preco * quantidade;
		 	 
	      }
	  }