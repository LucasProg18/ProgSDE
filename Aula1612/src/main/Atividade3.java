package main;

public class Atividade3 {

	public static void main(String[] args) {
		verificarPrimo(7);
		verificarPrimo(10);
		
	}
    
	public static void verificarPrimo(int n) {
		
		if (n <= 1) {
			
			System.out.println(n + "não é primo.");
			return;
		}
	
		 for (int i = 2 ; i <= Math.sqrt(n); i++) {
			 if (n% i == 0) {
				 System.out.println (n + " não é primo");
				 return;
			 }
		 
            System.out.println(n + " é primo.");
       }
    }
}
