import java.util.Scanner;

public class parimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num = 0 , cont = 0 , par = 0 , imp = 0;
		
		while (cont != 30) {
			System.out.println("digite o numero:");
			num = ler.nextInt();
			cont++;
			if (num % 2 == 0) {
				par = par + 1;
			}
			else {
				imp = imp + 1;
			}
		}
		System.out.println("numeros pares: " + par + " numeros impares: " + imp);
		ler.close();
	}

}
