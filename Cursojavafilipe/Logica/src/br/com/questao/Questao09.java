package br.com.questao;

import br.com.util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		int num;
		num = Teclado.lerInt("digite um numero ");
		System.out.println("o  numero digitado foi " + num);
		System.out.println("o quadrado desse numero e " + Math.pow(num, 2));
		System.out.println("a raiz quadrada desse numero e de " + Math.sqrt(num));
	}
}


