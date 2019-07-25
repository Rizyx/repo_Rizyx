package br.com.questao;

import br.com.util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		double num1, num2, num3, num4, soma, mult;
		
		num1 = Teclado.lerDouble("digite o numero 1 ");
		num2 = Teclado.lerDouble("digite o numero 2 ");
		num3 = Teclado.lerDouble("digite o numero 3 ");
		num4 = Teclado.lerDouble("digite o numero 4 ");
		soma =num1 + num2 + num3 + num4;
		mult =num1 * num2 * num3 * num4;
		System.out.println("a soma dos numeros sera de : " + soma);
		System.out.println("a multiplicacao dos numeros sera de : " + mult);
		
		}

	}


