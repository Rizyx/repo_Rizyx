package br.com.orientacao_a_objetos;

public class TesteTurma {

	public static void main(String[] args) {
		Turma javas = new Turma();
		javas.setPeriodo("matutino"); 
		javas.setSerie(7);
		javas.setSigla("S");
		javas.setTpensino("tecnico");
		Turma paskkk = new Turma();
		paskkk.setPeriodo("vespertino");
		paskkk.setSerie(3);
		paskkk.setSigla("C");
		paskkk.setTpensino("simples");
		System.out.println(javas.getPeriodo() + javas.getSerie() + javas.getSigla() + javas.getTpensino());
		System.out.println(paskkk.getPeriodo() + javas.getSerie() + javas.getSigla() + javas.getTpensino());
	}

}