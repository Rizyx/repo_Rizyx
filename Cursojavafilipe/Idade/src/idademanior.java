import java.util.Scanner;

public class idademanior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int idademaior = 0 , idademaior2 = 0;
		int idade = 1;
		String nome = "" , nome1 = "" , nome2 = ""; 
		
		while (idade != 0) {
		System.out.println("digite a idade: ");
		idade = ler.nextInt();
		System.out.println("digite seu nome:");
		nome = ler.next();
			if (idade > idademaior) {				
				idademaior2 = idademaior;
				nome2 = nome1;
				idademaior = idade;	
				nome1 = nome;	
			}
			else if (idade > idademaior2) {
				nome2 = nome;
				idademaior2 = idade;
			}
		}
		if (idademaior == idademaior2) {
			System.out.println("as duas maiores idades sao iguais e pertencem a : " + nome1 + " e " + nome2);
		}
		else {
			System.out.println("a idade maior e de: " + idademaior + " de " + nome1 + " e a segunda idade maior e de: " + idademaior2 + " de " + nome2);
		}
		
		ler.close();
		}
}
