package sistema;

public class GerenciamentoPessoas {

	public static void main(String[] args) {
		Funcionarios f1 = new Funcionarios("Lucas", "2007/10/18", "10100110", 70, 1.76, "Senior", 9000);
		
		f1.mostrarInformações();
		System.out.println("---------------------------------------------------");
		f1.mostrarPessoa();
	}

}
