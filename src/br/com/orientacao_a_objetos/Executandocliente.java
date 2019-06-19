package br.com.orientacao_a_objetos;

public class Executandocliente {

	public static void main(String[] args) {
		Cliente filipe = new Cliente() ; 
		Cliente andre = new Cliente() ; 
		CartaoCredito filipecard = new CartaoCredito();
		filipecard.numerocard = 1;
		filipecard.dataval = "26062020";
		CartaoCredito andrecard  = new CartaoCredito(); 
		andrecard.dataval = "26042021";
		andrecard.numerocard = 2;
		Banco HPP = new Banco();
			HPP.agencia = 1;
		Banco SPT = new Banco();
		 	SPT.agencia = 1;
		Conta filipeconta = new Conta();
			filipeconta.numconta = 1;
			filipeconta.saldo = 534004;
			filipeconta.limite = 20000;
		Conta andreconta = new Conta();
			andreconta.numconta = 2;
			andreconta.saldo = 203400;
			andreconta.limite = 10000;
		
		}

}
