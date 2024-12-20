package biblioteca;

public class Livro {
	
	    public String titulo;
	    public String autor;
	    public String editora;
	    public int estoque;
	    
	    public Livro(String titulo, String autor, String editora, int estoque) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.editora = editora;
	        this.estoque = estoque;
	    }
		
		public void mostrarInformacoes() {
			System.out.println("##############");
			System.out.println("TÃ­tulo: "+ this.titulo);
			System.out.println("Autor: "+ this.autor);
			System.out.println("Editora: "+ this.editora);
			System.out.println("Estoque: "+ this.estoque);
		}
	}