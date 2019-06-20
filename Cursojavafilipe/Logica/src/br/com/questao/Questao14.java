package br.com.questao;

import br.com.util.Teclado;

public class Questao14 {

	public static void main(String[] args) {
		double alt, qk, imc;
		alt = Teclado.lerDouble("digite sua altura ");
		qk = Teclado.lerDouble("digite seu peso ");
		imc = qk / Math.pow(alt, 2);
		System.out.println("o indice imc desta pessoa e de " + imc);

	}

}
