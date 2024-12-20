package main;

public class Palavra {

	public static void main(String[] args) {
		comecaVogal("Ana");
     }

	public static void comecaVogal(String palavra) {

		palavra = palavra.toLowerCase();

		if ("aeiou".contains(String.valueOf(palavra.charAt(0)))) {
		System.out.println("A palavra começa com vogal.");
		}else {
		System.out.println("A palavra começa com consoante.");
	   }

	  }
   }