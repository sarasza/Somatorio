package Atividade;

public class Somatorio {
	
	public static void main(String [] args) {
		int n = 3;
		System.out.println("Somatório de " +n+ ": " + somatorio(n));		
	}
	
	public static int somatorio(int numero) {
		if(numero == 0) {
			return 0;
		}
		else {
			return somatorio(numero - 1) + numero;
		}
	}
}
