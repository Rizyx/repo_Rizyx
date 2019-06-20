package br.com.orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario alguem = new Funcionario();
			alguem.nomefunc = "alguem oloco";
			alguem.salariofunc = 20103891;
		Funcionario ninguem = new Funcionario();
			ninguem.nomefunc = "ninguem vocesabe";
			ninguem.salariofunc = 1029100;
		System.out.println(ninguem.nomefunc + ninguem.salariofunc);
		System.out.println(alguem.nomefunc + alguem.salariofunc);
	}

}
