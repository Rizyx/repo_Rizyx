package loop;

import java.util.Scanner;

public class loop1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o numero: ");
		double num = ler.nextDouble();
		int cont = 1001;
		double cont1 = 0;
		String senha = "";
		
		while (num > 0 ) {
			cont1++;
			num--;
			System.out.println(cont1 + " " + num);
		}
		
		while (cont > 1000 && cont < 2000) {
			System.out.println(cont);
			cont = cont+2;
		
		}
		while (!senha.equals("tanso") ) {
			System.out.println("digite a senha: ");
			senha= ler.next();
			cont1++;
		}
		System.out.println((cont1 == 1)? "acertou de primeira" : " finalmente depois de " + cont1 + " tentativas");
		
		
		ler.close();
		
	}

}
