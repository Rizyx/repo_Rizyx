import java.util.Scanner;

public class Alunos {

	public static void main(String[] args) {		
		
		Scanner s = new Scanner(System.in);
		System.out.print("digite o nome do aluno:");
		String NomeAluno = s.next();
		System.out.print("digite a primeira nota:");
		double n1 = s.nextDouble();
		System.out.print("digite a segunda nota:");
		double n2 = s.nextDouble();
		System.out.print("digite a terceira nota:");
		double n3 = s.nextDouble();
		System.out.print("digite a quarta nota:");
		double n4 = s.nextDouble();
		System.out.println("digite a frequencia do aluno:");
		int freq = s.nextInt();
		double media;
		String resultado;
		
		
		media = (n1+n2+n3+n4)/4;
				
		if (media < 7 && media >= 3 && freq >= 75)  { 
			resultado="Para exame";
		}    
		else if (media < 3 || freq < 75)  { 
			resultado="Reprovado";	
		}
		else {
			resultado="Aprovado";
		}
		
		System.out.println("o aluno: " + NomeAluno + " foi " + resultado + " com a media:" + media);
        s.close();
	}

}
