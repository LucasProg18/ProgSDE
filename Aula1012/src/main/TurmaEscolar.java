package main;

import java.util.ArrayList;
import java.util.Scanner;

public class TurmaEscolar {

    public static void main(String[] args) {
        // Criar um programa que cadastra os alunos de uma turma. O professor escreve os nomes dos alunos até digitar "SAIR". Imprimir na tela os alunos cadastrados.
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<String>();
        ArrayList<Double> notas = new ArrayList<Double>();
        
        while(true) {
            System.out.println("Digite o nome de um aluno(SAIR para encerrar):");
            String aluno = leitor.nextLine();
            
            
            
            if (aluno.equalsIgnoreCase("SAIR")) {
                break;
            }else {
                System.out.println("Aluno adicionado!");
                alunos.add(aluno);
                
                System.out.println("Digite a nota do aluno:");
                double nota = Double.parseDouble(leitor.nextLine());
                if (nota >= 0 && nota <= 10) {
                    System.out.println("Nota adicionada com sucesso!");
                    notas.add(nota);
                }else {
                    System.out.println("Nota inválida. Considerada como 0!");
                    notas.add(0.0);
                }
                
            }
        }
        double soma = 0;
        for (int i = 0; i < alunos.size(); i++){
            String nome = alunos.get(i);
            double nota = notas.get(i);
            
            System.out.println((i+1)+". " + nome + " - " + nota);    
            soma += nota;
        }
        
        double media = soma/notas.size();
        
        System.out.println("Média da turma é: "+media);

    }

}