package br.com.questao;

import br.com.util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		String nome, sexo;
		nome = Teclado.lerTexto("digite seu nome: ");
		sexo = Teclado.lerTexto("digite seu sexo: ");
		
		System.out.println("o nome informado foi " + nome );
		System.out.println("o sexo informado foi " + sexo );
	}

}
