package br.com.arrays;

import java.util.Arrays;

public class ArraysExercicio {
		public static void main(String[] args) {
			int numeros[] = new int [] {100,4,8};
			imprimearray(numeros);
			
			String [] nomes  = new String [] {"rafael","andre","filipe"};
			Arrays.sort(nomes);
			for(String nome : nomes) {
				System.out.println(nome);
			}
			
			int [] numeral = new int [10];
			java.util.Arrays.fill(numeral, 5);
		}

		int numeros[] = new int [] {100,4,8};
		
		public static void imprimearray(int[]numeros) {
			Arrays.sort(numeros);
			for(int numero : numeros) {
				System.out.println(numero);
			}		
		}
	}

