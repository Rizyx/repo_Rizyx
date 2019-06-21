package br.com.orientacao_a_objetos;

public class Teste_aluno {

	public static void main(String[] args) {
		Aluno filipe = new Aluno();
			filipe.datanascaluno = "26/06/1995";
			filipe.nomealuno = "filipe b cordeiro";
			filipe.rgaluno = "01896325871625";
		Aluno andre = new Aluno();
			andre.datanascaluno = "22/01/2003";
			andre.nomealuno = "andre felipe roseman";
			andre.rgaluno = "874139561759";
			System.out.println(filipe.datanascaluno + filipe.nomealuno + filipe.rgaluno);
			System.out.println(andre.datanascaluno + andre.nomealuno + andre.rgaluno);

	}

}
