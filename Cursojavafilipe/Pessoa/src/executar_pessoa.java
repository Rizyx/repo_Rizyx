
public class executar_pessoa {

	public static void main(String[] args) {
		
	
		pessoafisica novapessoafis = new pessoafisica("joao",25,'m',"jao@mail.com","08969379924");	
		pessoajuridica novapessoajur = new pessoajuridica("joao",25,'m',"jao@mail.com","08969379924");	
		novapessoafis.executarpessoa();
		System.out.println(novapessoafis.noticiapessoa(true) + " com " + novapessoafis.getidade() + " anos chamado " + novapessoafis.nome + " foi encontrado executado");
		novapessoajur.executarpessoa();
		System.out.println(novapessoafis.noticiapessoa(true) + " com " + novapessoafis.getidade() + " anos chamado " + novapessoafis.nome + " foi encontrado executado");
		
		} 
	
	
	}
	


