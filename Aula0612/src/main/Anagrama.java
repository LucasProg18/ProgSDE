
package main;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String palavra1, palavra2;
        String palavra1Organizado, palavra2Organizado;
        
        System.out.println("Digite a primeira palavra: ");
        palavra1 = leitor.nextLine().toLowerCase();
        
        System.out.println("Digite a segunda palavra: ");
        palavra2 = leitor.nextLine().toLowerCase();
        
        char[] palavra1Letras = palavra1.toCharArray();
        char[] palavra2Letras = palavra2.toCharArray();
        Arrays.sort(palavra1Letras);
        Arrays.sort(palavra2Letras);
        
        palavra1Organizado = new String(palavra1Letras);
        palavra2Organizado = new String(palavra2Letras);
        
        System.out.println(palavra1Organizado + " > " + palavra2Organizado);
        
        if (palavra1Organizado.equalsIgnoreCase(palavra2Organizado)) {
            System.out.println("As palavras são um anagrama!");
        }else {
            System.out.println("Não é anagrama.");
        }
    }
}