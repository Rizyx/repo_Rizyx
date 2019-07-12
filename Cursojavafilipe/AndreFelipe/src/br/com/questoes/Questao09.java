package br.com.questoes;

import br.com.util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = Teclado.lerInt("Digite um numero: ");
		
		for(int i = 1; i < num; i++) {
			if(i % 3 == 0 && i % 5 == 0 ) {
				System.out.println(i);
			}
		}
	}
}