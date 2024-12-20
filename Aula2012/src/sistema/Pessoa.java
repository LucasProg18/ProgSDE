package sistema;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String cpf;
	private double peso;
	private double altura;
	
	// --------------------------- Construtores -------------------------------- //
	public Pessoa(String nome, String dataNascimento, String cpf, double peso, double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.peso = peso;
		this.altura = altura;
	}
	// ------------------------- Getters e Setters ---------------------------- //

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void mostrarPessoa() {  
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Peso: " + this.peso);
		System.out.println("Altura: " + this.altura);
	}
}
