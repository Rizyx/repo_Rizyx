package br.com.classes_abstratas;

public class TesteConta {

	public static void main(String[] args) {
		ContaPoupanca algum = new ContaPoupanca();
		algum.setNumconta(1);
		algum.setLimite(1000);
		algum.setSaldo(4500);
		System.out.println(algum.extratoDetalhado());
		
		System.out.println(algum.getNumconta() + " " + algum.getLimite() + " " + algum.getSaldo());
		}
}