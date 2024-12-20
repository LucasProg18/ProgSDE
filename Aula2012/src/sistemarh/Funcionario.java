package sistemarh;

public class Funcionario extends Pessoa{
	 private String cargo;
	 private Double salario;
	
	public Funcionario(String nome,String cpf,
			Double salario, String cargo) {
	super(nome,dataDeNascimento,cpf,peso,altura);
	
	    this.cargo = cargo;
		this.salario = salario;
		
	}

          public String getCargo() {
        	  return cargo;
          }
          
          public void setCargo(String cargo) {
        	  this.cargo = cargo;
          }
          public  Double getSalario() {
        	  return salario;
        	  
          }
          
          
          public void setSalario(double salario) {
        	  this.salario = salario;
          }
     }



