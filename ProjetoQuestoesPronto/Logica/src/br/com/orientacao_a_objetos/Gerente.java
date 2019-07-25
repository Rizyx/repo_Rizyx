package br.com.orientacao_a_objetos;


public class Gerente extends Funcionario{
	private String nomeusuario;
	private double salariogerente;
	private String senha;
	
	public String getNomeusuario() {
		return nomeusuario;
	}
	public void setNomeusuario(String nome) {
		this.nomeusuario = nome;
	}
	public double getSalariogerente() {
		return salariogerente;
	}
	public void setSalariogerente(double salariogerente) {
		this.salariogerente = salariogerente;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void aumentoperc() {
		salariogerente *= 1.10;
	}
	public void aumentovar(double valor) {
		salariogerente += valor;
	}
	public double aumentoEspecifico() {
		this.setSalariofunc(getSalariofunc()*1.15); 
		return this.salariogerente;
	}
	public String info() {
		String informacao = "nome do funcionario: " + getNomefunc() + " salario do funcionario " + getSalariofunc() + " salario bonificado do funcionario " + aumentoEspecifico()
		+ " nome do usuario " + nomeusuario + " salario do gerente " + salariogerente + " senha do gerente " + senha; 
		return informacao;
	}
}