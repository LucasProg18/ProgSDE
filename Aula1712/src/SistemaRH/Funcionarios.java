package SistemaRH;

public class Funcionarios {
	public String nome;
	public String cargo;
	public String departamento;
	public double salario;
	
	public Funcionarios(String nome, String cargo, String departamento, double salario){
		this.nome = nome;
		this.cargo = cargo;
		this.departamento = departamento;
		this.salario = salario;
	}
	
	public void mostrarFuncionario() {
		System.out.print("----------------------------------------------\n");
		System.out.printf("Nome: %s \nCargo: %s \nDepartamento: %s \nSalario: %.2f\n", this.nome, this.cargo, this.departamento, this.salario);
	}
}
