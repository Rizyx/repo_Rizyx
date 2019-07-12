package array;

import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		String[] carros = {"volvo","BMW","Ford","Mazda","VW","","","",""};
		int[] numeros = {0,0,0,0,0,0,0,0,0,0};
		carros[8] = "3Renault";

		for (int i = 0; i < 9; i = i + 1) {
			System.out.println(carros[i]);
			}
		ler.close();
		int [] numero = new int [] {100,2};
		System.out.println(numero[0]);
		System.out.println(numero[1]);
		int [] numeral = {100,5};
		System.out.println(numeral[0]);
		System.out.println(numeral[1]);
		
	}

}
