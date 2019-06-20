package arraynum;

import java.util.Scanner;

public class arraynumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int[] numeros = {0,0,0,0,0,0,0,0,0,0};
		
			for (int cont = 0 ; cont < numeros.length ; cont++) {
				System.out.println("digite o numero:");
				numeros[cont] =ler.nextInt(); 
			}
			for (int cont = 0 ; cont < numeros.length ; cont++) {
				System.out.println(numeros[cont]);
			}
		ler.close();
	}
}
