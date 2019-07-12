package br.com.classes_abstratas;

public class Gerente extends Funcionario{

	@Override
	public void bonificacaoFunc() {
		this.setSalarioFunc(this.getSalarioFunc()+100); 
		
	}
	
}
