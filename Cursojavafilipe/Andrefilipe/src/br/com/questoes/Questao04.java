package br.com.questoes;

public class Questao04 {

	public static void main(String[] args) {
		int max = 5;
		int numero = 50;
		for (numero = 49 ;numero > 0; numero--) {
			if (numero % max == 0 ) {
				System.out.println(numero);
			}			
		}
	}
}
