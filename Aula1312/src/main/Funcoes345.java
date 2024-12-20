package main;

import java.util.Scanner;

public class Funcoes345 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        int idade = Integer.parseInt(leitor.nextLine());
        
        if (ehMaiorDeIdadeAlternativo(idade)) {
            System.out.println("Digite seu nome:");
            String nome = leitor.nextLine();
            
            olaNome(nome);
        }else {
            System.out.println("Acesso Negado!");
        }  
        
    }
    
    public static void ola() {
        System.out.println("Hello World!");
    }
    
    public static void olaNome(String nome) {
        System.out.println("Seja bem vindo, "+ nome+"!" );
    }
    
    public static int soma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
    
    public static boolean ehPar (int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
        
    public static void ehMaiorDeIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Essa pessoa é maior de idade!");
        }else if (idade < 18 && idade >= 0) {
            System.out.println("Essa pessoa é menor de idade!");
        }
        else {
            System.out.println("Alienigena!");
        }
    }
    
    public static boolean ehMaiorDeIdadeAlternativo(int idade) {
        if (idade >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
    
}