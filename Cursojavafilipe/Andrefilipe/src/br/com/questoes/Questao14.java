package br.com.questoes;

import br.com.util.Teclado;

public class Questao14 {

	public static void main(String[] args) {
		String nome[] = new String[5];
		double nota1[] = new double[5];
		double nota2[] = new double[5];
		double media[] = new double[5];
		double mediaturma = 0;
		for (int i = 0; i < nome.length; i++) {
			nome[i] = Teclado.lerTexto("digite o nome do aluno: ");
			nota1[i] = Teclado.lerDouble("digite a nota numero 1 do aluno: ");
			nota2[i] = Teclado.lerDouble("digite a nota numero 2 do aluno: ");
			media[i] = (nota1[i] + nota2[i]) /2;
			mediaturma = mediaturma + media[i];
		}
		for (int i = 0; i < media.length; i++) {
			if (media[i] >= 5) {				
				System.out.println("aprovado");
			}
			else {
				System.out.println("reprovado");
			}
		}
		mediaturma = mediaturma/5;
		System.out.println(mediaturma);
	}

}
