package br.com.questoes;

import br.com.util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		int numero = 0;
		int soma = 0;
		numero = Teclado.lerInt("digite o numero para a soma: ");
		for (int i = 0; i < numero; i++) {
			soma += i+1;
		}
		System.out.println(soma);
	}
}
