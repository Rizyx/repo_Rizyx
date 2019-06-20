package paisefilhos;

public class Heranca {

	public static void main(String[] args) {
		
		Pai xpai = new Pai("Fabio" , "Cordeiro");
		
		filho yfilho = new filho("Filipe", "Cordeiro" , "pediatra" , "fonepedi");
		
		
		System.out.println(yfilho.letrasnome());
		System.out.println(xpai.listarnome());
		System.out.println(xpai.letrasnome());
		int somamaluca = funcao(yfilho.letrasnome(),5);
		System.out.println(funcao(yfilho.letrasnome(),5));
	}

	
		static int funcao(int a , int b) {
			return a+b;
		}
			
		
}
