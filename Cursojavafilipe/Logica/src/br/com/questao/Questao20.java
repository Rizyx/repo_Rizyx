package br.com.questao;

import br.com.util.Teclado;

public class Questao20 {

	public static void main(String[] args) {
		double total, branco, nulo, valido, relb, reln, relv;
		total = Teclado.lerInt("digite o numero de votadores no municipio ");
		branco = Teclado.lerInt("digite o numero de votos em branco ");
		nulo = Teclado.lerInt("digite a quantidade de votos nulos ");
		valido = Teclado.lerInt("digite a quantidade de votos validos ");
		relb = (branco / total) * 100; 
		reln = (nulo / total) * 100; 
		relv = (valido / total) * 100;
		System.out.println("a relacao de votos branco sobre o total e de " + relb + "%");
		System.out.println("a relacao de votos nulos sobre o total e de " + reln + "%");
		System.out.println("a relacao de votos validos sobre o total e de " + relv + "%");
		

	}

}
