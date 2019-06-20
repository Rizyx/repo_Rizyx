package br.com.orientacao_a_objetos;

public class TesteTurma {

	public static void main(String[] args) {
		Turma javas = new Turma();
		javas.periodo = "matutino";
		javas.serie = 7;
		javas.sigla = "S";
		javas.tpensino = "tecnico";
		Turma paskkk = new Turma();
		paskkk.periodo = "vespertino";
		paskkk.serie = 3;
		paskkk.sigla = "C";
		paskkk.tpensino = "simples";
		System.out.println(javas.periodo + javas.serie + javas.sigla + javas.tpensino);
		System.out.println(paskkk.periodo + javas.serie + javas.sigla + javas.tpensino);
	}

}
