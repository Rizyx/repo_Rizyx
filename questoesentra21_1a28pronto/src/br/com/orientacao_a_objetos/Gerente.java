package br.com.orientacao_a_objetos;


public class Gerente {
	String nome;
	double salariogerente;
	
	public void aumentoperc() {
		salariogerente *= 1.10;
	}
	public void aumentovar(double valor) {
		salariogerente += valor;
	}
}