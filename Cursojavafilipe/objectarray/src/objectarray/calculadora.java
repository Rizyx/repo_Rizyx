package objectarray;

import java.util.Scanner;

public class calculadora {
	Scanner ler = new Scanner(System.in);
	String opera = "";
	double num1;
	double num2;
	double num3;
	double num4;
	double num5;
	double num6;
	double num7;
	double num8;
	double num9;
	double num0;
	

	
	public calculadora(double num12, String string, double num22) {

	}
	double calcular() {
		switch(this.opera) {
		case "+":
			return adiciona();
		case "-":
			return subtrai();
		case "/":
			return divisao();
		case "*":
			return multiplicar();
		default:
			return 0;
		}
	}
	double adiciona() {
		return num1 + num2;
	}
	double subtrai() {
		return num1 - num2;
	}
	double divisao() {
		return num1 / num2;
	}
	double multiplicar() {
		return num1 * num2;
	}

}

	
