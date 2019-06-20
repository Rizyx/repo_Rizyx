import java.util.Scanner;

public class matrizaluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		String nome[] = {"","","",""};
		double nota[][] = { {0,0} , {0,0} , {0,0} , {0,0} };
		String nome1[] = new String[4];
		double nota1[][] = new double[4][2];
		int cont = 4;
		String nome2[] = new String[cont];
		
		
		
		
			for (int lin = 0; lin < nome.length; lin++ ) {
				System.out.println("digite o nome do aluno: ");
				nome[lin] = ler.next();
				while (nome[lin]=="" || nome[lin].length() < 5 ) {
					System.out.println("Formato de digitação errado digite novamente: ");
					nome[lin] = ler.next();
				}
				for (int col = 0; col < nota[lin].length ; col++) {
					System.out.println("digite a nota " + (col+1) + " do aluno: " + nome[lin]);
					nota[lin][col] = ler.nextDouble();
						while(nota[lin][col] < 0 || nota[lin][col] > 10 ) {
							System.out.println("formato de digitação errado digite a nota " + (col+1) + " do aluno: " + nome[lin] + "novamente");
							nota[lin][col]=ler.nextDouble();
						}
				}
			}
			for (int lin = 0; lin < nome.length; lin++ ) {
				System.out.println(nome[lin]);
				for (int col = 0; col < nota[lin].length ; col++) {
					System.out.println(nota[lin][col]);
				}
				
			}
		ler.close();
	}

}
