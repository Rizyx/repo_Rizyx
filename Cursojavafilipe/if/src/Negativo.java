import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
 		System.out.println("digite um numero:");
 		String result;
		
		int num = ler.nextInt();
		
		if (num < 0) {
			result  = "negativo";
		}
		else if (num > 0){
			result = "positivo";
		}
		else {
			result = "O numero é nulo";
		}
		System.out.print(result);
		if ((num % 2) == 0) {
			result = " e é par";
		}
		else {
			result = " e é impar";
		}
		System.out.println(result);
		
		ler.close();
 		

	}

}

