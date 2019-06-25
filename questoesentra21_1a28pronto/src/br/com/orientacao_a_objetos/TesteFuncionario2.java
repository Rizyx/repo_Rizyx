package br.com.orientacao_a_objetos;

import br.com.util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		boolean continuar = true ;
		String continuarloop = null;
		Funcionario somebody = new Funcionario();
			somebody.nomefunc = Teclado.lerTexto("digite o nome do funcionario");
			while (continuar == true) {
					somebody.nomefunc = Teclado.lerTexto("digite o nome do funcionario");
					somebody.salariofunc = Teclado.lerDouble("digite o salario do funcionario");
					System.out.println("nome do funcionario: " + somebody.nomefunc + " salario do funcionario: " + somebody.salariofunc);
					continuarloop = Teclado.lerTexto("deseja continuar?");
					if (continuarloop.equalsIgnoreCase("nao"));{
						continuar = false;
					}
			}
	}

}
