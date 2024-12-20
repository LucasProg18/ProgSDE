package main;
import java.util.ArrayList;
import java.util.Collections;

public class Teste1 {

	public static void main(String[] args) {
		ArrayList<String> nomes = new  ArrayList<String>();
		
		nomes.add("Joaquim");
		nomes.get(0);> Joaquim;
		nomes.set(0,"Luciano");
		nomes.remove(0)/nomes.remove("Luciano");
		
		Collections.sort(nomes);
		
		for (int i = 0; i< nomes.size();i++) {
			
		}
		
		for(String nome: nomes) {
			System.out.println(nome);
			
		}
	}
}


