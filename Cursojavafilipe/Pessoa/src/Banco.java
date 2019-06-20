import java.util.Random;

public class Banco {

	public static void main(String[] args) {
		Conta minhaConta = new Conta(null, 0);
	    minhaConta.depositar(1000);
	    minhaConta.Conta();
	}

}

	class Conta{
		String titular;
		int numero;
		private double saldo;
		Random R = new Random();
		
		public void Conta(){
			this.numero = R.nextInt(10000);
			System.out.println(numero);
		}
		
		Conta(String xtitular , int xnumero){
			this.titular = xtitular;
			this.numero = xnumero;
			
		}
		void show() {
			System.out.println(Conta.class);
		}
		void depositar(double valor) {
			this.saldo = this.saldo + valor;
		}
		void sacar(double valor) {
			if(valor > this.getSaldo()) {
				System.out.println("saldo insuficiente");				
			} else {
				this.saldo -= valor;
			}
		}
		public double getSaldo() {
			return saldo;
		}
		protected void setSaldo(double Saldo) {
		this.saldo = saldo;
	}
}
	
	
	class chequeespecial extends Conta{
	chequeespecial(String xtitular, int xnumero) {
			super(xtitular, xnumero);
			
		}
	private double limitecredito;

		public double getLimite() {
			return limitecredito;
		}

		public void setLimite(double limite) {
			this.limitecredito = limitecredito;
		}
	@Override
	void sacar(double valor) {
		if(valor > (this.getSaldo() + this.limitecredito)) {
			System.out.println("saldo insuficiente");
		} else {
			this.setLimite(this.getSaldo() - valor);
		}
	}
	@Override
	public double getSaldo() {
		return super.getSaldo() + this.limitecredito;
	}
	
 }
