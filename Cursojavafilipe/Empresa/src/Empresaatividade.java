import java.util.Scanner;

public class Empresaatividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		String nome[] = new String[5];
		int idade[] = new int[5];
		String sexo[] = new String[5];
		double valhor[] = new double[5];
		double horastrab[] = new double[5];
		double salbru[] = new double[5];
		double descinss[] = new double[5];
		int mulher = 0 , homem = 0; 
		double msalmulher = 0;
		String nomemsal = "";
		
		
		for (int lin = 0; lin < nome.length; lin++ ) {
			System.out.println("digite o nome do funcionario: ");
			nome[lin] = ler.next();
			System.out.println("digite a idade do funcionario :");
			idade[lin] = ler.nextInt();
			System.out.println("digite o sexo do funcionario: ");
			sexo[lin] = ler.next();
				while(!sexo[lin].equalsIgnoreCase("f") && !sexo[lin].equalsIgnoreCase("m")) {					
					System.out.println("so existem 2 sexos otario digite um deles: ");
					sexo[lin] = ler.next();
				}
			System.out.println("digite o valor por hora que o funcionario recebe: ");
			valhor[lin] = ler.nextDouble();
			System.out.println("digite a quantidade de horas que o funcionario trabalhou: ");
			horastrab[lin] = ler.nextDouble();
			salbru[lin] = (valhor[lin] * horastrab[lin]);
			if (salbru[lin] <=1000) {
				descinss[lin] = salbru[lin] * 0.07;
				}
			else if (salbru[lin] <=2000) {
				descinss[lin] = salbru[lin] * 0.09;
				}
			else {
				descinss[lin] = salbru[lin] * 0.11;
			}
			if (sexo[lin].equalsIgnoreCase("f")) {				
				mulher++;				
			}
			else {
				homem++;
			}
			if (sexo[lin].equalsIgnoreCase("f") && salbru[lin] > msalmulher){
				msalmulher = salbru[lin];
				nomemsal = nome[lin];
				}
		}
		for (int lin = 0; lin < nome.length; lin++ ) {
			System.out.println("o nome do funcionario e :" + nome[lin] + " a idade do funcionario e de: " + idade[lin] + " de sexo: "  + sexo[lin] + " recebe um salario bruto de: " + salbru[lin] + " e tera um desconto de: " + descinss[lin] );
		}
		System.out.println("a quantidade de mulheres e de: " + mulher + " e a de homems e de: " + homem);
		System.out.println("a mulher com o maior salario e a: " + nomemsal + " com um salario de: " + msalmulher);
		
		ler.close();
	}

}
