package br.com.questao;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		double dist, csm;
		
		dist = Teclado.lerDouble("digite a distancia em quilometros ");
		csm = Teclado.lerDouble("digite o consumo medio do veiculo em quilometros por litro ");
		System.out.println("o veiculo gastara na viagem " + (dist/csm) + " litros de combustivel");
		

	}

}


