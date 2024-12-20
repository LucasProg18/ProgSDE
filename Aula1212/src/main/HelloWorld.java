package main;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Scanner leitor = new Scanner(System.in);
//        
//        System.out.println("Digite seu nome:");
//        String nome = leitor.nextLine();
//        
//        System.out.println("Digite sua idade:");
//        int idade = leitor.nextInt();
//        
//        verificarEntrada(nome, idade);
        
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número 1:");
        int a = leitor.nextInt();
        System.out.println("Digite o número 2:");
        int b = leitor.nextInt();
        
        System.out.println("Resultado: "+ dividir(a,b));
        
    }
    
    public static double dividir (int num1, int num2) {
        if (num2 != 0) {
        double resultado = (double) num1/ num2;
        
        return resultado;
        } else {
            System.out.println("Tentativa de divisão por zero!");
            return 0;
        }
        
    }
    
    
    public static void ola() {
        
        System.out.println("Olá Mundo!");

    }
    
    //Crie um função chamada olaFulano. Essa função pede o nome da pessoa e imprime na tela "Olá, {nome}!" . Execute pelo menos 3 vezes a função.
    
    public static void verificarEntrada(String nome, int idade) {
        
        System.out.println("Olá, "+nome+"!");
        
        if (idade >= 18) {
            System.out.println("Acesso Liberado!");
        }else {
            System.out.println("Acesso Negado!");
        }
        
    }
    
    // Crie uma função chamada Soma. Essa função RECEBE dois números inteiros e imprime na tela a soma desses números. Execute 5 somas.
    
    public static int soma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
    

}