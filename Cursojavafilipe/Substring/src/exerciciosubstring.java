import java.util.Scanner;

public class exerciciosubstring {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String palavra = "";
		
		System.out.println("digite uma palavra:");
		palavra = ler.next();
		
		for (int lin = 0; lin < palavra.length(); lin++) {
			System.out.println(palavra.charAt(lin));

		}
		for (int col = 0; col < palavra.length(); col++) {	
			System.out.println(palavra.substring(0,col+1));
		}
		
		
		ler.close();
		
		
	}

}
