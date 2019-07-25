package br.com.questao;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		double temp, celc;
		
		temp = Teclado.lerDouble("digite uma temperatura em Fahrenheit ");
		celc = ((temp - 32) * 5 / 9);
		System.out.println("essa temperatura em celsius sera de " + celc);

	}

}
