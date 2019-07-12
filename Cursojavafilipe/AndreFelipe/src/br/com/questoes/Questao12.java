package br.com.questoes;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 11; i++) {
			System.out.println(" ");
			for (int j = 1; j < 11; j++) {
				if (j <= i) {
					System.out.print("x-x ");
				} else {
					System.out.print(i + "-" + j + " ");
				}
			}
		}
	}
}