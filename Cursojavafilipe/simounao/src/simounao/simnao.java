package simounao;

import java.util.Scanner;

public class simnao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double num = 0, cont = 0, media = 0 ;
		String YN = "sim";
		
		while (!YN.equalsIgnoreCase("nao")) {
			if (YN.equalsIgnoreCase("sim")) {				
				System.out.println("digite um numero: ");
				num = ler.nextDouble();
				cont = cont + 1;
				media = media + num;
			} 
			System.out.println("deseja continuar? sim ou nao: ");
			YN = ler.next();
		}
		
		System.out.println("A media dos numeros digitados foi de: " + (media / cont));
		ler.close();
		for (int i = 1000; i >= 1; i = i - 2) {
			System.out.println(i);
		}
	}
}
