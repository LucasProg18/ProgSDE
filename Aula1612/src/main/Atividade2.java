package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {

			public static void main(String[]args) {
		     
				
				 ArrayList<Integer> lista = new ArrayList<Integer>();
				  
				 lista.add(10);
				 lista.add(50);
				 lista.add(75);
				 
				System.out.println(menorNumero(lista));
				
			}
				
				public static int  menorNumero(ArrayList<Integer>numeros) {
			    
			    int menor = numeros.get(0), numero;
			    
			    for (int i = 0; i < numeros.size(); i++){
			    	   numero = numeros.get(i);
			    	   
			    	   if (numero < menor) {
			    	       menor = numero;
			    	       
			    	   }
			    }
			       return menor;


	}

}
