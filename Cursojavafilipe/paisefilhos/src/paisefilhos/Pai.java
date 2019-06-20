package paisefilhos;

public class Pai {
	String nome;
	String sobrenome;
	
		

	Pai(String xnome, String xsobrenome) {
		this.nome = xnome;
		this.sobrenome = xsobrenome;
		System.out.println("instanciando classe pai");
	}
	String listarnome() {		
		return this.nome + " " + this.sobrenome;
		
	}
	int letrasnome() {		
		return this.nome.length();	
	}
	
}
