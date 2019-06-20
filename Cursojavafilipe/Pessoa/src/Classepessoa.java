import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Classepessoa {

	public String nome;
	private int idade;
	public char sexo;
	protected String email;
	private Date datacadastro;
	private Date datanascimento;

	Classepessoa(String xnome, int xidade, char xsexo, String xemail) {
		this.nome = xnome;
		this.idade = xidade;
		this.sexo = xsexo;
		this.email = xemail;
		Date date = new Date();
		this.datacadastro = date;
	}

	void executarpessoa() {
		System.out.println("meu nome � " + this.nome);
		System.out.println("minha idade � " + this.idade);
		System.out.println("meu sexo � " + this.sexo);
		System.out.println("meu email � " + this.email);
	}
	public int getidade() {
		return this.idade;
	}

	String noticiapessoa(boolean inicialmai) {
		String tipopessoa;
		if (this.sexo == 'f') {
			if (this.idade < 13) {
				tipopessoa = "menina";
			} else if (this.idade < 18) {
				tipopessoa = "mo�a";
			} else {
				tipopessoa = "mulher";
			}
		} else {
			if (this.idade < 13) {
				tipopessoa = "menino";
			} else if (this.idade < 18) {
				tipopessoa = "rapaz";
			} else {
				tipopessoa = "homem";
			}
		}
		if (inicialmai)
			return tipopessoa.substring(0, 1).toUpperCase() + tipopessoa.substring(1);
		else
			return tipopessoa;

	}
	
}
