package br.com.questoes;
import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		double b , e ,total = 0;
		b = Teclado.lerDouble("digite o numero exponenciado: ");
		e = Teclado.lerDouble("digite o expoente: ");
		total = b;
		for (int i = 1; i < e ; i++) {
			b = total * b;
		}
		System.out.println(b);
	}
}
