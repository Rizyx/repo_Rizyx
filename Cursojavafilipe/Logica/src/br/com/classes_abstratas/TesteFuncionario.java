package br.com.classes_abstratas;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente mulher = new Gerente();
		mulher.setNomeFunc("mulher de alguem");
		mulher.setSalarioFunc(98.20);
		mulher.bonificacaoFunc();
		System.out.println(mulher.getSalarioFunc());
	}

}
