package br.com.orientacao_a_objetos;

public class Conta {
	int numconta = 0;
	double saldo = 0;
	double limite = 100;
	Agencia agencia;
	
	public void deposito(double valor){
		saldo += valor;
	}
	public void saque(double valor) {
		if (limite < valor) {
			System.out.println("nao ha valor para saque: ");
		}
		else if (saldo < valor){
			valor -= saldo;
			limite -= valor;
		}
		else {
			saldo -= valor;
		}
	}
	public void extrato() {
		System.out.println("numero da conta: " + numconta + " saldo " + saldo + " limite: " + limite + " numero da agencia " + agencia.agencia);
	}
	public void saldo() {
		System.out.println("saldo disponivel na conta : " + saldo + " limite do cheque especial: " + limite);
	}
}
