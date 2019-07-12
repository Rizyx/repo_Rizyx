package br.com.questoes;

import br.com.util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tabu = 0;
		int num;
		num = Teclado.lerInt("Digite um Numero: ");
		
		for(int i = 0; i < 11; i++) {
			tabu = i * num;
			System.out.println(tabu);
		}
	}
}