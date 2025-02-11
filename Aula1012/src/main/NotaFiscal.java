package main;

import java.util.ArrayList;
import java.util.Scanner;

public class NotaFiscal {

    public static void main(String[] args) {
        ArrayList<Double> valores = new ArrayList<Double>();
<<<<<<< HEAD
        ArrayList<Integer> quantidades = new ArrayList<Integer>();
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome do produto (SAIR para encerrar): ");
            String nome = leitor.nextLine();
            
            
            if (nome.equalsIgnoreCase("SAIR")) {
                System.out.println("Encerrando carrinho de compras...");
                break;
            }else {
                System.out.print("Digite um preço: R$");
                double valor = Double.parseDouble(leitor.nextLine());
                
                System.out.print("Digite a quantidade:");
                int quantidade = Integer.parseInt(leitor.nextLine());
                
                nomes.add(nome);
                valores.add(valor);
                quantidades.add(quantidade);
            }
=======
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um preço: R$");

            double valor = Double.valueOf(leitor.nextLine());

            if (valor == 0) {
                System.out.println("Encerrando Carrinho de Compras");
                break;
                
                
                
            } else {
                valores.add(valor);
            }
            
>>>>>>> f4a2652d7803581eb1a0b814777a85b49f0d152f
        }
        //Imprima no seguinte formato
        
//        Nota Fiscal:
//            
//        Produto 1 - R$ {valor1}
//        Produto 2 - R$ {valor2}
//        .
//        .
//        .
//        Total: R$ {soma}
<<<<<<< HEAD
        double soma = 0;
        
        System.out.println("Nota Fiscal: ");
        
        System.out.println("Nome | Preço | Quantidade | Total");
        
        for (int i = 0; i < valores.size(); i++) {
//            System.out.println("Produto "+(i+1)+" - R$ "+valores.get(i));
            
            System.out.printf("%s - R$ %.2f - %d - R$ %.2f\n",nomes.get(i),valores.get(i), quantidades.get(i), (valores.get(i)*quantidades.get(i)));
            
            soma += valores.get(i)*quantidades.get(i);
        }
        
        System.out.printf("Total: R$ %.2f \n",soma);
=======
       
        double soma = 0;
        System.out.println("Nota Fiscal:");
       
        
        for (int i = 0; i < valores.size(); i++) {
        	System.out.printf("Produto %d - R$ %.2f%n", i + 1, valores.get(i));
            soma += valores.get(i);
            
            
                   
        }
        System.out.printf("Total: R$ %.2f%n", soma);
>>>>>>> f4a2652d7803581eb1a0b814777a85b49f0d152f

    }

}
<<<<<<< HEAD
  
=======
>>>>>>> f4a2652d7803581eb1a0b814777a85b49f0d152f
