package br.com.orientacao_a_objetos;


public class Funcionario {
	private String nomefunc = null;
	private double salariofunc = 1000;
	private double valeRefeicao = 0;
	
	public String getNomefunc() {
		return nomefunc;
	}

	public void setNomefunc(String nomefunc) {
		this.nomefunc = nomefunc;
	}

	public double getSalariofunc() {
		return salariofunc;
	}

	public void setSalariofunc(double salariofunc) {
		this.salariofunc = salariofunc;
	}

	public double getValeRefeicao() {
		return valeRefeicao;
	}

	public void setValeRefeicao(double valeRefeicao) {
		this.valeRefeicao = valeRefeicao;
	}
	
	public void aumento(double valor) {
		salariofunc += valor;
	}
	
	public void ajusteValeRefeicao(double taxa) {
		valeRefeicao += taxa;
	}
	
	public String info() {
		String informacao = "nome do funcionario: " + nomefunc + " salario do funcionario" + salariofunc + " salario bonificado do funcionario" + aumentoEspecifico(); 
		return informacao;
	}
	
	public double aumentoEspecifico() {
		this.salariofunc *= 1.10;
		return this.salariofunc;
	}
}
