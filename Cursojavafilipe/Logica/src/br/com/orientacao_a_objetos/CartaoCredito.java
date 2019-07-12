package br.com.orientacao_a_objetos;



public class CartaoCredito {
	private int numerocard ;
	private String dataval;
	private Cliente cliente;
	
	
		
		public int getNumerocard() {
		return numerocard;
	}



	public void setNumerocard(int numerocard) {
		this.numerocard = numerocard;
	}



	public String getDataval() {
		return dataval;
	}



	public void setDataval(String dataval) {
		this.dataval = dataval;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



		public CartaoCredito(int numerocard) {
			this.numerocard = numerocard;
		}
}
