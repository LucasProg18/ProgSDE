package sistemarh;


	public class Cliente extends Pessoa {
		
		private String formaDePagamento;
		
		public Cliente(String nome, String dataDeNascimento, String cpf, double peso, double altura, String formaDePagamento) {
			super(nome, dataDeNascimento, cpf, peso, altura);
			this.formaDePagamento = formaDePagamento;
		}

		public String getFormaDePagamento() {
			return formaDePagamento;
		}

		public void setFormaDePagamento(String formaDePagamento) {
			this.formaDePagamento = formaDePagamento;
		}
		
		@override
		public void mostrarInformacoes() {
			super.mostrarInformacoes();
			
			System.out.println("#### Informações Adicionais####");
			System.out.println("Nome:"+ this.nome);
			System.out.println("Data de Nascimento:"+ this.dataDeNascimento);
			System.out.println("CPF:"+ this.cpf);
			System.out.println("Peso:"+ this.peso + "kg");
			System.out.println("Altura:"+ this.altura + "m");
			
		}
		
	}

