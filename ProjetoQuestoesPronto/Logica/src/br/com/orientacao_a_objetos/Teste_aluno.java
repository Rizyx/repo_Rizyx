package br.com.orientacao_a_objetos;

public class Teste_aluno {

	public static void main(String[] args) {
		Turma java = new Turma();
		Aluno filipe = new Aluno();
			filipe.setDatanascaluno("26/06/1995"); 
			filipe.setNomealuno("filipe b cordeiro");
			filipe.setRgaluno("01896325871625");
		Aluno andre = new Aluno();
			andre.setDatanascaluno("22/01/2003");
			andre.setNomealuno("andre felipe roseman");
			andre.setRgaluno("874139561759");
			andre.setTurma(java);
			andre.getTurma().setPeriodo("matutino");
			andre.getTurma().setSerie(9);
			andre.getTurma().setSigla("c");
			andre.getTurma().setTpensino("java master");
			System.out.println(filipe.getDatanascaluno() + filipe.getNomealuno() + filipe.getRgaluno());
			System.out.println(andre.getDatanascaluno() + andre.getNomealuno() + andre.getRgaluno());
			System.out.println(andre.getTurma().getPeriodo() + andre.getTurma().getSerie() + andre.getTurma().getSigla() + andre.getTurma().getTpensino());

	}

}
