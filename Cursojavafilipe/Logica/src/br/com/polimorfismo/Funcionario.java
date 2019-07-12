package br.com.polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
	private String nomeFunc = null;
	private double salarioFunc = 0;
	SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	Date today = new Date();
	
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
	public String entradaDeFuncionario() {
		String agora = " Data de entrada " + date.format(today);
		return agora;
	}
	public String saidaDeFuncionario() {
		String agora = " Data de saida " + date.format(today);
		return agora;
	}

}
