package br.com.arrays;

public class MediaArray {
	public static void main(String[] args) {
	double numero[] = new double [] {100,4,8,98,88,45,66};
		mediaarray(numero);
		maior(numero);
	}
		public static void mediaarray(double[]numero){
			double media = 0;
			for (int i = 0; i < numero.length; i++) {
				media = media + numero[i];
				}
			media /= numero.length;
			System.out.println(media);
		}
		public static void maior(double[]numero) {
			double numeromaior = 0;
			for (int i = 0; i < numero.length; i++) {
				if (numeromaior <= numero[i]) {
					numeromaior = numero[i];
				}
			}
			System.out.println(numeromaior);
		}
}



