package br.com.questao;

import br.com.util.Teclado;

public class Questao18 {

	public static void main(String[] args) {
		double preco, porc, precov;
		preco = Teclado.lerDouble("digite o valor do produto ");
		porc = Teclado.lerDouble("digite o valor da porcentagem ");
		precov = preco + (preco * (porc / 100));
		System.out.println("o valor de venda do produto sera de " + precov);
		

	}

}