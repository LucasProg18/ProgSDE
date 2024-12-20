package senac;

import java.time.Year;

public class Livro {
	
	//Atributos da classe
		 private String titulo;
		  private String autor;
		  private int ano;
		  private double preco;
	       private int quantidade;
		
		// Construtor Padrão
		public Livro(){}

		// Construtor Parametrizado 
		public Livro(String titulo,String autor, int ano, double preco, int quantidade){
	       this.titulo = titulo;
	       this.autor = autor;
	       this.ano = ano;
	       this.preco = preco;
	       this.quantidade = quantidade;
	       
		       }
		
		//Método Getters e Setters
		public String getTitulo() {
			return titulo;
		}
		
		public String getAutor() {
			return autor;
			
		}
		
		public int getAno() {
			return ano;
			
		}
		public double getPreco() {
			return preco;
			
		}
		public int getQuantidade() {
			return quantidade;
			
		}
		public void setTitulo(String titulo){
		     this.titulo = titulo;
		}
		
		public void setAutor(String autor) {
			this.autor = autor;
		}
		
		public void setAno(int ano) {
			this.ano = ano;
		}
		
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		//Métodos da classe
		public String exibirDetalhes(){
		 return "Título: " + titulo + "  " + "Autor:" + autor + "  " + "Ano: " + ano +" "+ "Preço:"+ preco+" "+"Quantidade:"+ quantidade;
		}
		
		//Método para retornar a receita monetária do produto
		 public double receitaMonetaria(){
			 return preco * quantidade;
		}


         public boolean verificarLivroAntigo() {
           int anoPublicacao = 1890; 
           int anoAtual = Year.now().getValue();
    
         
           if (anoAtual - anoPublicacao > 50) {
        	   
            System.out.println("O livro tem mais de 50 anos.");
        	   } else {
            System.out.println("O livro tem menos de 50 anos.");   

            }
		     return false;
      }
   }