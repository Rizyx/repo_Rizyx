package br.com.questao;

import br.com.util.Teclado;

public class Questao17 {

	public static void main(String[] args) {
		double val, prest, valprest;
		val = Teclado.lerDouble("digite o valor do produto ");
		prest = Teclado.lerDouble("digite o numero de prestacoes em que sera pago ");
		valprest = val / prest;
		System.out.println("o valor das prestacoes sera de " + valprest);

	}

}
