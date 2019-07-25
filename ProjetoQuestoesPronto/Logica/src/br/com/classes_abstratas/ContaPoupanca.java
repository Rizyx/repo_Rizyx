package br.com.classes_abstratas;

public class ContaPoupanca extends Conta {

	@Override
	public String extratoDetalhado() {
		String extrato = "numero da conta " + getNumconta() + " saldo da conta " + getSaldo() + " limite da conta " + getLimite();
		return extrato;
	}

}
