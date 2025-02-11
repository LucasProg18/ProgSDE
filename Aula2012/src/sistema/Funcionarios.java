package sistema;

public class Funcionarios extends Pessoa{
	private String cargo;
	private double salario;
	public Funcionarios(String nome, String dataNascimento, String cpf, double peso, double altura, String cargo, double salario) { 
		super(nome, dataNascimento, cpf, peso, altura);
		
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public String getCargo() {  
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() { 
		return salario;
	}
	public void setSalario(double salario, String senha) {  
		if (senha.equals("1234")) {  
			System.out.println("Salario trocado com sucesso");
			this.salario = salario;
		}
		else {  
			System.out.println("Acesso negado \nSalario continua o mesmo: "  + getSalario());
		}
	}
	
	public void mostrarInformações() {  
		mostrarPessoa();
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Salario: " + this.salario);
	}
}
