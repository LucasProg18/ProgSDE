package main;

import java.util.ArrayList;
import java.util.Scanner;

public class NotaFiscal {

    public static void main(String[] args) {
        ArrayList<Double> valores = new ArrayList<Double>();
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
       
        double soma = 0;
        System.out.println("Nota Fiscal:");
       
        
        for (int i = 0; i < valores.size(); i++) {
        	System.out.printf("Produto %d - R$ %.2f%n", i + 1, valores.get(i));
            soma += valores.get(i);
            
            
                   
        }
        System.out.printf("Total: R$ %.2f%n", soma);

    }

}
