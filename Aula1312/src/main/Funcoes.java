package main;

public class Funcoes {

	public static void main(String[] args) {
	      exibirHelloWorld( );
	        exibirHello("João");
	        int variavel = soma(50,60);
	   }
	
	
	    // Função que exibe "Hello World"
	    public static void exibirHelloWorld() {
	        System.out.println("Hello World");
	    }
	
       //Chamando a função com um nome
     // Função que recebe um nome e exibe "Hello {nome}"
   public static void exibirHello(String nome) {
       System.out.println("Hello " + nome);
      }
    
//agora eu quero que crie uma função que recebe dois numeros e retorna 
 //a soma desses dois numeros

     public static int soma(int a , int b) {
    	 int resultado = a + b;
    	 return resultado;
     
           } 
        } 
