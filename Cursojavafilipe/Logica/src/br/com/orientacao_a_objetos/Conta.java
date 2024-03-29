package br.com.orientacao_a_objetos;

public class Conta {
	
	

	public Conta(int numconta, double saldo, double limite, Agencia agencia) {
		super();
		this.numconta = numconta;
		this.saldo = saldo;
		this.limite = limite;
		this.agencia = agencia;
		Conta.cont++;
		this.idconta = cont;
	}
	

	private int numconta = 0;
	private double saldo = 0;
	private double limite = 100;
	private Agencia agencia;
	private static int cont;
	private int idconta;
	
	
	
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

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Conta.cont = cont;
	}

	public int getIdconta() {
		return idconta;
	}

	public void setIdconta(int idconta) {
		this.idconta = idconta;
	}

	public  int zeraContador() {
		int contas = cont;
		cont = 0;
		return contas;
		
	}
	
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
		extract = ("numero da conta: " + numconta + " saldo " + saldo + " limite: " + limite + " numero da agencia " + agencia.getAgencia());
		return extract;
	}
	
	public String saldo(String sal) {
		sal = ("saldo disponivel na conta : " + saldo + " limite do cheque especial: " + limite);
		return sal;
	}
}
