package main;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFuncionarios {

public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
int opcao;
String funcionario;
ArrayList<String> funcionarios = new ArrayList<String>();

while (true) {
System.out.println("========================");
System.out.println("          MENU          ");
System.out.println("========================");
System.out.println("1. Inserir Funcionário");
System.out.println("2. Ver Funcionários");
System.out.println("3. Alterar Funcionário");
System.out.println("4. Remover Funcionário");
System.out.println("0. Sair");
System.out.println(" ");
System.out.println("Digite o número da opção desejada:");
opcao = Integer.parseInt(leitor.nextLine());
// Criar lista de funcionarios no começo do programa
// Ao selecionar opção 1, pedir nome do funcionário e adicionar ele na lista
if (opcao == 1) {
System.out.println("-----Inserir Funcionário-----");
System.out.println("Digite o nome do novo funcionário:");
funcionario = leitor.nextLine();
funcionarios.add(funcionario);
} else if (opcao == 2) {
//Mostrar os funcionários cadastrados
//Mostrar um por linha de forma numerada
System.out.println("-----Ver Funcionários-----");

for (int i = 0; i < funcionarios.size(); i++) {
String funcionarioAtual = funcionarios.get(i);
System.out.println((i+1)+". "+funcionarioAtual);

}



} else if (opcao == 3) {
System.out.println("Você escolheu \"Alterar Funcionário\"");
} else if (opcao == 4) {
System.out.println("Você escolheu \"Remover Funcionário\"");
} else if (opcao == 0) {
System.out.println("Saindo do programa...");
break;
} else {
System.out.println("Opção inválida!");
}
System.out.println("TECLE ENTER PARA CONTINUAR");
leitor.nextLine();
}
}

}