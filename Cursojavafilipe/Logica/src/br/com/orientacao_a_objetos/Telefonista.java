package br.com.orientacao_a_objetos;

public class Telefonista extends Funcionario {
		private int codEstacaoTrab = 0;

		public int getCodEstacaoTrab() {
			return codEstacaoTrab;
		}

		public void setCodEstacaoTrab(int codEstacaoTrab) {
			this.codEstacaoTrab = codEstacaoTrab;
		}
		public String info() {
			String informacao = "nome do funcionario: " + getNomefunc() + " salario do funcionario " + getSalariofunc() + 
					" salario bonificado do funcionario " + aumentoEspecifico() + " codigo de estacao de trabalho da telefonista " + codEstacaoTrab; 
			return informacao;
		}
		
		
}
