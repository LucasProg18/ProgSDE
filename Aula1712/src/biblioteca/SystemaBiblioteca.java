package biblioteca;

public class SystemaBiblioteca {

	public static void main(String[] args) {

		Livro l1 = new Livro("É assim que acaba", "Collen Hoover", "Galera", 10);
		
		System.out.printf("Titulo: %s \nAutor: %s \nEditora: %s \nEstoque: %d", l1.titulo, l1.autor, l1.editora, l1.estoque);
	}

}
