package br.com.questoes;

import br.com.util.Teclado;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome; 
		double salario; 
		int ali;
		
		for(int i = 0; i < 10 ; i++) {
			nome = Teclado.lerTexto("Digite um nome: ");
			salario = Teclado.lerDouble("Digite o salario: ");
			if(salario < 600) {
				ali = 0;
			} else if(salario < 1499.99) {
				ali = 10;
				salario -= salario * 0.1;
			} else {
				ali = 15;
				salario -= salario * 0.15;
			}
			System.out.println("Nome: " + nome);
			System.out.println("Aliquota(EM %): " + ali);
			System.out.println("Salario com Desconto: " + salario);
		}
	}
}