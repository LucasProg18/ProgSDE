package sistemarh;

public class Funcionario {

	public static void main(String[] args) {
		
		public String nome;
		public String cargo;
		public double salario;
		public String departamento;

		public Funcionario (String nome, String cargo, double salario, String departamento) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.departamento = departamento;
		}		

		public void mostrarInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Salário: R$" + this.salario);
		System.out.println("Departamento: " + this.departamento);
		}
}