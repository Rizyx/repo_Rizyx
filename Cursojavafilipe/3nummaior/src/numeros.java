import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		double n1 = ler.nextDouble();
		System.out.println("digite o segundo numero");
		double n2 = ler.nextDouble();
		System.out.println("digite o terceiro numero");
		double n3 = ler.nextDouble();
		System.out.println("digite o quarto numero");
		double n4 = ler.nextDouble();
		
		if (n1 > n2 && n1 > n3 && n1 > n4 ) {
			System.out.println("O primeiro numero é maior");		    
		}
		else if (n2 > n1 && n2 > n3 && n2 > n4) {
			System.out.println("O segundo numero é maior:");
		}
		else if (n3 > n1 && n3 > n2 && n3 > n4) {
			System.out.println("O terceiro numero é maior");
		}
		else if	(n4 > n1 && n4 > n2 && n4 > n3) {
			System.out.println("o quarto numero é maior");
		}
		else {
			System.out.println("dois ou mais numeros sao iguais");
		}

ler.close();
	}

}

