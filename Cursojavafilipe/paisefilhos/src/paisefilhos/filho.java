package paisefilhos;

public class filho extends Pai {
	
	
	String nomepediatra;
	String fonepediatra;
		
	
	filho(String xnome, String xsobrenome, String xnomepediatra, String xfonepediatra) {
		super(xnome, xsobrenome);
		this.nomepediatra = xnomepediatra;
		this.fonepediatra = xfonepediatra;
		System.out.println("instanciando classe filho");
	}			

}
