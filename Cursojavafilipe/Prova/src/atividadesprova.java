import java.util.Scanner;

public class atividadesprova {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num[] = new int[20];
		int soma = 0;
		double media20 = 0; 
		int maior10 = 0;
		int maior20 = 0;
		int par = 0;
		String sn = "";
		int tab = 0;
		double cont = 0;
		String pal = "";
		
		
		for (int lin = 0; lin < num.length; lin++ ) {
			System.out.println("Digite o numero " + (lin+1) + " :");
			num[lin] = ler.nextInt();
			if (num[lin] > 20) {
					media20 = media20 + num[lin];
					cont++;
					maior20++;
					maior10++;
					soma = num[lin] + soma;
				}
				else if (num[lin] > 10){
					maior10++;
					soma = num[lin] + soma;
				}
				if (num[lin] % 2 == 0) {
					par++;
				}				
		}
		System.out.println("numeros maiores que 10: " + maior10);
		System.out.println("numeros maiores que 20: " + maior20);
		System.out.println("soma numeros maiores que 10: " + soma);
		System.out.println("media dos numeros maiores que 20: " + (media20/cont));
		System.out.println("quantidade de numeros pares: " + par);
		
		System.out.println("o seu nome comeca com A: ");
		sn = ler.next();
			while (!sn.equalsIgnoreCase("s") && !sn.equalsIgnoreCase("n")) {
				System.out.println("Por favor responda com S ou N: ");
				sn = ler.next();
			}
			if (sn.equalsIgnoreCase("s")) {
				System.out.println("ok começa com A obrigado:");
			}
			else {
				System.out.println("ok nao começa com A obrigado:");
			}
		System.out.println("digite um numero para fazer a taboada:");		
		tab = ler.nextInt();
		for (int lin = 1; lin <= 10; lin++ ) {
			System.out.println(tab + " x " + lin + " : " + tab*lin);
		}
		System.out.println("digite uma palavra em minusculo: ");
		pal = ler.next();
		System.out.println("sua palavra em maiusculo: " + pal.toUpperCase());
		System.out.println("quantidade de letras na sua palavra: " + pal.length());
		
		
		
		ler.close();
	}

}
