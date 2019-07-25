package br.com.orientacao_a_objetos;

public class Agencia {
	private int agencia = 0; 
	
	
		
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public static Agencia getAg() {
		return Ag;
	}
	public static void setAg(Agencia ag) {
		Ag = ag;
	}
	
	public Agencia(int agencia) {
		this.agencia = agencia;
	}	
	static Agencia Ag = new Agencia(1);
}
