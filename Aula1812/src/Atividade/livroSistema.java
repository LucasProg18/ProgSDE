package Atividade;

public class livroSistema {
	private String titulo;
	private String autor; 
	private int AnoPublicacao;
	
	// ------------------- Construtores ------------------//
	public livroSistema() {}
	
	public livroSistema(String titulo, String autor, int AnoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.AnoPublicacao = AnoPublicacao;
	}
	
	// Gettter e Setters //
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return AnoPublicacao;
	}
	
	public void setAnoPublicacao(int AnoPublicacao) {
		this.AnoPublicacao = AnoPublicacao;
	}
	
	// -----------------------  Metodos ----------------------- //
	public void mostrarInfo() {
		System.out.println("-------------------------------");
		System.out.println("Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nAno de Publicação: " + AnoPublicacao);
	}
	
	public void verificarLivroAntigo() {
		int anoAtual = 2024;
		int resultado = anoAtual - AnoPublicacao;
		if (resultado > 50) {
			System.out.println("Esse livro foi publicado a mais de 50 anos");
		}
		else {
			System.out.println("Esse livro foi publicado a " + resultado + " anos");
		}
	}
}