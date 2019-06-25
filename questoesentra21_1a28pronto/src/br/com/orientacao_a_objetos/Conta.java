package br.com.orientacao_a_objetos;

public class Conta {
	int numconta = 0;
	double saldo = 0;
	double limite = 100;
	Agencia agencia;
	
	public Conta(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public void transferencia(Conta conta , double saldo) {
		conta.saldo -= saldo;
		this.saldo = saldo;
	}
	
	public void deposito(double valor){
		saldo += valor;
	}
	
	public void saque(double valor) {
		if (limite < valor) {
		}
		else if (saldo < valor){
			valor -= saldo;
			limite -= valor;
		}
		else {
			saldo -= valor;
		}
	}
	
	public String extrato(String extract) {
		extract = ("numero da conta: " + numconta + " saldo " + saldo + " limite: " + limite + " numero da agencia " + agencia.agencia);
		return extract;
	}
	
	public String saldo(String sal) {
		sal = ("saldo disponivel na conta : " + saldo + " limite do cheque especial: " + limite);
		return sal;
	}
}
