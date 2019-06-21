package br.com.orientacao_a_objetos;

public class Executandocliente {

	public static void main(String[] args) {
		Cliente filipe = new Cliente() ; 
		filipe.idcliente = 1;
		filipe.nome = "filipe burgarelli cordeiro";
		Cliente andre = new Cliente() ;
		andre.idcliente = 2;
		andre.nome = "andre felipe rosemann";
		CartaoCredito filipecard = new CartaoCredito();
		filipecard.numerocard = 1;
		filipecard.dataval = "26062020";
		filipecard.cliente = filipe;
		CartaoCredito andrecard  = new CartaoCredito(); 
		andrecard.dataval = "26042021";
		andrecard.numerocard = 2;
		andrecard.cliente = andre;
		Agencia HPP = new Agencia();
			HPP.agencia = 1;
		Agencia SPT = new Agencia();
		 	SPT.agencia = 2;
		Conta filipeconta = new Conta();
			filipeconta.numconta = 1;
			filipeconta.saldo = 500;
			filipeconta.limite = 20000;
			filipeconta.agencia = SPT;
		Conta andreconta = new Conta();
			andreconta.numconta = 2;
			andreconta.saldo = 203400;
			andreconta.limite = 10000;
			andreconta.agencia = HPP;
			filipeconta.deposito(500);
			filipeconta.saque(300);
			filipeconta.saldo();
			filipeconta.extrato();
			System.out.println(andrecard.cliente.idcliente);
			System.out.println(andrecard.cliente.nome);
			System.out.println(filipecard.cliente.idcliente);
			System.out.println(filipecard.cliente.nome);
			System.out.println(andreconta.agencia.agencia);
			System.out.println(filipeconta.agencia.agencia);
			System.out.println(filipeconta.saldo);
			}
}
