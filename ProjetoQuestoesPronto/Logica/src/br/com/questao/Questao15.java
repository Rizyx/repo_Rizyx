package br.com.questao;

import br.com.util.Teclado;

public class Questao15 {

	public static void main(String[] args) {
		double num1, num2, soma, sub1, sub2, mult, div1, resto;
		num1 = Teclado.lerDouble("digite o primeiro numero ");
		num2 = Teclado.lerDouble("digite o segundo numero ");
		soma = num1 + num2;
		sub1 = num1 - num2;
		sub2 = num2 - num1;
		mult = num1 * num2;
		div1 = num1 / num2;
		resto = num1 % num2;
		System.out.println("os resultado da soma e de " + soma);
		System.out.println("os resultado da subtracao1 e de " + sub1);
		System.out.println("os resultado da subtracao2 e de " + sub2);
		System.out.println("os resultado da multiplicacao e de " + mult);
		System.out.println("os resultado da divisao e de " + div1);
		System.out.println("os resultado da sobra e de " + resto);
	}

}
