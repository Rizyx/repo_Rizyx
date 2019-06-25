package br.com.orientacao_a_objetos;

public class Executandocliente {

	public static void main(String[] args) {
		Cliente filipe = new Cliente() ; 
		filipe.idcliente = 1;
		filipe.nome = "filipe burgarelli cordeiro";
		Cliente andre = new Cliente() ;
		andre.idcliente = 2;
		andre.nome = "andre felipe rosemann";
		CartaoCredito filipecard = new CartaoCredito(1);
		filipecard.dataval = "26062020";
		filipecard.cliente = filipe;
		CartaoCredito andrecard  = new CartaoCredito(2); 
		andrecard.dataval = "26042021";
		andrecard.cliente = andre;
		Agencia HPP = new Agencia(1);
		Agencia SPT = new Agencia(2);
		Conta filipeconta = new Conta(SPT);
			filipeconta.numconta = 1;
			filipeconta.saldo = 500;
			filipeconta.limite = 20000;
		Conta andreconta = new Conta(HPP);
			andreconta.numconta = 2;
			andreconta.saldo = 203400;
			andreconta.limite = 10000;
			filipeconta.deposito(500);
			filipeconta.saque(300);
			filipeconta.saldo(null);
			filipeconta.extrato(null);
			filipeconta.transferencia(andreconta, 500);
			System.out.println(andrecard.cliente.idcliente);
			System.out.println(andrecard.cliente.nome);
			System.out.println(filipecard.cliente.idcliente);
			System.out.println(filipecard.cliente.nome);
			System.out.println(andreconta.agencia.agencia);
			System.out.println(filipeconta.agencia.agencia);
			System.out.println(filipeconta.saldo);
			System.out.println(andreconta.saldo);
	}
}
