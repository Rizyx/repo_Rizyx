package br.com.polimorfismo;

public class Conta {
	private int numconta = 0;
	private double saldo = 0;
	private double limite = 100;
	
	public int getNumconta() {
		return numconta;
	}
	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void geradorDeExtrato() {
		
	}
	
}
