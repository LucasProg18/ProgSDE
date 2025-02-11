package main;

import java.util.ArrayList;

public class Colecoes {

	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<String>();
		frutas.add("Banana");
		frutas.add("Abacaxi");
		frutas.add("Maça");
		frutas.add("Abacate");
		frutas.add("Melancia");
		
		frutas.set(3, "Graviola");
		System.out.println(frutas.get("Maça"));
		
		
}
