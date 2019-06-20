package inss;

import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o salario:");
		double salario = ler.nextDouble();
		System.out.println("digite se o contrubuinte é autonomo:");
		String auto = ler.next();
		System.out.println("digite se o contribuinte é de baixa renda:");
		String renda = ler.next();
		double inss=0;
		final double lim1 = 1781.81;
		final double lim2 = 2919.72;
		final double lim3 = 998.00;
		final double lim4 = 5839.45;
		final double desc1 = 0.08;
		final double desc2 = 0.09;
		final double desc3 = 0.11;
		final double desc4 = 0.05;
		final double desc5 = 0.20;
		
		
		if (auto.equalsIgnoreCase("N")) {
			if (salario <= lim1) {
			inss = salario * desc1;
		}
			else if (salario <= lim2) {
			inss = salario * desc2;	
		}
			else if (salario <= lim4){
			inss = salario * desc3;
		}
			else {
				inss = lim4 * desc3;
			}
		}
		else if(auto.equalsIgnoreCase("S")){
			while (salario < lim3) { 
			System.out.println("salario menor que o minimo nao havera desconto digite outro salario :");
		    salario = ler.nextDouble();
			}
		}
		else if (salario == lim3 && renda.equalsIgnoreCase("S") ) {
			inss = salario * desc4;
		}
		else if (salario == lim3) {
			inss = salario * desc3;
		}
		else if (salario >= lim3 && salario <= lim4) {
			inss = salario * desc5;
		}
		else {
			inss = lim4 * desc5;
		}
			System.out.println("o salario com desconto será de : " + (salario - inss));
			System.out.println("o desconto sera de: " + inss);		
		
		ler.close();
			
	}

}

