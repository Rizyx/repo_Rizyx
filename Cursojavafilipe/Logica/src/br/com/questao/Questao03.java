package br.com.questao;

import br.com.util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		double val,exc;
		
		val = Teclado.lerDouble("digite o valor ");
		exc = val * 3.80;
		System.out.println("o valor em reais sera de " + exc);

	}

}
