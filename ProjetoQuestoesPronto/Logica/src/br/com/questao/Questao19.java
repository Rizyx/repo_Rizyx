package br.com.questao;

import br.com.util.Teclado;

public class Questao19 {

	public static void main(String[] args) {
		int ano, mes, dia, total;
		ano = Teclado.lerInt("digite quantos anos voce tem ");
		mes = Teclado.lerInt("digite quantos meses voce tem ");
		dia = Teclado.lerInt("digite quantos dias voce tem ");
		total = (ano * 365) + (mes * 30) + dia;
		System.out.println("sua idade em dias e de " + total);
	}
}
