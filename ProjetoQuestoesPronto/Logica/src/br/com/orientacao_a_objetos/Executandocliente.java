package br.com.orientacao_a_objetos;

public class Executandocliente {

	public static void main(String[] args) {
		Cliente filipe = new Cliente() ; 
		filipe.setIdcliente(1);
		filipe.setNome("filipe burgarelli cordeiro");
		Cliente andre = new Cliente() ;
		andre.setIdcliente(2);
		andre.setNome("andre felipe rosemann");
		CartaoCredito filipecard = new CartaoCredito(1);
		filipecard.setDataval("26062020");
		filipecard.setCliente(filipe);
		CartaoCredito andrecard  = new CartaoCredito(2); 
		andrecard.setDataval("26042021");
		andrecard.setCliente(andre);
		Agencia HPP = new Agencia(1);
		Agencia SPT = new Agencia(2);
		Conta filipeconta = new Conta(SPT);
			filipeconta.setNumconta(1);
			filipeconta.setSaldo(500);
			filipeconta.setLimite(20000);
		Conta andreconta = new Conta(HPP);
			andreconta.setNumconta(2);
			andreconta.setSaldo(203400);
			andreconta.setLimite(10000);
			andreconta.setAgencia(HPP);
		Conta c = new Conta (3, 1000, 500, SPT);
		Conta cc = new Conta(4,2000,500,HPP);
		System.out.println(Conta.getCont());
		System.out.println(c.getIdconta());
		cc.zeraContador();
		System.out.println(Conta.getCont());
			filipeconta.deposito(500);
			filipeconta.saque(300);
			filipeconta.saldo(null);
			filipeconta.extrato(null);
			filipeconta.transferencia(andreconta, 500);
			System.out.println(andrecard.getCliente().getIdcliente());
			System.out.println(andrecard.getCliente().getNome());
			System.out.println(filipecard.getCliente().getIdcliente());
			System.out.println(filipecard.getCliente().getNome());
			System.out.println(andreconta.getAgencia().getAgencia());
			System.out.println(filipeconta.getAgencia().getAgencia());
			System.out.println(filipeconta.getSaldo());
			System.out.println(andreconta.getSaldo());
	}
}
