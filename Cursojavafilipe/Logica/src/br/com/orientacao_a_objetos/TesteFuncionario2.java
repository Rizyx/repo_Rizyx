package br.com.orientacao_a_objetos;

import br.com.util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		boolean continuar = true ;
		String continuarloop = null;
		Funcionario somebody = new Funcionario();
			somebody.setNomefunc(Teclado.lerTexto("digite o nome do funcionario"));
			while (continuar == true) { 					
					somebody.setNomefunc(Teclado.lerTexto("digite o nome do funcionario"));
					somebody.setSalariofunc(Teclado.lerDouble("digite o salario do funcionario"));
					System.out.println("nome do funcionario: " + somebody.getNomefunc() + " salario do funcionario: " + somebody.getSalariofunc());
					continuarloop = Teclado.lerTexto("deseja continuar?");
					if (continuarloop.equalsIgnoreCase("nao")){
						continuar = false;
					}
			}
	}

}
