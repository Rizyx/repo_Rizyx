package alunosarray;

import java.util.Scanner;

public class alunoidadenome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		String nome[] = {"","","","",""};
		int idade[] = {0,0,0,0,0};
		
		
			for(int cont = 0;cont < idade.length; cont++) {
				System.out.println("digite o nome do aluno: ");
				nome[cont] = ler.next();
				System.out.println("digite a idade do aluno: ");
				idade[cont] = ler.nextInt();
				}
			for(int cont = 0;cont < idade.length; cont++) {
				System.out.println("o nome do aluno e: " + nome[cont] + " e a idade do aluno e de: " + idade[cont]);
			}
		ler.close();

	}
}
