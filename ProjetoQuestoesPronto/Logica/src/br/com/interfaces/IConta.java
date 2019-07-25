package br.com.interfaces;

import br.com.orientacao_a_objetos.Conta;

public interface IConta {
	public int getNumconta();
	public void setNumconta(int numconta);
	public double getSaldo();
	public void setSaldo(double saldo);
	public double getLimite();
	public void setLimite(double limite);
	public void geradorDeExtrato();
	public void transferencia(Conta conta , double saldo);
	public void deposito (double valor);
	public void saque(double valor);
	public String extrato();
	public String saldo(String sal);

}
