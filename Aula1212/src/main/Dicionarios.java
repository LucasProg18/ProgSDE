package main;

import java.util.HashMap;

public class Dicionarios {

	public static void main(String[] args) {
		HashMap<String, String> funcionario = new HashMap<String,String>();
		
		funcionario.put("nome","Maria");
		
		funcionario.put("salário","2824");
		
		funcionario.put("cargo","Marketing Digital");
		
	
		System.out.println(funcionario.get("nome"));

		System.out.println(funcionario.get("salário"));

		System.out.println(funcionario.get("cargo"));
        }
	}
