package prova2questao2;

public class parente extends pessoa{
	String grauparentesco;

	public parente(String xnome, String xsobrenome, int xidade, char xsexo, String xcpf, String xgrauparentesco) {
		super(xnome, xsobrenome, xidade, xsexo, xcpf);
		this.grauparentesco = xgrauparentesco;
	}

}
