package br.com.orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario alguem = new Funcionario();
			alguem.setNomefunc("alguem oloco");
			alguem.setSalariofunc(2010); 
			alguem.setValeRefeicao(60);
			alguem.ajusteValeRefeicao(15.90);
		Funcionario ninguem = new Funcionario();
			ninguem.setNomefunc("ninguem vocesabe");
			ninguem.setSalariofunc(1029);
			ninguem.setValeRefeicao(12.45);
			ninguem.ajusteValeRefeicao(12.50);
		ninguem.aumento(4500);
		ninguem.info();
		Gerente mane = new Gerente();
			mane.setNomeusuario("kiepfros");
			mane.setNomefunc("mane dos santos sauros");
			mane.setSalariogerente(6650);
			mane.setSenha("posla");
			mane.setValeRefeicao(90);
			mane.setSalariofunc(2000);
		Gerente homem = new Gerente();
			homem.setNomeusuario("sehugs");
			homem.setNomefunc("homem grande");
			homem.setSalariogerente(8900);
			homem.setSenha("dafeasf");
			homem.setValeRefeicao(150);
			homem.setSalariofunc(2900);
		Telefonista cilda = new Telefonista();
			cilda.setNomefunc("cilda senhora");
			cilda.setSalariofunc(100);
			cilda.setValeRefeicao(9);
			cilda.setCodEstacaoTrab(42);
		Secretaria aida = new Secretaria();
			aida.setNomefunc("aida senger");
			aida.setSalariofunc(3600);
			aida.setValeRefeicao(22);
			aida.setRamal(12);
		mane.aumentoperc();
		homem.aumentovar(5000);
		System.out.println(mane.getSalariogerente());
		System.out.println(homem.getSalariogerente());
		System.out.println(ninguem.getValeRefeicao());
		System.out.println(alguem.getValeRefeicao());
		System.out.println(ninguem.getNomefunc() + ": " + ninguem.getSalariofunc());
		System.out.println(alguem.getNomefunc() + ": " + alguem.getSalariofunc());
		cilda.aumentoEspecifico();
		homem.aumentoEspecifico();
		aida.aumentoEspecifico();
		System.out.println(cilda.getSalariofunc());
		System.out.println(aida.getSalariofunc());
		System.out.println(homem.getSalariofunc());
		System.out.println(homem.info());
		System.out.println(cilda.info());
		System.out.println(aida.info());
	}
}
