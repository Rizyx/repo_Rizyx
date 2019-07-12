package br.com.polimorfismo;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente alguem = new Gerente();
		alguem.setNomeFunc("alguem da silva");
		alguem.setSalarioFunc(1780);
		System.out.println(alguem.entradaDeFuncionario());
		System.out.println(alguem.saidaDeFuncionario());
		
		Telefonista aika = new Telefonista();
		aika.setNomeFunc("aika que da medo");
		aika.setSalarioFunc(3450);
		System.out.println(aika.entradaDeFuncionario());
		System.out.println(aika.saidaDeFuncionario());
		}
}
