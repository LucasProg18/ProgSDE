
package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atividade4{

public static void main(String[] args) {

ArrayList<Integer> lista = new ArrayList<Integer>();
lista.add(50);
lista.add(20);
lista.add(30);

ArrayList<Integer> outraLista = new ArrayList<Integer>(List.of(1,50,23,12,34,43,-10,200));

System.out.println("O menor número da outra lista é: "+ menorNumero(outraLista));
System.out.println("A soma dos números é: "+somaNumeros(outraLista));

int idade = Integer.parseInt(entrada("Digite sua idade:"));

System.out.println("Bem vindo, "+idade);


}
// 20 , 50 , 30 , 40 , 30

// 200, 10, 20, 50, 60
public static int maiorNumero(ArrayList<Integer> numeros) {
int maior = numeros.get(0);

for (int i = 0; i < numeros.size(); i++) {
int numero = numeros.get(i);

if (numero > maior) {
maior = numero;
}
}

return maior;

}
// 50, 60, 70, 30
public static int menorNumero(ArrayList<Integer> numeros) {
int menor = numeros.get(0);

for (int i = 0; i < numeros.size(); i++) {
int numero = numeros.get(i);

if (numero < menor) {
menor = numero;
}

}

return menor;

}

public static void ehPrimo(int numero) {
int divisores = 0;

for (int i = 2; i < numero;i++) {
if (numero % i == 0) {
divisores++;
break;
}
}

if (divisores > 0) {
System.out.println("Esse número não é primo!");
}
else {
System.out.println("Esse número é primo!");
}

}

public static int somaNumeros (ArrayList<Integer> numeros) {
int soma = 0;

for (int i = 0; i < numeros.size(); i++) {
int numero = numeros.get(i);
soma += numero;
}

return soma;
   }
  
public static String entrada (String rotulo) {
Scanner leitor = new Scanner(System.in);

System.out.println(rotulo);

String resposta = leitor.nextLine();

return resposta;
}
}

