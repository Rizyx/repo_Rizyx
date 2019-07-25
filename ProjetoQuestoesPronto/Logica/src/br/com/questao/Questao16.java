package br.com.questao;

import br.com.util.Teclado;

public class Questao16 {

	public static void main(String[] args) {
		String nome;
		double salf, vend, com, salcom;
		nome = Teclado.lerTexto("digite o nome do vendedor ");
		salf = Teclado.lerDouble("digite o salario fixo do vendedor ");
		vend = Teclado.lerDouble("digite o total em vendas do vendedor em dinheiro ");
		com = vend * 0.15;
		salcom = salf + com;
		System.out.println("o vendedor " + nome + " tem o salario fixo de " + salf + " recebera de comissao " + com + " ficando com o salario de " + salcom);
	}

}
