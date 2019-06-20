package br.com.questao;

import br.com.util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		int val;
		
		val = Teclado.lerInt("digite o numero ");
		System.out.println("o antecessor desse numero e " + (val-1) + " e seu sucessor e " + (val+1));

	}

}
