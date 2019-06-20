
public class pessoafisica extends Classepessoa {

	String cpf;

	pessoafisica(String xnome, int xidade, char xsexo, String xemail, String xcpf) {
		super(xnome, xidade, xsexo, xemail);
		this.cpf = xcpf;

	}

}
