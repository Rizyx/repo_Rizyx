package br.com.orientacao_a_objetos;

public class Funcionario {
	String nomefunc = null;
	double salariofunc = 0;
	
	public void aumento(double valor) {
		salariofunc += valor;
	}
	public void info() {
		System.out.println("nome do funcionario: " + nomefunc + " salario do funcionario" + salariofunc);
	}
	

}