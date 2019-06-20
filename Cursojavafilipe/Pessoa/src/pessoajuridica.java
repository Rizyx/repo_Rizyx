
public class pessoajuridica extends Classepessoa {

	String cnpj;

	pessoajuridica(String xnome, int xidade, char xsexo, String xemail, String xcnpj) {
		super(xnome, xidade, xsexo, xemail);
		this.cnpj = xcnpj;

	}

}
