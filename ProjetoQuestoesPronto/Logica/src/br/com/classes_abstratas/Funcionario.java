package br.com.classes_abstratas;

abstract public class Funcionario {
	private String nomeFunc = null;
	private double salarioFunc = 0;
	
	public String getNomeFunc() {
		return nomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	public double getSalarioFunc() {
		return salarioFunc;
	}
	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	abstract public void bonificacaoFunc();
}
