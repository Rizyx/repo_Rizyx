package br.com.interfaces;

import br.com.orientacao_a_objetos.Conta;

public class ContaPoupanca implements IConta {
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
	public void transferencia(Conta conta , double saldo) {
		conta.setSaldo(conta.getSaldo() - saldo);
		this.saldo = saldo;
	}
	
	public void deposito(double valor){
		this.setSaldo(getSaldo() + valor); 
	}
	
	public void saque(double valor) {
	   this.setSaldo(getSaldo() - valor);
	}
	
	public String extrato() {
		String extract = ("numero da conta: " + numconta + " saldo " + saldo + " limite: " + limite );
		return extract;
	}
	
	public String saldo(String sal) {
		sal = ("saldo disponivel na conta : " + saldo + " limite do cheque especial: " + limite);
		return sal;
	}
}


