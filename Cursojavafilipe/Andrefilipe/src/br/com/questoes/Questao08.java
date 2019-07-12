package br.com.questoes;
import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		String nome[] = new String[20];
		String sexo []= new String[20];
		int idade[] = new int[20];
		for (int i = 0; i < nome.length; i++) {
			nome[i] = Teclado.lerTexto("digite o nome da pessoa: ");
			sexo[i] = Teclado.lerTexto("digite o sexo m/f: ");
			idade[i] = Teclado.lerInt("digite a idade: ");
		}
		for (int i = 0; i < nome.length; i++) {
			if (sexo[i].equalsIgnoreCase("m") && idade[i] >= 21) {
				System.out.println(nome[i]);
			}
		}
	}

}
