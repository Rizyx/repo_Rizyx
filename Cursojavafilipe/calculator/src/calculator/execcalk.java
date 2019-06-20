package calculator;

import java.util.Scanner;

public class execcalk {

	public static void main(String[] args) {
		double numero1;
		double numero2;
		double numero3;

		
		Scanner ler = new Scanner(System.in);
		System.out.println("digite o valor do numero 1: ");
		numero1 = ler.nextInt();
		System.out.println("digite o segundo valor: ");
		numero2 = ler.nextInt();
		System.out.println("digite o valor para soma: ");
		numero3 = ler.nextInt();
		
		calk newcalk = new calk(numero1,
								numero2,
								numero3);
		
		System.out.println(newcalk.soma());
		System.out.println(newcalk.subtrai());
		System.out.println(newcalk.divide());
		System.out.println(newcalk.multiplica());
		
		ler.close();

	}

}
