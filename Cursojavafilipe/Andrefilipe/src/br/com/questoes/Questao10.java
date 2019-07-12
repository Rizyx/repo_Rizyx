package br.com.questoes;

import br.com.util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		double num =0;
		num = Teclado.lerDouble("digite o numero a ser fatorado: ");
		for (double i = num-1; i > 0; i--) {
			num = num * i;
		}
		System.out.println(num);
	}
}
