package br.com.questao;

import br.com.util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		double sal, salinc;
		
		sal = Teclado.lerDouble("digite o salario do funcionario ");
		salinc = sal * 1.15;
		System.out.println("o salario desse funcionario com um aumento de 15% sera de " + salinc);	

	}

}