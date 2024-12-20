package senac;

public class Main {

	public static void main(String[] args) {
		
		//Produto p1 = new Produto("Monitor AOC 21", 499.99, 15);
		//Produto p2 = new Produto("Mouse", 49.99);
		//Produto p3 = new Produto("Gabinete",100.00,10);
        
	    
	  //  System.out.println(p1.exibirDetalhes()+ "\n\n");
	   // System.out.println(p2.exibirDetalhes());
	    //System.out.println(p3.exibirDetalhes());
	    
	   // p1.setPreco(499.99*1.1);
	   // p1.setQuantidade(20);
	    
	   
	    
	    ProdutoHigiene ph1 = new ProdutoHigiene();
	    ph1.setNome("Sabonete");
	    ph1.setPreco(2.99);
	    ph1.setQuantidade(10);
	    
	    ProdutoHigiene ph2 = new ProdutoHigiene();
	    ph2.setNome("Shampoo");
	    ph2.setPreco(16.00);
	    ph2.setQuantidade(30);
	    
	   System.out.println(ph1.exibirDetalhes());
	   System.out.println(ph2.exibirDetalhes());
	    
	   // System.out.println("Receita do produto: " + p1.getNome() +
	   // "\nValor R$:" + p1.receitaMonetaria());
	    
	    //metodos de acesso
	    //Getters - capturar o valor dos atributos
	    //ceteres - inserir valores no atributo
	    
	    }
	    
	}


