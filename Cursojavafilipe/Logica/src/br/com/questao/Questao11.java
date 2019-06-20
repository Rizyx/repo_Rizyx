package br.com.questao;

import br.com.util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
	     double pag, paggar;
	     
	   pag = Teclado.lerDouble("digite o valor a ser pago");
	   paggar = pag * 1.10;
	   System.out.println("o valor com o adicional do garcom sera de " + paggar);
	}

}
