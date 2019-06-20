
public class Cursosuperior extends Curso{
	public String diretoracademico;
	public int qtdsemestre;
	
	Cursosuperior(String xnome_dis, 
				String xnome_prof, 
				String xcarga_hor, 
				String xdiretoracademico, 
				int xqtdsemestre) 
	{
		super(xnome_dis, xnome_prof, xcarga_hor);
		this.diretoracademico = xdiretoracademico;
		this.qtdsemestre = xqtdsemestre;
	}

}
