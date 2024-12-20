package main;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		 
		 ola();
    	 ola();
    	 ola(); 
	     }
    	 public static void ola() {
    		 Scanner leitor = new Scanner(System.in); 
    		 System.out.println("Olá ,Digite seu nome:");
             String nome = leitor.nextLine();
             
             System.out.println("Olá,"+nome);
    	 }   
             
	}


