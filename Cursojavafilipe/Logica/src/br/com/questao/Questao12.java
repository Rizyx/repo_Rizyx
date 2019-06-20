package br.com.questao;

import br.com.util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		double hora, min, qtd;
		
		hora = Teclado.lerDouble("digite a hora do dia ");
		min =  Teclado.lerDouble("digite os minutos do dia ");
		qtd = (hora * 60) + min;
		System.out.println("a quantidade de minutos passados desde 0000am e de " + qtd + " minutos");
	}

}
