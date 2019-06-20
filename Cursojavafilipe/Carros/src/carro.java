import java.util.Scanner;

public class carro {
	Scanner ler = new Scanner(System.in);
	
	//atributos
	
	String modelo;
	String cor;
	String marca;
	int anofabricacao;
	int idade;
	
	
	carro(String xmarca, String xcor, int xanofabricacao, String xmodelo) {
		this.cor = xcor;
		this.marca = xmarca;
		this.anofabricacao = xanofabricacao;
		this.modelo = xmodelo;
		this.idade = (2019 - xanofabricacao);
	}
	
	//metodos
	
	void ExibirCarro() {
		System.out.println("meu carro é um " + this.marca);
		System.out.println("meu carro tem " + this.idade);
	}
	
}
