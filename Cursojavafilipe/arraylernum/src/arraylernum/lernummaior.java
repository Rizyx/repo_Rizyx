package arraylernum;

import java.util.Scanner;

public class lernummaior {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num[] = new int[10];
		int maior = 0;
		int maior2 = 0;
		
		for (int lin = 0; lin < num.length; lin++ ) {
			System.out.println("Digite o numero " + (lin+1) + " : ");
			num[lin] = ler.nextInt();
			if (num[lin] > num[maior]) {
				maior2 = maior;
				maior = lin;
			}
			else if (num[lin] > num[maior2]) {
				maior2 = lin;
			}
		}
		System.out.println("o maior numero e: " + num[maior] + " e o segundo maior e: " + num[maior2]);
		
		
		ler.close();
	}

}
