
public class Curso {
	
	private String nome_disciplina;
	private String nome_professor;
	private String carga_horaria;
	
	
	public String getNome_disciplina() {
		return nome_disciplina;
	}

	public void setNome_disciplina(String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}

	public String getNome_professor() {
		return nome_professor;
	}

	public void setNome_professor(String nome_professor) {
		this.nome_professor = nome_professor;
	}

	public String getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(String carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	
	
	Curso(String xnome_dis , String xnome_prof , String xcarga_hor){
		this.nome_disciplina = xnome_dis;
		this.nome_professor = xnome_prof;
		this.carga_horaria = xcarga_hor;
		
	}
	 String listar_dados() {
		return  this.nome_disciplina + "\n" + this.nome_professor + "\n" + this.carga_horaria;
	}
}
