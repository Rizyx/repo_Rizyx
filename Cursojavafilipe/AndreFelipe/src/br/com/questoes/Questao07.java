package br.com.questoes;

public class Questao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma = 0;
		for(int i = 3; i < 21 ; i++) {
			if(i % 2 == 0) {
				soma += i;
				System.out.println(soma);
			}
		}	
	}
}