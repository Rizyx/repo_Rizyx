package br.com.questoes;

import br.com.util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = Teclado.lerInt("Digite um numero: ");
		double polegada;
		for(int i = 1; i < num + 1; i++) {
			polegada = i * 2.54;
			System.out.println(polegada);
		}
	}
}