package sistemarh;

public class Pessoa {

	private String nome;
	private String dataDeNascimento;
	private String cpf;
	private double peso;
	private double altura;

	public Pessoa(String nome, String dataDeNascimento, String cpf, double peso, double altura) {
	this.nome = nome;
	this.dataDeNascimento = dataDeNascimento;
	this.cpf = cpf;
	this.peso = peso;
	this.altura = altura;
	}

	public String getNome() {
	return nome;
	}

	public void setNome(String nome) {
	this.nome = nome;
	}

	public String getDataDeNascimento() {
	return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
	this.dataDeNascimento = dataDeNascimento;
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


	public void mostrarInformacoes() {
		System.out.println("#####Informações Pessoais#####");
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: "+ this.dataDeNascimento);
		System.out.println("CPF: "+ this.cpf);
		System.out.println("Peso: "+ this.peso + "kg");
		System.out.println("Altura: "+ this.altura +"m");
	    
	   }
	}