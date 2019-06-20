package matriz;

import java.util.Scanner;

public class m1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int[][] lista = { {1,2,3} , {4,5,6} , {7,8,9}};
		int[][] lista2 = { {64,30,33} , {24,31,15} , {16,18,23}};
		int soma = 0 , soma2 = 0;
		
		for (int lin = lista2.length - 1; lin > -1 ; lin--) {
			System.out.println("");
			for (int col = lista2[lin].length - 1 ; col > -1; col--){
				lista[lin][col] = lista2[lin][col];
				System.out.print(lista[lin][col]+" ");
			}
		}
			for(int[] i : lista) {
				for(int j = 0; j < i.length; j++)
				System.out.println(i[j]);
			}
		/*for (int lin = 0; lin < lista2.length; lin++) {
			for (int col = 0; col < lista2[lin].length; col++){
				lista[lin][col] = lista2[lin][col];
				System.out.println(lista[lin][col]);
				if (lin == col){
					soma = soma + lista2[lin][col];	
				}
				
			}
		}
		System.out.println(soma);*/
		/*for (int lin = 0; lin < lista2.length; lin++) {
			for (int col = 0; col < lista2[lin].length; col++){
				if (lin == 1 && col != 1 || col == 1 && lin != 1){
					lista2[lin][col] = 1;
				}
			System.out.println(lista2[lin][col]);		
			}
		}*/
		
		/*for (int cont = 0; cont < lista.length; cont++) {
			System.out.println();
				for (int cont1 = 0; cont1 < lista[cont].length; cont1++) {
				System.out.print(lista[cont][cont1] +"-");
			}
		}*/
		
		ler.close();
	}
}
