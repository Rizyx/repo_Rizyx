package br.com.questao;

import br.com.util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		double alt, qk, altcm, qg;
		alt = Teclado.lerDouble("digite sua altura ");
		qk = Teclado.lerDouble("digite seu peso ");
		altcm = alt * 100;
		qg = qk * 1000;
		System.out.println("a altura em centimetros e de " + altcm);
		System.out.println("o peso em gramas e de " + qg);

	}

}
