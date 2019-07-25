package br.com.questao;

import br.com.util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		double num1, num2, num3, media;
		num1 = Teclado.lerInt("digite o numero 1 ");
		num2 = Teclado.lerInt("digite o numero 2 ");
		num3 = Teclado.lerInt("digite o numero 3 ");
		media = (num1 + num2 + num3) /3;
		System.out.println("a media aritmetica desses numeros sera de " + media);
	}

}
