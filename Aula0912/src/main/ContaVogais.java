package main;

import java.util.Scanner;

public class ContaVogais {
//    •Atividade 1 - Crie um programa que conta quantas vogais (considerar maiúsculas e minúsculas) possui um nome qualquer.
//    Desafio: Exiba as vogais encontradas ao final
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtdVogais = 0, qtdConsoantes = 0;
        String vogaisEncontradas = "";
        
        System.out.println("Digite um nome:");
        String nome = leitor.nextLine();
        
        // Verificar o nome e contar número de vogais
        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.toLowerCase().charAt(i);
            
            if (Character.isLetter(letra)) {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    qtdVogais++;
                    
                    vogaisEncontradas += letra;
                } else {
                    qtdConsoantes++;
                }
            }
            
//            if (Character.isLetter(letra) && "aeiouAEIOU".contains(String.valueOf(letra))) {
//                qtdVogais++;
//            }
            
        }
        
        System.out.println("A quantidade de vogais encontradas foi: "+ qtdVogais);
        System.out.println("Vogais encontradas:"+vogaisEncontradas);
        System.out.println("A quantidade de consoantes encontradas foi: "+ qtdConsoantes);
        }
    }