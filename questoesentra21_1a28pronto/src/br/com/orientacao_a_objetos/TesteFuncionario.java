package br.com.orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario alguem = new Funcionario();
			alguem.nomefunc = "alguem oloco";
			alguem.salariofunc = 2010;
		Funcionario ninguem = new Funcionario();
			ninguem.nomefunc = "ninguem vocesabe";
			ninguem.salariofunc = 1029;
		ninguem.aumento(4500);
		ninguem.info();
		Gerente mane = new Gerente();
			mane.nome = "mane dos santos sauros";
			mane.salariogerente = 6650;
		Gerente homem = new Gerente();
			homem.nome = "homem grande";
			homem.salariogerente = 8900;
		mane.aumentoperc();
		homem.aumentovar(5000);
		System.out.println(mane.salariogerente);
		System.out.println(homem.salariogerente);
		System.out.println(ninguem.nomefunc + ": " + ninguem.salariofunc);
		System.out.println(alguem.nomefunc + ": " + alguem.salariofunc);
	}

}