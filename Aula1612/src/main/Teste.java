package main;

import java.util.ArrayList;

public class Teste {

		    public static void main(String[] args) {
		   ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		    	 Pessoa p1 = new Pessoa("Josefina", 30, 1.7, 60.5);
		    	 Pessoa p2 = new Pessoa("Maria", 32, 1.53, 49);
		    	 Pessoa p3 = new Pessoa("Carlos", 40, 1.8, 70);
		    	 Pessoa p4 = new Pessoa("Ana", 62, 1.6, 60);
		    	 Pessoa p5 = new Pessoa("Marcia", 52, 1.6, 50);
		    	 
		    	 pessoas.add(p1);
		         pessoas.add(p2);
		         pessoas.add(p3);
		         pessoas.add(p4);
		         pessoas.add(p5);
		         
		              
		    for (Pessoa p : pessoas) {
	            System.out.println("Nome: " + p.nome);
	            System.out.println("Idade: " + p.idade);
	            System.out.println("Altura: " + p.altura);
	            System.out.println("Peso: " + p.peso);
	            System.out.println("---------------------------");
	        }
	    }
	}
		    
		    
