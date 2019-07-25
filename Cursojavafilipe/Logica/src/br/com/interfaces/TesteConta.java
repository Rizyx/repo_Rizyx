package br.com.interfaces;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
			cc.setLimite(1500);
			cc.setNumconta(1);
			cc.setSaldo(4875.75);
		ContaPoupanca cp = new ContaPoupanca();
			cp.setLimite(1000);
			cp.setNumconta(1);
			cp.setSaldo(24655.10);
		System.out.println(cp.getLimite());
		cc.deposito(6500);
		System.out.println(cc.getSaldo());
		cc.saque(9000);
		System.out.println(cc.getSaldo());	
		System.out.println(cc.extrato());
	}

}
